package UD4.EJREPTIDOS;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio:");
        double radio = sc.nextDouble();
        System.out.println("Ingrese el altura:");
        double altura = sc.nextDouble();
        double volumen = 1.0/3 * Math.PI*Math.pow(radio,2)*altura;
        System.out.printf("Volumen: %.3f",volumen);
    }
}
