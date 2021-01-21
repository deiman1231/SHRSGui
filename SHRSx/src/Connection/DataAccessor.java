package Connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import DataTypes.Patient;

public class DataAccessor {

    private Connection connection ;

    public DataAccessor(String driverClassName, String dbURL, String user, String password) throws SQLException, ClassNotFoundException {
        Class.forName(driverClassName);
        connection = DriverManager.getConnection(dbURL, user, password);
    }

    public List<Patient> getPatientList() throws SQLException{
        try (
                Statement stmnt = connection.createStatement();
                ResultSet rs = stmnt.executeQuery("select * from Patients");
        ){
            List<Patient> patientList = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("Name");
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String email = rs.getString("Email");
                Patient patient = new Patient(name, username, password, email);
                patientList.add(patient);
            }
            return patientList ;
        }
    }

    public void addPatient(Patient patient) throws SQLException {
        String fullName = patient.NameProperty().get();
        String username = patient.getUsernameProperty().get();
        String pw = patient.getPasswordProperty().get();
        String email = patient.getEmailProperty().get();

        PreparedStatement stmnt = connection.prepareStatement("insert into Patients values(?, ?, ?, ?)");
        stmnt.setString(1, fullName);
        stmnt.setString(2, username);
        stmnt.setString(3, pw);
        stmnt.setString(4, email);

        int i = stmnt.executeUpdate();
    }
}
