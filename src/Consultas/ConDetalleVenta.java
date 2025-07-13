package Consultas;

import Clases.DetalleVenta;
import Clases.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

public class ConDetalleVenta {
    List<DetalleVenta> lista;
    ConexionOracle db = new ConexionOracle();
    
    public List<DetalleVenta> ListarDetalle(int numeroVenta) {
        lista = new ArrayList<>();
        try {
            Connection cn = db.conectar();
      
            CallableStatement callableStatement = cn.prepareCall("{? = call Detallar_Venta(?)}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.setInt(2, numeroVenta);
            callableStatement.execute();
            
            ResultSet rs = (ResultSet) callableStatement.getObject(1);
            
            while (rs.next()) {
                DetalleVenta o = new DetalleVenta();
                o.setCodigoBarra(rs.getString(1));
                o.setPrecioTotal(rs.getDouble(3));
                o.setCantidad(rs.getInt(4));
                lista.add(o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }
    
    public void ingresar(DetalleVenta o){
        try{
            Connection cn = db.conectar();
            String callProcedure = "{call insertar_detalle_venta(?, ?, ?)}";
            CallableStatement callableStatement = cn.prepareCall(callProcedure);
            callableStatement.setString(1, o.getCodigoBarra());
            callableStatement.setInt(2, o.getNumeroVenta());
            callableStatement.setInt(3, o.getCantidad());

            callableStatement.execute();
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }   
    } 
}
