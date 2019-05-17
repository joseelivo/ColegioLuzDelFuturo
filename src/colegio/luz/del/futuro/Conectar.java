//Creamos la clase conectar 
package colegio.luz.del.futuro;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author jose_
 */
public class Conectar {
    
    Connection conn;
    Statement st;
    
    public Connection conexion () {
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/colegio","root","");
            System.out.println("La conecxion fue exitosa");
        }
        catch (ClassNotFoundException | SQLException e){
        
            System.out.println(e.getMessage()); 
        }
        
        return conn;
        
    }
     Statement createStatement (){
         throw new UnsupportedOperationException ("No soportado");
     }
}
   