import java.sql.*;
import java.sql.Connection;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author supunchathuranga
 */
public class DBConnect {
    
  public static Connection dbconnect(){
        Connection con = null;
        try {
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/fms", "root", "");
       
        
    }
    catch (ClassNotFoundException | SQLException e){
        System.out.println(e);
    }
       return con; 
    }
    
}
