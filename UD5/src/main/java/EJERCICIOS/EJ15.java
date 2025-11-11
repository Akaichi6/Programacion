package EJERCICIOS;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Intreodice el precio total del producto: ");
        double precio=sc.nextDouble();

        // COLORES
        String verde = "\u001B[32m";
        String rojo = "\u001B[31m";
        double recargo = 5;
        double descuento = 0.15;

        if (precio >= 100){
            double descuento_aplicado = precio -(precio * descuento);
            System.out.println("EL precio tras el desciento es: "+ verde + descuento_aplicado+ "€");
        } else if (precio <= 50) {
            double recargo_aplicado = precio + recargo;
            System.out.println(" EL precio tras el recargo es: "+ rojo + recargo_aplicado+ "€");
        }else {
            System.out.println(precio);
        }
    }
}
