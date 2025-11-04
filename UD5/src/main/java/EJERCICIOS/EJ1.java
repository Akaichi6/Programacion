package EJERCICIOS;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        if (edad >=18 && edad <= 120){
            System.out.println("Eres mayor de edad");
        }
        else if (edad<=0){
            System.err.println("error");
        }


    }
}
