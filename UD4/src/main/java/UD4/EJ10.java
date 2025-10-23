package UD4;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el numero: ");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        System.out.println("El resultado es: "+suma);
        System.out.println("El resultado es: "+resta);
        System.out.println("El resultado es: "+multiplicacion);
        System.out.println("El resultado es: "+division);




    }
}
