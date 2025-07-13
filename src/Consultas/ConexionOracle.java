package Consultas;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionOracle {
    private Connection conn = null;
    private String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private String user = "system";
    private String pass = "stheph";
    
    public Connection conectar(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, no se pudo conectar");
        }
        return conn;
    }
    
}
