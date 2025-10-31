package UD4.EXTRA;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero decimal que usted quiera: ");
        double decimal=sc.nextDouble();
        int entero= (int)decimal;
        double partedecimal = decimal - entero;
        String entero_ = String.valueOf(entero);
        char parte1 = entero_.charAt(0);

        String parte1_ = String.valueOf(parte1);
        char parte2 = entero_.charAt(1);
        String parte2_ = String.valueOf(parte2);
        char parte3 = entero_.charAt(2);
        String parte3_ = String.valueOf(parte3);
       // int suma = parte1_+ parte2_ + parte3_;
        System.out.println("El nunero decimal es: " + decimal);
        System.out.printf("La parte deceimal : %.3f", partedecimal);
        System.out.println("La parte entera: "+ entero);
        //System.out.println("La suma de digitos de la parte entera es: "+ suma);




    }
}
