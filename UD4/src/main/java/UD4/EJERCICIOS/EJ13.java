package UD4.EJERCICIOS;

import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la distancia en millas: ");
        double millas = sc.nextDouble();
        double metros = millas * 1852;
        System.out.println("La distancia en metros es (Println): " + metros);
        System.out.printf("La distancia en metros es: %.3f", metros);
    }
}
