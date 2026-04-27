package UD5;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par");
        }else  {
            System.out.println("El numero " + num + "  es impar");
        }
    }
}
