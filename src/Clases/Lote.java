package Clases;

import java.util.Date;

public class Lote {
    private String numeroLote, codigoBarras;
    private int cantidad;
    private Date fechaVencimiento, fechaFabricacion;

     public Lote(String numeroLote, int cantidad, Date fechaFabricacion, Date fechaVencimiento,  String codigoBarras) {
        this.numeroLote = numeroLote;
        this.cantidad = cantidad;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoBarras = codigoBarras;
    }

    public Lote() {
    }
     
    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }
    
}
