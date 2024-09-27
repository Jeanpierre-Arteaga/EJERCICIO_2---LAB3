package LABORATORIO_03.EJERCICIO_02;

public class Fecha {
    // ATRIBUTOS
    private int dd;
    private int mm;
    private int aaaa;
    // CONSTRUCTOR QUE CREA UNA FECHA INICIAL
    public Fecha() {
        dd = 1;
        mm = 1;
        aaaa = 1997;
    }
    // CONSTRUCTOR EN EL QUE SE INGRESA CADA PARAMETRO
    public Fecha(int dia, int mes, int anio) {
        dd=dia;
        mm=mes;
        aaaa=anio;
    }
    // METODO PARA DAR UN FORMATO DE SALIDA 
    public String toString() {
        return dd + "/" + mm + "/" + aaaa;
    }
}