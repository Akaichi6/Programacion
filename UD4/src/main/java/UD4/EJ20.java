package UD4;

import java.util.Scanner;

public class EJ20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la inversión inicial:");
        double dinero = sc.nextDouble();
        double interes = 0.04;
        double balance1 = dinero * ((double)1.0F + interes);
        double balance2 = balance1 * ((double)1.0F + interes);
        double balance3 = balance2 * ((double)1.0F + interes);
        String ANSI_BLUE = "\u001b[34m";
        String ANSI_WHITE = "\u001b[37m";
        System.out.println(ANSI_WHITE + "Dinero invertido: " + ANSI_BLUE + dinero);
        System.out.println(ANSI_WHITE + "Interes: " + ANSI_BLUE + interes);
        System.out.println(ANSI_WHITE + "Balance año 1: " + ANSI_BLUE + balance1);
        System.out.println(ANSI_WHITE + "Balance año 2: " + ANSI_BLUE + balance2);
        System.out.println(ANSI_WHITE + "Balance año 3: " + ANSI_BLUE + balance3);
        System.out.printf(ANSI_WHITE + "Dinero invertido: %,.2f\nInteres: %.2f\nBalance año 1: %,.2f\nBalance año 2: %,.2f\nBalance año 3: %,.2f", dinero, interes, balance1, balance2, balance3);
    }
}