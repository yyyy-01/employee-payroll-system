/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll.system;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class database {
    
    Connection conn = null;
    public static Connection java_database(){
        
        try{
            
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\O M E N\\Documents\\NetBeansProjects\\Employee Payroll System\\database.sqlite");
            return conn;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
