package PRACTICA.NIVEL1_BASICO;

import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una distancia en millas (El numero debe de ser entero): ");
        int distancia_millas = sc.nextInt();

        System.out.println("La distancia en km es: " + millas_a_kilometros(distancia_millas));
    }
    public static double millas_a_kilometros(int millas) {
        return millas *  1.60934;

    }
}
