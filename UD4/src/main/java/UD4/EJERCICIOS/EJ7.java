package UD4.EJERCICIOS;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa el tamaño de la base: ");
        double base = reader.nextDouble();
        System.out.println("Ingresa la altura:");
        double altura = reader.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El area es: " + area);
        System.out.printf("El area es (con print f): %.2f", area);
    }
}
