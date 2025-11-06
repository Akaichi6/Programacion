package EJERCICIOS;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que edad tienes?");
        int edad = sc.nextInt();

        System.out.println("¿Cuales son tus ingesos mensuales?");
        double ingesos = sc.nextDouble();

        if (edad > 16 && ingesos >= 1000) {
            System.out.println("tributa");
        } else {
            System.out.println("No tributa");

        }


    }
}
