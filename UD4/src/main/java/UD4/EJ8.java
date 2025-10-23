package UD4;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner re = new Scanner(System.in);
        System.out.println("Ingresa el radio: ");
        double radio = re.nextDouble();
        System.out.println("Ingresa el altura: ");
        double altura = re.nextDouble();
        double pi = Math.PI;
        double volumen = 1/3.0 * pi * Math.pow(radio,2)*altura;
        System.out.println("El volumen es: "+volumen);
    }
}
