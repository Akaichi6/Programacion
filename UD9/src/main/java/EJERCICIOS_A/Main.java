package EJERCICIOS_A;

public class Main {
    public static void main(String[] args) {

        //persona

        Persona persona1 = new Persona();
        persona1.dni= "46084137A";
        persona1.nombre= "Juan";
        persona1.apellido= "Perez";
        persona1.edad= 12;

        Persona persona2 = new Persona();
        persona2.dni= "46084137B";
        persona2.nombre= "Azucena";
        persona2.apellido= "Lujan Garcia";
        persona2.edad= 25;

        if (persona1.edad>=18){
            System.out.println(persona1.nombre + " " + persona1.apellido + " " + "con dni " + persona1.dni + " Es mayor de edad." );
        }else {
            System.out.println(persona1.nombre + " " + persona1.apellido + " " + "con dni " + persona1.dni + " No es mayor de edad." );
        }

        if (persona2.edad>18){
            System.out.println(persona2.nombre + " " + persona2.apellido + " " + "con dni " + persona2.dni + " Es mayor de edad.");
        }else {
            System.out.println(persona2.nombre + " " + persona2.apellido + " " + "con dni " + persona2.dni + " No es mayor de edad.");
        }

        // articulo

        Articulo  articulo1 = new Articulo();
        articulo1.nombreArticulo= "Detergente";
        articulo1.precio= 10;
        articulo1.iva=21 ;
        articulo1.cuantosQedan = 50;
        double pvp = ((articulo1.precio * articulo1.iva)/100) + articulo1.precio ;

        System.out.println("Articulo: "+articulo1.nombreArticulo + " | " + "Precio:" + articulo1.precio + " | " + "Iva:" + articulo1.iva + "% " + "Pvp:" + pvp + "€");
    }
}