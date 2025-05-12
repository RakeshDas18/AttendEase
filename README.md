# AttendEase - 📋 A QR Code-Based Attendance Management System (Java + MySQL)

A **Java-based Attendance Management System** featuring **QR code generation and scanning** to automate attendance tracking and calculate work duration. Built entirely with **Java AWT**, integrated with **MySQL**, and developed using **NetBeans IDE**.

---

## 🚀 Key Features

- 🔐 **Admin-only login** system
- 👥 **Student/Worker registration** with details
- 📇 **QR Code generation** for each user using `qrgen`
- 📷 **QR Code scanning** via webcam to mark:
  - ✅ **Start of work**
  - 🕔 **End of work**
- ⏱️ Automatically calculates **total working hours**
- 📊 Displays **attendance records** in a table for admin review
- 💾 All records stored in **MySQL database**

---

## 🛠️ Technology Stack

- **Java (AWT)** – GUI components and application logic
- **MySQL** – Relational database for attendance and user data
- **JDBC** – Database connectivity
- **QRGen** – [net.glxn.qrgen.javase.QRCode](https://github.com/kenglxn/QRGen) for generating QR codes
- **Webcam integration** – For QR code scanning
- **NetBeans IDE** – For development

---

## 🧑‍💻 Installation & Setup

### 1. Clone the Repository

```bash
https://github.com/RakeshDas18/AttendEase.git
```

### 2. Open in NetBeans

Launch NetBeans <br>
Go to File → Open Project and select the project folder

### 3. Set Up MySQL Database

Configure your DB credentials in the config.properties file:

```java
String url = "jdbc:mysql://localhost:3306/attendance_db";
db.name = "Your_DB_Name"
String username = "root";
String password = "your_password";
```


### 5. Run the Program

- Launch the main class (Login.java)
- Login as admin
- Register users and generate QR codes
- Scan QR code twice per day:
  - At start of work
  - At end of work
- The system logs attendance and calculates work duration

---

### 🙋 Author

**Rakesh Das**  

🔗 [GitHub: @RakeshDas18](https://github.com/RakeshDas18)  
🔗 [LeetCode: @RakeshDas18](https://leetcode.com/RakeshDas18)  
🔗 [X (Twitter): @RakeshDas_18](https://twitter.com/RakeshDas_18)

### 💡 Future Enhancements

- Attendance report export to Excel or PDF
- Biometric or RFID attendance integration
