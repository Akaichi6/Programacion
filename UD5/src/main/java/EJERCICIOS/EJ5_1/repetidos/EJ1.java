package EJERCICIOS.EJ5_1.repetidos;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdice tu edad: ");
        int edad = sc.nextInt();
        int contador = edad;

        while (edad == contador) {

            if (edad < 0){
            System.err.println("Error, la edad no puede ser negativa");
                System.out.println("Introduce tu edad:");
                edad = sc.nextInt();
                if (edad <18 ) {
                    System.out.println("Eres menor de edad, tienes menos de 18 años");
                } else if (edad >= 18) {

                    System.out.println("Eres mayor dde edad tienes mas de 18 años");
                }

        } else if (edad <18 ) {
            System.out.println("Eres menor de edad, tienes menos de 18 años");
        } else if (edad >= 18) {

            System.out.println("Eres mayor dde edad tienes mas de 18 años");
        }
            contador++;
        }
    }
}
