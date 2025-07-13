package Clases;

public class Venta {
    private int numeroVenta, dni;
    private String codigoEmpleado;

    public Venta( int dni, String codigoEmpleado) {
        this.dni = dni;
        this.codigoEmpleado = codigoEmpleado;
    }

    public Venta() {
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
   
}
