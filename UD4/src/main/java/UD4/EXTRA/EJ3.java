package UD4.EXTRA;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         // producto 1
        System.out.println("Introduce el nombre del producto: ");
        String nombre1 = sc.nextLine();
        System.out.println("Introduce la cantidad del producto: ");
        String cantidad1 = sc.nextLine();
        int cantidad_1 = Integer.parseInt(cantidad1);
        System.out.println("Introduce el valor del producto: ");
        String valor1 = sc.nextLine();
        float valor_1 = Float.parseFloat(valor1);
        double subtotal1 = valor_1 * cantidad_1;


        // Producto 2
        System.out.println("Introduce el nombre del producto: ");
        String nombre2 = sc.nextLine();
        System.out.println("Introduce la cantidad del producto: ");
        String cantidad2 = sc.nextLine();
        int cantidad_2 = Integer.parseInt(cantidad2);
        System.out.println("Introduce el valor del producto: ");
        String valor2 = sc.nextLine();
        float valor_2 = Float.parseFloat(cantidad2);
        double subtotal2 = valor_2 * cantidad_2;


        // Producto 3
        System.out.println("Introduce el nombre del producto: ");
        String nombre3 = sc.nextLine();
        System.out.println("Introduce la cantidad del producto: ");
        String cantidad3 = sc.nextLine();
        int cantidad_3 = Integer.parseInt(cantidad3);
        System.out.println("Introduce el valor del producto: ");
        String valor3 = sc.nextLine();
        float valor_3 = Float.parseFloat(valor3);

        // Producto 4
        System.out.println("Introduce el nombre del producto: ");
        String nombre4 = sc.nextLine();
        System.out.println("Introduce la cantidad del producto: ");
        String cantidad4 = sc.nextLine();
        int cantidad_4 = Integer.parseInt(cantidad4);
        System.out.println("Introduce el valor del producto: ");
        String valor4 = sc.nextLine();
        float valor_4 = Float.parseFloat(valor4);

        // Producto 5
        System.out.println("Introduce el nombre del producto: ");
        String nombre5 = sc.nextLine();
        System.out.println("Introduce la cantidad del producto: ");
        String cantidad5 = sc.nextLine();
        int cantidad_5 = Integer.parseInt(cantidad5);
        System.out.println("Introduce el valor del producto: ");
        String valor5 = sc.nextLine();
        float valor_5 = Float.parseFloat(valor5);



    }
}
