package UD4.EJERCICIOS;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del lado: ");
        double lado = reader.nextDouble();
        double area = lado * lado;
        System.out.printf("%.2f",area);
    }
}
