package UD4.EJERCICIOS;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa el valor del numero de la tabla de multiplicar : ");
        int numero = reader.nextInt();
        System.out.println("Usando Println: ");
        System.out.println(numero + "x 1 = " + numero * 1);
        System.out.println(numero + "x 2 = " + numero * 2);
        System.out.println(numero + "x 3 = " + numero * 3);
        System.out.println(numero + "x 4 = " + numero * 4);
        System.out.println(numero + "x 5 = " + numero * 5);
        System.out.println(numero + "x 6 = " + numero * 6);
        System.out.println(numero + "x 7 = " + numero * 7);
        System.out.println(numero + "x 8 = " + numero * 8);
        System.out.println(numero + "x 9 = " + numero * 9);
        System.out.println(numero + "x 10 = " + numero * 10);

        System.out.printf("Usando Printf:\n");
        System.out.printf("%1$d x 1 = %2$d\n%1$d x 2= %3$d\n%1$d x 3= %4$d\n%1$d x 4 = %5$d\n%1$d x 5 = %6$d\n%1$d x 6 = %7$d\n%1$d x 7 = %8$d\n%1$d x 8 = %9$d\n%1$d x 9 = %10$d\n%1$d x 10 = %11$d",numero,numero*1,numero*2, numero*3, numero*4, numero*5, numero*6, numero*7, numero*8, numero*9,numero*10);
    }

}
