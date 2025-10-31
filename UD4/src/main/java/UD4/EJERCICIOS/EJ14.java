package UD4.EJERCICIOS;

import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero donde quieres que se termine la operacion: ");
        int num = sc.nextInt();
        int suma = (num * (num + 1 ) / 2);
        System.out.println(" la solucion de de la suma hasta el numero introducido es(Println): " + suma);
        System.out.printf("la solucion de de la suma hasta el numero introducido es(Println): %d\n", suma);
    }

}

