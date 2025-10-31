package UD4.EJREPTIDOS;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del lado del cuadrado:");
        double lado = sc.nextDouble();
        double area = lado * lado;
        System.out.println("Area: " + area);

    }
}
