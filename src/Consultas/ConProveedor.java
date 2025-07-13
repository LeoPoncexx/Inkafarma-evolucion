package Consultas;

import Clases.Proveedor;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

public class ConProveedor {
    List<Proveedor> lista;
    ConexionOracle db = new ConexionOracle();
    
    public List<Proveedor> ListarTodos() {
        lista = new ArrayList<>();
        try {
            Connection cn = db.conectar();

            CallableStatement callableFunction = cn.prepareCall("{? = call obtener_vista_proveedores}");
            callableFunction.registerOutParameter(1, OracleTypes.CURSOR);
            callableFunction.execute();

            ResultSet rs = (ResultSet) callableFunction.getObject(1);
            
            while (rs.next()) {

                Proveedor o = new Proveedor();
                o.setRuc(rs.getString(1));
                o.setNombre(rs.getString(2));
                o.setTelefono(rs.getString(3));
                o.setDireccion(rs.getString(4));
                lista.add(o);
            }

            rs.close();
            callableFunction.close();
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return lista;      
    }
    
    public void Actualizar_laboratorio(long ruc, String nuevoNombre){
    try {
            Connection cn = db.conectar();
            CallableStatement callableStatement = cn.prepareCall("{call Actualizar_NombreLaboratorio(?, ?)}");
            callableStatement.setLong(1, ruc); 
            callableStatement.setString(2, nuevoNombre); 
            callableStatement.execute();
            callableStatement.close();
            cn.close();
            JOptionPane.showMessageDialog(null, "Laboratorio actualizado correctamente");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar el laboratorio: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
