package Consultas;

import Clases.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

public class ConProducto {
    List<Producto> lista;
    ConexionOracle db = new ConexionOracle();
    
    public List<Producto> ListarTodos() {
        lista = new ArrayList<>();
        try {
            Connection cn = db.conectar();

            CallableStatement callableStatement = cn.prepareCall("{? = call obtener_vista_productos}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();
            
            ResultSet rs = (ResultSet) callableStatement.getObject(1);
            
            while (rs.next()) {
                Producto o = new Producto();
                o.setCodigoBarras(rs.getString(1));
                o.setMarca(rs.getString(2));
                o.setStockMinimo(rs.getInt(3));
                o.setStockActual(rs.getInt(4));
                o.setPrincipiosActivos(rs.getString(5));
                o.setClasificacion(rs.getString(6));
                o.setDescripcion(rs.getString(7));
                o.setNombreProducto(rs.getString(8));
                o.setPrecioVenta(rs.getDouble(9));
                o.setPrecioCompra(rs.getDouble(10));
                lista.add(o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return lista;
    }
    public void ingresar(Producto o){
        try{
            Connection cn = db.conectar();
            String callProcedure = "{call productos.alta_producto(?, ?, ?, ?, ?, ?, ?, ?, ?)}";
            CallableStatement callableStatement = cn.prepareCall(callProcedure);
            callableStatement.setString(1, o.getCodigoBarras());
            callableStatement.setString(2, o.getMarca());
            callableStatement.setInt(3, o.getStockMinimo());
            callableStatement.setString(4, o.getPrincipiosActivos());
            callableStatement.setString(5, o.getClasificacion());
            callableStatement.setString(6, o.getDescripcion());
            callableStatement.setString(7, o.getNombreProducto());
            callableStatement.setDouble(8, o.getPrecioVenta());
            callableStatement.setDouble(9, o.getPrecioCompra());

            callableStatement.execute();
            JOptionPane.showMessageDialog(null, "Producto " + o.getCodigoBarras().trim() + " insertado correctamente");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    } 
    public void editar(Producto o){
        try{
            Connection cn = db.conectar();
            String callProcedure = "{call productos.mod_producto(?, ?, ?, ?, ?, ?, ?, ?, ?)}";
            CallableStatement callableStatement = cn.prepareCall(callProcedure);
            callableStatement.setString(1, o.getCodigoBarras());
            callableStatement.setString(2, o.getMarca());
            callableStatement.setInt(3, o.getStockMinimo());
            callableStatement.setString(4, o.getPrincipiosActivos());
            callableStatement.setString(5, o.getClasificacion());
            callableStatement.setString(6, o.getDescripcion());
            callableStatement.setString(7, o.getNombreProducto());
            callableStatement.setDouble(8, o.getPrecioVenta());
            callableStatement.setDouble(9, o.getPrecioCompra());

            callableStatement.execute();
            JOptionPane.showMessageDialog(null, "Producto " + o.getCodigoBarras().trim()+ " modificado correctamente");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    public void eliminar(String o){
        try{
            Connection cn = db.conectar();
            String callProcedure = "{call productos.baja_producto(?)}";
            CallableStatement callableStatement = cn.prepareCall(callProcedure);
            callableStatement.setString(1, o);

            callableStatement.execute();
            JOptionPane.showMessageDialog(null, "Producto " + o.trim() + " eliminado correctamente");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    } 
    public List<Producto> buscar(String nombre){
        lista = new ArrayList<>();
        try{
            Connection cn = db.conectar();
            String callProcedure = "{ call PRODUCTOS_POR_NOMBRE(?, ?) }";
            CallableStatement stmt = cn.prepareCall(callProcedure);

            stmt.setString(1, nombre);

            stmt.registerOutParameter(2, OracleTypes.CURSOR);

            stmt.execute();

            ResultSet rs = (ResultSet) stmt.getObject(2);
            while (rs.next()) {
                Producto o = new Producto();
                o.setCodigoBarras(rs.getString(1));
                o.setMarca(rs.getString(2));
                o.setStockMinimo(rs.getInt(3));
                o.setStockActual(rs.getInt(4));
                o.setPrincipiosActivos(rs.getString(5));
                o.setClasificacion(rs.getString(6));
                o.setDescripcion(rs.getString(7));
                o.setNombreProducto(rs.getString(8));
                o.setPrecioVenta(rs.getDouble(9));
                o.setPrecioCompra(rs.getDouble(10));
                lista.add(o);
            }
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return lista;
    } 
    public List<Producto> filtrarPrincipio(String filtrar){
        lista = new ArrayList<>();
        try {
            Connection cn = db.conectar();
      
            CallableStatement callableStatement = cn.prepareCall("{? = call PRODUCTOS_POR_PRINCIPIO_ACTIVO(?)}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.setString(2, filtrar);
            callableStatement.execute();
            
            ResultSet rs = (ResultSet) callableStatement.getObject(1);
            
            while (rs.next()) {
                Producto o = new Producto();
                o.setCodigoBarras(rs.getString(1));
                o.setMarca(rs.getString(2));
                o.setStockMinimo(rs.getInt(3));
                o.setStockActual(rs.getInt(4));
                o.setPrincipiosActivos(rs.getString(5));
                o.setClasificacion(rs.getString(6));
                o.setDescripcion(rs.getString(7));
                o.setNombreProducto(rs.getString(8));
                o.setPrecioVenta(rs.getDouble(9));
                o.setPrecioCompra(rs.getDouble(10));
                lista.add(o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return lista;
    }
    public List<Producto> filtrarDescripcion(String filtrar){
        lista = new ArrayList<>();
        try {
            Connection cn = db.conectar();
      
            CallableStatement callableStatement = cn.prepareCall("{? = call PRODUCTOS_POR_DESCRIPCION(?)}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.setString(2, filtrar);
            callableStatement.execute();
            
            ResultSet rs = (ResultSet) callableStatement.getObject(1);
            
            while (rs.next()) {
                Producto o = new Producto();
                o.setCodigoBarras(rs.getString(1));
                o.setMarca(rs.getString(2));
                o.setStockMinimo(rs.getInt(3));
                o.setStockActual(rs.getInt(4));
                o.setPrincipiosActivos(rs.getString(5));
                o.setClasificacion(rs.getString(6));
                o.setDescripcion(rs.getString(7));
                o.setNombreProducto(rs.getString(8));
                o.setPrecioVenta(rs.getDouble(9));
                o.setPrecioCompra(rs.getDouble(10));
                lista.add(o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return lista;
    }
    
    public List<String> listaPrincipioActivo(){
        List<String> combobox = new ArrayList<>();
        combobox.add("Filtrar Principio Activo");
        try {
            Connection cn = db.conectar();
      
            CallableStatement callableStatement = cn.prepareCall("{? = call obtener_vista_principios_activos}");
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
    public List<String> listaDescripcion(){
        List<String> combobox = new ArrayList<>();
        combobox.add("Filtrar Descripcion");
        try {
            Connection cn = db.conectar();
      
            CallableStatement callableStatement = cn.prepareCall("{? = call obtener_vista_descripcion}");
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
    public List<String> listaCodigoBarra(){
        List<String> combobox = new ArrayList<>();
        combobox.add("Seleccionar");
        try {
            Connection cn = db.conectar();
      
            CallableStatement callableStatement = cn.prepareCall("{? = call obtener_vista_codigo_barras}");
            callableStatement.registerOutParameter(1, OracleTypes.CURSOR);
            callableStatement.execute();
            
            ResultSet rs = (ResultSet) callableStatement.getObject(1);
            
            while (rs.next()) {
                combobox.add(rs.getString(1).trim());
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return combobox;
    }
    
    public String nombreProducto(String codigo){
        String nombre = null;
        try {
            Connection cn = db.conectar();
            String sql = "{ ? = call PRODUCTOS.CON_PRODUCTO(?) }";
            CallableStatement stmt = cn.prepareCall(sql);
            
            stmt.setString(2, codigo);

            stmt.registerOutParameter(1, Types.VARCHAR);

            stmt.execute();

            nombre = stmt.getString(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return nombre;
    }
    
    public double precioVentaProducto(String codigo){
        double precio = 0.0;
        try {
            Connection cn = db.conectar();
            String sql = "{ ? = call PRECIO_VENTA_PRODUCTO(?) }";
            CallableStatement stmt = cn.prepareCall(sql);
            
            stmt.setString(2, codigo);

            stmt.registerOutParameter(1, Types.NUMERIC);

            stmt.execute();

            precio = stmt.getDouble(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return precio;
    }
    
    public double precioTotalProducto(String codigo, int cantidad){
        double precio = 0.0;
        try {
            Connection cn = db.conectar();
            String sql = "{ ? = call PRECIO_TOTAL_PRODUCTO(?,?) }";
            CallableStatement stmt = cn.prepareCall(sql);
            
            stmt.setString(2, codigo);
            stmt.setInt(3, cantidad);

            stmt.registerOutParameter(1, Types.NUMERIC);

            stmt.execute();

            precio = stmt.getDouble(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return precio;
    }
    
    public int stockActualProducto(String codigo){
        int stock = 0;
        try {
            Connection cn = db.conectar();
            String sql = "{ ? = call STOCK_ACTUAL_PRODUCTO(?) }";
            CallableStatement stmt = cn.prepareCall(sql);
            
            stmt.setString(2, codigo);

            stmt.registerOutParameter(1, Types.NUMERIC);

            stmt.execute();
            
            stock = stmt.getInt(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return stock;
    }
}
