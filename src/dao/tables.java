/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author LENOVO
 */
public class tables {
    public static void main(String[] args){
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            
        }
    }
    
    private static boolean tableExists(Statement st, String tableName) throws Exception {
        ResultSet resultSet = st.executeQuery("SHOW TABLES LIKE '" + tableName + "'");
        return resultSet.next();
    }
    
}
