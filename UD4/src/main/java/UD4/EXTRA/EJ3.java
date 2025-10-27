package UD4.EXTRA;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Producto 1
        System.out.println("Ingrese el nombre del poducto: ");
        String nombre1 = sc.nextLine();
        System.out.println("Ingrese la cantidad del producto: ");
        String cantidad1 = sc.nextLine();
        int  cantidad1_ = Integer.parseInt(cantidad1);
        System.out.println("Ingrese el precio unitario del producto: ");
        String precio1 = sc.nextLine();
        double precio1_ = Double.parseDouble(precio1);
        double subtotal1 = cantidad1_*precio1_;
        // Producto 2
        System.out.println("Ingrese el nombre del poducto: ");
        String nombre2 = sc.nextLine();
        System.out.println("Ingrese la cantidad del producto: ");
        String cantidad2 = sc.nextLine();
        int cantidad2_ = Integer.parseInt(cantidad2);
        System.out.println("Ingrese el precio unitario del producto: ");
        String precio2 = sc.nextLine();
        double precio2_ = Double.parseDouble(precio2);
        double subtotal2 = cantidad2_ * precio2_;
        // Producto 3
        System.out.println("Ingrese el nombre del poducto: ");
        String nombre3 = sc.nextLine();
        System.out.println("Ingrese la cantidad del producto: ");
        String cantidad3 = sc.nextLine();
        int cantidad3_ = Integer.parseInt(cantidad3);
        System.out.println("Ingrese el precio unitario del producto: ");
        String precio3 = sc.nextLine();
        double precio3_ = Double.parseDouble(precio3);
        double subtotal3 = cantidad3_ * precio3_;
        // Producto 4
        System.out.println("Ingrese el nombre del poducto: ");
        String nombre4 = sc.nextLine();
        System.out.println("Ingrese la cantidad del producto: ");
        String cantidad4 = sc.nextLine();
        int cantidad4_ = Integer.parseInt(cantidad3);
        System.out.println("Ingrese el precio unitario del producto: ");
        String precio4 = sc.nextLine();
        double precio4_ = Double.parseDouble(precio3);
        double subtotal4 = cantidad4_ * precio4_;
        // Producto 5
        System.out.println("Ingrese el nombre del poducto: ");
        String nombre5 = sc.nextLine();
        System.out.println("Ingrese la cantidad del producto: ");
        String cantidad5 = sc.nextLine();
        int cantidad5_ = Integer.parseInt(cantidad3);
        System.out.println("Ingrese el precio unitario del producto: ");
        String precio5 = sc.nextLine();
        double precio5_ = Double.parseDouble(precio3);
        double subtotal5 = cantidad5_ * precio5_;

        double subtotalfull = subtotal1+subtotal2+subtotal3+subtotal4+subtotal5;
        int totalcantidad = cantidad1_+cantidad2_+cantidad3_+cantidad4_+cantidad5_;
        System.out.printf("| Producto      | Cantidad      | Precio Unitario\t| Subtotales\t|\n______________________________________________________________________\n|%s      \t|%s     \t|%.2f      \t|%.2f      \t|\n|%s     \t|%n      \t|%.2f           \t|%.2f      \t|\n|%s      \t|%n      \t|%.2f",nombre1, cantidad1_,precio1_,subtotal1,nombre2,cantidad2_,precio2_,subtotal2,nombre3,cantidad3_,precio3_,subtotal3,nombre4,cantidad4,precio4,subtotal4,nombre5,cantidad5,precio5,subtotal5,subtotalfull);
    }
}
