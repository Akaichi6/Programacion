package EJREPTIDOS;

import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingresa las millas: ");
        double millas = sc.nextDouble();
        double metros = 1852;
        double solucion = millas * metros;
        System.out.printf("El solucion es: %,.0f\n",solucion);

    }
}
