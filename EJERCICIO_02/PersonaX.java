package LABORATORIO_03.EJERCICIO_02;

public class PersonaX {
    // ATRIBUTOS
    // Nota: Uno de los atributos es un objeto de la clase fecha
    // Relación: Asociación
    String nombre;
    Fecha fNac;
    // CONSTRUCTOR POR DEFECTO
    public PersonaX() {
    }
    // METODO PARA ASIGNAR UN VALOR A LOS ATRIBUTOS
    // Nota: Uno de los parámetros es un objeto de la clase fecha
    // Relación: Asociación
    public void setDatos(String nombre, Fecha f) {
        this.nombre = nombre;
        fNac = f;
    }
    // METODO PARA DAR FORMATO DE SALIDA
    public String toString() {
        return nombre + " nacido el dia " + fNac.toString();
        // Nota: Se está utilizando un método de la clase Fecha
        // Relación: Dependencia
    }
}
