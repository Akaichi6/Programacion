package UD4.EXTRA;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero decimal: ");
        double decimal = sc.nextDouble();
        int entero = (int)decimal;
        double partdecimal = (double) decimal - entero;
        System.out.println(entero);
        System.out.printf("%.3f",partdecimal);
        String parte1 = String.valueOf(entero);
        char p = parte1.charAt(0);
        String s = String.valueOf(p);
        int s_ = Integer.parseInt(s);
        System.out.println(p);
        System.out.println(parte1);
    }


}
