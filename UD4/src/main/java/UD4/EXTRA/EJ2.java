package UD4.EXTRA;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio del primer producto: ");
        double precio1 = sc.nextDouble();
        System.out.println("Introduce el precio del segundo producto: ");
        double precio2 = sc.nextDouble();
        double max = Math.max(precio1,precio2);
        double min = Math.min(precio1,precio2);
        System.out.println("El Precio mayor es: "+ max);
        System.out.println("El Precio menor es: "+ min);
        System.out.printf("El precio mayor es: %.2f\nEl precio menor es: %.2f",max, min);
    }


}
