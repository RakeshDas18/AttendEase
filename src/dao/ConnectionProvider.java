package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConnectionProvider {
    
    private static String DB_NAME;
    private static String DB_URL;
    private static String DB_USERNAME;
    private static String DB_PASSWORD;

    static {
        Properties properties = new Properties();
        try (FileInputStream inputStream = new FileInputStream("config.properties")) {
            properties.load(inputStream);
            DB_URL = properties.getProperty("db.url");
            DB_NAME = properties.getProperty("db.name");
            DB_USERNAME = properties.getProperty("db.username");
            DB_PASSWORD = properties.getProperty("db.password");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load database configuration.");
        }
    }

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(DB_URL + "?useSSL=false", DB_USERNAME, DB_PASSWORD);
            if (!databaseExists(con, DB_NAME)) {
                createDatabase(con, DB_NAME);
            }
            con = DriverManager.getConnection(DB_URL + "/" + DB_NAME + "?useSSL=false", DB_USERNAME, DB_PASSWORD);
            return con;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private static boolean databaseExists(Connection con, String dbName) throws Exception {
        Statement stmt = con.createStatement();
        return stmt.executeQuery("SHOW DATABASES LIKE '" + dbName + "'").next();
    }

    private static void createDatabase(Connection con, String dbName) throws Exception {
        Statement stmt = con.createStatement();
        stmt.executeUpdate("CREATE DATABASE " + dbName);
        System.out.println("Database '" + dbName + "' created successfully!");
    }
}
