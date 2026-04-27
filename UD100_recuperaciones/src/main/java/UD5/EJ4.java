package UD5;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 numeros");
        System.out.print("numero 1: ");
        int num1 = sc.nextInt();
        System.out.print("numero 2: ");
        int num2 = sc.nextInt();
        System.out.print("numero 3: ");
        int num3 = sc.nextInt();

        if (num2>num1){
            if (num2>num3){
                System.out.println("El numero 2 es el mayor");
            }else
                System.out.println("El numero 3 es el mayor");
        }else if (num1>num2){
            if (num1>num3){
                System.out.println("El numero 1 es el mayor");
            }else
                System.out.println("El numero 3 es el mayor");
        }else if (num3>num1){
            if (num3>num2){
                System.out.println("El numero 3 es el mayor");
            }
        }
    }
}
