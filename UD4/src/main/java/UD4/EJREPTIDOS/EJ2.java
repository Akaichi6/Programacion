package UD4.EJREPTIDOS;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de la tabla que quiere multiplicar: ");
        int numero = sc.nextInt();
        int x1 = numero;
        int x2 = numero*2;
        int x3 = numero*3;
        int x4 = numero*4;
        int x5 = numero*5;
        int x6 = numero*6;
        int x7 = numero*7;
        int x8 = numero*8;
        int x9 = numero*9;
        int x10 = numero*10;
        System.out.println("EL numero elegido es: "+numero);
        System.out.println(numero + " x 1 ="+x1);
        System.out.println(numero + " x 2 ="+x2);
        System.out.println(numero + " x 3 ="+x3);
        System.out.println(numero + " x 4 ="+x4);
        System.out.println(numero + " x 5 ="+x5);
        System.out.println(numero + " x 6 ="+x6);
        System.out.println(numero + " x 7 ="+x7);
        System.out.println(numero + " x 8 ="+x8);
        System.out.println(numero + " x 9 ="+x9);
        System.out.println(numero + " x 10 ="+x10);
    }
}
