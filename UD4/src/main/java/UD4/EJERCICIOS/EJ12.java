package UD4.EJERCICIOS;

import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce precio original del artículo: ");
        double a = scan.nextDouble();
        System.out.println("Introduce precio del artículo rebajado: ");
        double b = scan.nextDouble();
        double descuento = ((a-b)/a)*100;
                ;
        System.out.println("Descuento print ln: " + descuento + "%");
        System.out.printf("Descuento print f: %.2f%%", descuento);
    }
}
