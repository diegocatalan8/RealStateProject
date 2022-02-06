
package Connecion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    //Parametros
    private final String url= "jdbc:postgresql://localhost:5432/casas";
    private final String user="postgres";
    private final String password="miumg";
    //metodo de la clase Connection
    public Connection connect(){
        //creamos el objeto
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Coneccion satisfactoria");
        }
        catch(SQLException e){
            System.out.println("Coneccion Fallida");
            System.out.println(e.getMessage());
        }
        return conn;
        
    }
}
