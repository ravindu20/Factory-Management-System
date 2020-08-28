
package foods.dbonnection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gajeendra
 */
public class Dbconnect {
    
    public static Connection connec(){
       
        
     Connection conn = null;
     
     try{
         Class.forName("com.mysql.jdbc.Driver");
         conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/fms","root","");
     
     }
     
     catch(ClassNotFoundException | SQLException e){
         
         System.out.println(e);
     }
         
        
        return conn;
    }
}
