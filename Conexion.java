/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoFinal;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author luiis
 */
public class Conexion {
    
    
    public static Connection getConexion()
    {

        String url = "jdbc:sqlserver://localhost:1433;"
                + "database = TAP;"
                + "user = Luis;"
                + "password = Angeliitoo13;"
                + "loginTimeout = 30;";
        
        
        try
        {
            Connection con = DriverManager.getConnection(url);
          
            return con;

        }
        catch(SQLException E)
        {
            System.out.println("Error: " + E.toString());
            return null;
        }
       
    
    }
    
}





















