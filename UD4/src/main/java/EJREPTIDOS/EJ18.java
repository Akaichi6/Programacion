package EJREPTIDOS;

import java.util.Scanner;

public class EJ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de barras frescas vendidas: ");
        int barras = sc.nextInt();
        System.out.println("Ingrese el numero de barras que no son del dia vendidas: ");
        int barraspochas = sc.nextInt();
        double precio = 1.20;
        double descuento = precio * 0.5;
        double ingresobarrasdia = barras * precio ;
        double ingresobarraspochas = barraspochas * descuento;
        double ingresobarras = ingresobarrasdia + ingresobarraspochas;
        System.out.println("El ingreso total del dia es " + ingresobarras + "€");

    }
}
