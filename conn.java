package HospitalManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    public Connection connection;
    public Statement statement;

    public conn() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management_system", "root", "@Babajii123");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
