package EJREPTIDOS;

import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Ingrese el divisor: ");
        int divisor = sc.nextInt();
        int resto = dividendo % divisor;
        int cociente = dividendo/ divisor;

        System.out.println("El resto del dividendo es " + resto);
        System.out.println("El cociente del dividendo es " + cociente);
    }
}
