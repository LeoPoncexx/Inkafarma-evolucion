package Consultas;

import Clases.Lote;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

public class ConLote {
    List<Lote> lista;
    ConexionOracle db = new ConexionOracle();
    
    public List<Lote> ListarTodos() {
        lista = new ArrayList<>();
        try {
            Connection cn = db.conectar();
            CallableStatement callableStatement = cn.prepareCall("{? = call obtener_vista_lote}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();
            
            ResultSet rs = (ResultSet) callableStatement.getObject(1);
            
            while (rs.next()) {
                Lote o = new Lote();
                o.setNumeroLote(rs.getString(1));
                o.setCantidad(rs.getInt(2));
                o.setFechaFabricacion(rs.getTimestamp(3));
                o.setFechaVencimiento(rs.getTimestamp(4));
                o.setCodigoBarras(rs.getString(5));
                lista.add(o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }
    
    public void ingresar(Lote lote) {
        try {
            Connection cn = db.conectar();
            String callProcedure = "{call lotes.alta_lote(?, ?, ?, ?, ?)}";
            CallableStatement callableStatement = cn.prepareCall(callProcedure);
            callableStatement.setString(1, lote.getNumeroLote());
            callableStatement.setInt(2, lote.getCantidad());
            callableStatement.setDate(3, new java.sql.Date(lote.getFechaFabricacion().getTime()));
            callableStatement.setDate(4, new java.sql.Date(lote.getFechaVencimiento().getTime()));
            callableStatement.setString(5, lote.getCodigoBarras());

            callableStatement.execute();
            JOptionPane.showMessageDialog(null, "Lote insertado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public List<Lote> buscar(String numeroLote){
        lista = new ArrayList<>();
        try{
            Connection cn = db.conectar();
            String callProcedure = "{ call LOTES_POR_NUMERO(?, ?) }";
            CallableStatement stmt = cn.prepareCall(callProcedure);

            stmt.setString(1, numeroLote);
            stmt.registerOutParameter(2, OracleTypes.CURSOR);

            stmt.execute();

            ResultSet rs = (ResultSet) stmt.getObject(2);
            while (rs.next()) {
                Lote lote = new Lote();
                lote.setNumeroLote(rs.getString(1));
                lote.setCantidad(rs.getInt(2));
                lote.setFechaFabricacion(rs.getDate(3));
                lote.setFechaVencimiento(rs.getDate(4));
                lote.setCodigoBarras(rs.getString(5));
                lista.add(lote);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista;
    }
}
