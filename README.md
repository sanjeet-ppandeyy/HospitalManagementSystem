🏥 Hospital Management System

A Java Swing + MySQL-based Hospital Management System for managing patient records, doctor details, appointments, and billing. The application features a user-friendly interface and uses JDBC for database interaction.

🛠️ Technologies Used

Java (Swing) – GUI

MySQL – Backend database

JDBC – Database connectivity

Object-Oriented Programming


ScreenShorts of the Project

Login – Login.java
![](https://github.com/sanjeet-ppandeyy/HospitalManagementSystem/blob/main/Screenshot%202025-05-21%20121154.png)


🏠 Home – Home.java
Main dashboard that navigates to all features: patients, doctors, appointments, and billing.


👨‍⚕️ Add Patient – Patient.java
Add new patient with name, age, gender, disease, etc.


📋 View Patients – Patient.java
View all patient data in a table with update/delete options.


👩‍⚕️ Add Doctor – Doctor.java
Register doctors with name, specialization, and schedule.


🕒 Appointment – Appointment.java
Schedule appointments between doctors and patients.


💳 Billing – Billing.java
Generate bills with patient name, services, and cost.


🗃️ Database – MySQL
All records are stored in MySQL with proper table relationships.


✅ Confirmation Popups
User-friendly success messages on order placement, login, and billing.


📦 How to Run
Set up MySQL Database

Create database and tables manually or via script

Open Project in Java IDE

NetBeans, IntelliJ, Eclipse, etc.

Configure JDBC Connection

Add MySQL JDBC driver to project libraries

Run the App

bash
Copy
Edit
javac *.java
java Login
🔑 Login Credentials (Sample)
text
Copy
Edit
Username: admin
Password: admin123
These credentials are stored in the database. You can modify them directly via SQL.
