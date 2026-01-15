package EJERCICIOS.B;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine().toLowerCase();
        System.out.println("Introduce una frase: ");
        String frase2 = sc.nextLine().toLowerCase();

        if(frase.equals(frase2)){
            System.out.println("las frases son iguales");

        }else {
            System.out.println("las frases son diferentes");
        }



    }
}
