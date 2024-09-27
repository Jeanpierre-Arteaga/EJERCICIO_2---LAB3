package LABORATORIO_03.EJERCICIO_02;

public class TPersonaX {
    public static void main(String[] args) {
        // INSTANCIACION DE UN OBJETO DE LA CLASE PERSONAX POR DEFECTO
        PersonaX p = new PersonaX();
        
        // INSTANCIACION DE UN OBJETO DE LA CLASE FECHA CON PARAMETROS
        Fecha n=new Fecha(5,9,1946);

        /* UTILIZANDO EL METODO SETDATOS DE LA CLASE PERSONA
           PARA ASIGNAR UN NOMBRE Y LA FECHA CREADA PREVIAMENTE */
        p.setDatos("Freddy Mercury", n);

        /* IMPRIMIENDO AMBOS OBJETOS CREADOS
           Nota_1: SE IMPRIME SOLO EL ATRIBUTO NOMBRE DEL OBJETO PERSONAX
           Nota_2: SE UTILIZA EL METODO TOSTRING DE LA CLASE FECHA PARA
                   IMPRIMIR EL OBJETO FECHA CREADO 
            Relación: Dependencia */
        System.out.println(p.nombre+" "+"nacio el "+n.toString());
    }
}