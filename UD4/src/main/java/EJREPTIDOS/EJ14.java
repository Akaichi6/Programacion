package EJREPTIDOS;

import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero Entero : ");
        int numero = sc.nextInt();
        int suma = (numero*(numero + 1))/2;
        System.out.println("La suma de los primeros numeros enteros desde 1 hasta " + numero + " es " + suma);
    }
}
