package PRACTICA.NIVEL1_BASICO;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero: ");
        int numero1 = sc.nextInt();

        System.out.println("introduce un numero: ");
        int numero2 = sc.nextInt();

        System.out.println("El numero minimo de " + numero1 + " y " + numero2 + " es el número " + minimo(numero1, numero2));

    }

    public static int minimo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }
}

