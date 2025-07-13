package Clases;

public class IniciarSesion {
    private static String codigo;
    private static String correo;

    public static void ingresar(String ccorreo, String ccodigo) {
        correo = ccorreo;
        codigo = ccodigo;
    }

    public static String getCodigo() {
        return codigo;
    }

    public static void setCodigo(String codigo) {
        IniciarSesion.codigo = codigo;
    }

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        IniciarSesion.correo = correo;
    }
    
    public static void cerrar() {
        codigo = null;
        correo = null;
    }
}
