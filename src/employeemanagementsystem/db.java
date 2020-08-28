/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Home
 */
public class db {
    
    Connection conn =  null;
    public static Connection java_db(){
    
     try{
     
         Class.forName("com.mysql.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/fms","root","");
         return conn;
     
     }catch (Exception e) {
     
         JOptionPane.showMessageDialog(null,e);
         return null;
     
     }
    
    
    
    }
    
    
    
    
}
