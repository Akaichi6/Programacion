package EJERCICIOS;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce un numero");
        double num2 = sc.nextDouble();
        System.out.println("Introduce un numero");
        double num3 = sc.nextDouble();

        if (num1>num2 && num1>num3){
            System.out.println(" El numero" + num1 + " es el mayor");

        }else if (num2>num1 && num2>num3){
            System.out.println(" El numero" + num2 + " es el mayor");
        }else {
            System.out.println(" El numero" + num3 + " es el mayor");
        }

        //else if (num3>num1 && num3>num2){
            //System.out.println(" El numero" + num3 + " es el mayor");
        }
    }

