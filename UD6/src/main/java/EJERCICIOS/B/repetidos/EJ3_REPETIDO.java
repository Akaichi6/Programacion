package EJERCICIOS.B.repetidos;

import java.util.Scanner;

public class EJ3_REPETIDO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("introduce tu nombre: ");
        String nombre = input.nextLine().toUpperCase();
        System.out.println("introduce tu primer apellido: ");
        String apellido1 = input.nextLine().toUpperCase();
        System.out.println("introduce tu segundo apellido: ");
        String apellido2 = input.nextLine().toUpperCase();

        String parte1 = nombre.substring(0,3);
        String parte2 = apellido1.substring(0,3);
        String parte3 = apellido2.substring(0,3);

        System.out.println(parte1+parte2+parte3);
    }
}
