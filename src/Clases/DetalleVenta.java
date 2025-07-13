package Clases;

import java.util.Date;

public class DetalleVenta {
    private String codigoBarra;
    private int numeroVenta, cantidad;
    private double precioTotal;
    private Date fechaVenta;

    public DetalleVenta(String codigoBarra, int numeroVenta, int cantidad, double precioTotal, Date fechaVenta) {
        this.codigoBarra = codigoBarra;
        this.numeroVenta = numeroVenta;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
        this.fechaVenta = fechaVenta;
    }
    
    public DetalleVenta(String codigoBarra, int cantidad) {
        this.codigoBarra = codigoBarra;
        this.cantidad = cantidad;

    }

    public DetalleVenta() {
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
}
