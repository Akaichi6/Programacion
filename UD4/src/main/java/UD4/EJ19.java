package UD4;

import java.util.Scanner;

public class EJ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad que desea invertir: ");
        double cantidad = sc.nextDouble();
        System.out.println("Introduce el interés a aplicar(En %): ");
        double intereses = sc.nextDouble();
        System.out.println("Introduce la duración de la iniversión(En meses):");
        double duracion = sc.nextDouble();
        double interes2 = intereses / 100.0;
        double anyos = duracion / 12.0;
        double rendimiento = cantidad * interes2 * anyos;
        System.out.println("El rendimiento es: " + rendimiento);

    }
}
