package EJREPTIDOS;

import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdice el precio original del articulo: ");
        double precioOriginal = sc.nextDouble();
        System.out.println("Introdice el precio final del articulo: ");
        double precioFinal = sc.nextDouble();
        double descuento = (precioOriginal - precioFinal)/precioOriginal*100;
        System.out.printf("El descuento es: %.2f\n",descuento);
    }
}
