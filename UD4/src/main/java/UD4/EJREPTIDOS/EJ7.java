package UD4.EJREPTIDOS;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la Base del triangulo: ");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura del triangulo:");
        double altura = sc.nextDouble();
        double area = (base * altura)/2;
        System.out.println("Area: " + area);
    }
}
