package EJERCICIOS.B.repetidos;

import java.util.Scanner;

public class EJ7_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un precio: ");
        String precio = sc.nextLine();

        String [] partes = precio.split(",");

        System.out.println("euros: " + partes[0]);
        System.out.println("precio: " + partes[1]);

    }
}
