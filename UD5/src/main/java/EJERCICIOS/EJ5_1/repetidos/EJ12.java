package EJERCICIOS.EJ5_1.repetidos;

import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Definimos el nombre del alumno
        System.out.println("¿Cual es tu nombre?");
        String nombre = sc.next();

        // Definimos el genero del alumno
        System.out.println("¿Cual es tu genero (introduce H si eres hombre y M si eres mujer)");
        String genero = sc.next();
        genero = genero.toUpperCase();
        nombre = nombre.toUpperCase();

        // Definimos las constantes y las variables
        final char INICIAL_GRUPO_A = 'M';
        final char INICIAL_GRUPO_B = 'N';
        char inicial_nombre = nombre.charAt(0);

        //determinamos el grupo al que va a pertenecer
        if (inicial_nombre <= INICIAL_GRUPO_A && genero.equals("M"))
        {
            System.out.println("Tu grupo es el A");

        }
        else if (inicial_nombre >= INICIAL_GRUPO_B && genero.equals("H"))
        {
            System.out.println("Tu grupo es el A");
        }
        else
        {
            System.out.println(" Tu grupo es el B");
        }


    }
}
