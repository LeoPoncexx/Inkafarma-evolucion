package Clases;

public class Cliente {
    private int dni;
    private String apellidoPaterno, apellidoMaterno, primerNombre, segundoNombre, tercerNombre, direccion, telefono, correo;
    private char sexo, afiliacion;

    public Cliente() {
    }
    
    public Cliente(int dni, String apellidoPaterno, String apellidoMaterno, String primerNombre, String segundoNombre, String tercerNombre, String direccion, String telefono, char sexo, String correo,  char afiliacion) {
        this.dni = dni;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.tercerNombre = tercerNombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.correo = correo;

        this.afiliacion = afiliacion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getTercerNombre() {
        return tercerNombre;
    }

    public void setTercerNombre(String tercerNombre) {
        this.tercerNombre = tercerNombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(char afiliacion) {
        this.afiliacion = afiliacion;
    }
    
    
}
