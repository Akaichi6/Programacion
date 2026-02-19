package EJERCICIOS_C;

import EJERCICIOS_C.Articulo;
import EJERCICIOS_C.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("46084137A","Santiago", "Palacios", 29);
        Persona persona2 = new Persona("Raul", "Gonzalez", 12);

        // ejercicio Artículo
        //Articulo articulo1 = new Articulo("",12,120,-5);

        persona1.setNombre("Rodrigo");
        persona2.setNombre("Carlos"); persona1.setEdad(25);
        System.out.println(persona1.getNombre() + " " + persona1.getApellido()+ " "+ persona1.getDni() +" " + persona1.getEdad());
        System.out.println(persona2.getNombre() + " " + persona2.getApellido()+ " "+ persona2.getEdad());



    }

}
