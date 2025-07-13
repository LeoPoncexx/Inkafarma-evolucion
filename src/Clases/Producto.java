package Clases;

public class Producto {
    private String codigoBarras, marca, principiosActivos, clasificacion, descripcion, nombreProducto;
    private int stockMinimo, stockActual;
    private double precioVenta, precioCompra;

    public Producto(String codigoBarras, String marca, String principiosActivos, String clasificacion, String descripcion, String nombreProducto, int stockMinimo, int stockActual, double precioVenta, double precioCompra) {
        this.codigoBarras = codigoBarras;
        this.marca = marca;
        this.principiosActivos = principiosActivos;
        this.clasificacion = clasificacion;
        this.descripcion = descripcion;
        this.nombreProducto = nombreProducto;
        this.stockMinimo = stockMinimo;
        this.stockActual = stockActual;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        
    }

    public Producto() {
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrincipiosActivos(String principiosActivos) {
        this.principiosActivos = principiosActivos;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public String getMarca() {
        return marca;
    }

    public String getPrincipiosActivos() {
        return principiosActivos;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public int getStockActual() {
        return stockActual;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }
    
    
}
