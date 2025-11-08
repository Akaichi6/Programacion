package EJERCICIOS;

import java.util.Scanner;

public class EJ12CHAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Genero (H/M): ");
        String genero = sc.nextLine().toUpperCase();

        // Sacamos solo la inicial del nombre
        String inicial = nombre.substring(0,1).toUpperCase();

        boolean grupoA = false;

        if (genero.equals("M")) { // mujer
            if (inicial.compareTo("M") <= 0) {
                grupoA = true;
            }
        } else if (genero.equals("H")) { // hombre
            if (inicial.compareTo("N") >= 0) {
                grupoA = true;
            }
        }

        if (grupoA) {
            System.out.println("Pertenece al grupo A");
        } else {
            System.out.println("Pertenece al grupo B");
        }
    }
}


