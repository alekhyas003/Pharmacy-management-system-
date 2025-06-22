/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author alekh
 */
public class Tables {
    public static void main(String[] args){
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
           //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),email varchar(200), username varchar(200),password varchar(50))");
            st.executeUpdate("insert into appuser (userRole, email, username, password) values ('doctor','admin@email.com', 'admin', 'admin')");
            JOptionPane.showMessageDialog(null,"Table Create Successfully");
            
            st.executeUpdate("CREATE TABLE MedicalCentre01 (docMedName VARCHAR(255),doctorNHSNo int(50),firstName VARCHAR(255),lastName VARCHAR(255), medicalCentreName VARCHAR(255),patient_ID INT (50), centreAddress VARCHAR(255), postCode int(20),medicalCentreRef int(50), officeNumber1 int(20),officeNumber2 int(20), faxNo int(20), emailAddress VARCHAR(255), patientNHSNo int(50), emisNo int(50), gpAppointmentRef int(50))");
            JOptionPane.showMessageDialog(null, "MedicalCentre Table Created Successfully");

            // Close the statement and connection
            st.close();
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
}
