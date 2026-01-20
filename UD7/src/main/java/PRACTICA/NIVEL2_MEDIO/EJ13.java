package PRACTICA.NIVEL2_MEDIO;

import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el precio del producto sin el descuento: ");
        double precio_sin = sc.nextDouble();
        System.out.println("introduce el precio con el descuento: ");
        double precio_con = sc.nextDouble();

        System.out.println("el porcentaje de descuento es: " + porcentage(precio_sin, precio_con) + "%");

    }
    public static  double porcentage (double precio_sin, double precio_con){
        return ((precio_sin-precio_con)/precio_sin)*100;
    }
}
