package Consultas;

import Clases.Cliente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

public class ConCliente {
    List<Cliente> lista;
    ConexionOracle db = new ConexionOracle();
    
    public List<Cliente> ListarTodos() {
        lista = new ArrayList<>();
        try {
            Connection cn = db.conectar();
            
            CallableStatement callableStatement = cn.prepareCall("{? = call obtener_vista_clientes}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();
            
            ResultSet rs = (ResultSet) callableStatement.getObject(1);
            
            while (rs.next()) {
                Cliente o = new Cliente();
                o.setDni(rs.getInt(1));
                o.setApellidoPaterno(rs.getString(2));
                o.setApellidoMaterno(rs.getString(3));
                o.setPrimerNombre(rs.getString(4));
                o.setSegundoNombre(rs.getString(5));
                o.setTercerNombre(rs.getString(6));
                o.setDireccion(rs.getString(7));
                o.setTelefono(rs.getString(8));
                o.setSexo(rs.getString(9).charAt(0));
                o.setCorreo(rs.getString(10));
                o.setAfiliacion(rs.getString(11).charAt(0));
                lista.add(o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return lista;
    }
    
    public void ingresar(Cliente o) {
    try {
        Connection cn = db.conectar();
        String callProcedure = "{call clientes.agregar_cliente(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
        CallableStatement callableStatement = cn.prepareCall(callProcedure);
        callableStatement.setInt(1, o.getDni());
        callableStatement.setString(2, o.getApellidoPaterno());
        callableStatement.setString(3, o.getApellidoMaterno());
        callableStatement.setString(4, o.getPrimerNombre());
        callableStatement.setString(5, o.getSegundoNombre());
        callableStatement.setString(6, o.getTercerNombre());
        callableStatement.setString(7, o.getDireccion());
        callableStatement.setString(8, o.getTelefono());
        callableStatement.setString(9, String.valueOf(o.getSexo()));
        callableStatement.setString(10, o.getCorreo());
        callableStatement.setString(11, String.valueOf(o.getAfiliacion()));

        callableStatement.execute();
            JOptionPane.showMessageDialog(null, "Cliente " + o.getDni() + " insertado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 

   public List<Cliente> buscar(int dni) {
        lista = new ArrayList<>();
        try {
            Connection cn = db.conectar();
            String callProcedure = "{ call BUSCAR_CLIENTE_POR_DNI(?, ?) }";
            CallableStatement stmt = cn.prepareCall(callProcedure);

            stmt.setInt(1, dni);

            stmt.registerOutParameter(2, OracleTypes.CURSOR);

            stmt.execute();

            ResultSet rs = (ResultSet) stmt.getObject(2);
            while (rs.next()) {
                Cliente o = new Cliente();
                o.setDni(rs.getInt(1));
                o.setApellidoPaterno(rs.getString(2));
                o.setApellidoMaterno(rs.getString(3));
                o.setPrimerNombre(rs.getString(4));
                o.setSegundoNombre(rs.getString(5));
                o.setTercerNombre(rs.getString(6));
                o.setDireccion(rs.getString(7));
                o.setTelefono(rs.getString(8));
                o.setSexo(rs.getString(9).charAt(0));
                o.setCorreo(rs.getString(10));
                
                o.setAfiliacion(rs.getString(11).charAt(0));
                lista.add(o);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista;
    }
    
    public String nombreCompletoCliente(int dni){
        String nombre = null;
        try {
            Connection cn = db.conectar();
            String sql = "{ ? = call obtener_nombre_completo(?) }";
            CallableStatement stmt = cn.prepareCall(sql);
            
            stmt.setInt(2, dni);

            stmt.registerOutParameter(1, Types.VARCHAR);

            stmt.execute();

            nombre = stmt.getString(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return nombre;
    }
    
    public String afiliadoCliente(int dni){
        String afiliado = null;
        try {
            Connection cn = db.conectar();
            String sql = "{ ? = call afiliado_cliente(?) }";
            CallableStatement stmt = cn.prepareCall(sql);
            
            stmt.setInt(2, dni);

            stmt.registerOutParameter(1, Types.VARCHAR);

            stmt.execute();

            afiliado = stmt.getString(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return afiliado;
    }
    
    public List<String> listaDni(){
        List<String> combobox = new ArrayList<>();
        combobox.add("Seleccionar");
        try {
            Connection cn = db.conectar();
      
            CallableStatement callableStatement = cn.prepareCall("{? = call obtener_vista_dni}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();
            
            ResultSet rs = (ResultSet) callableStatement.getObject(1);
            
            while (rs.next()) {
                combobox.add(rs.getString(1));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return combobox;
    }
}
