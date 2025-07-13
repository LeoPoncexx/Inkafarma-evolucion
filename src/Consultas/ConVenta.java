package Consultas;

import Clases.Venta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

public class ConVenta {
    List<Venta> lista;
    ConexionOracle db = new ConexionOracle();
    
    public List<Venta> ListarTodos() {
        lista = new ArrayList<>();
        try {
            Connection cn = db.conectar();
            
            CallableStatement callableStatement = cn.prepareCall("{? = call obtener_vista_ventas}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();
            
            ResultSet rs = (ResultSet) callableStatement.getObject(1);
            
            while (rs.next()) {
                Venta o = new Venta();
                o.setNumeroVenta(rs.getInt(1));
                o.setCodigoEmpleado(rs.getString(2));
                o.setDni(rs.getInt(3));
                lista.add(o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return lista;
    }
    
    
    public int ingresar(Venta o){
        int numeroVenta = 0;
        try{
            Connection cn = db.conectar();
            CallableStatement stmt = cn.prepareCall("{ call insertar_venta(?, ?, ?) }");

            stmt.setString(1, o.getCodigoEmpleado());
            stmt.setInt(2, o.getDni());
            stmt.registerOutParameter(3, java.sql.Types.NUMERIC); // Parámetro de salida

            stmt.execute();

            numeroVenta = stmt.getInt(3);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return numeroVenta;
    }
}
