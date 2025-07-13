package Consultas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import javax.swing.JOptionPane;


public class ConEmpleado {
    ConexionOracle db = new ConexionOracle();
    
    public boolean verificar(String correo, String codigo){
        boolean verificado = false;
        try {
            Connection cn = db.conectar();
            String sql = "{ ? = call verificar_empleado(?,?) }";
            CallableStatement stmt = cn.prepareCall(sql);
            
            stmt.setString(2, codigo);
            stmt.setString(3, correo);

            stmt.registerOutParameter(1, Types.INTEGER);

            stmt.execute();

            verificado = (stmt.getInt(1) == 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return verificado;
    }
}
