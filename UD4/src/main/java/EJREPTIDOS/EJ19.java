package EJREPTIDOS;

import java.util.Scanner;

public class EJ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad a invertir: ");
        double cantidad = sc.nextDouble();
        System.out.println("Ingrese el interes a aplicar(%): ");
        double interes = sc.nextDouble();
        System.out.println("Ingrese los meses que durara la inversion: ");
        double meses = sc.nextDouble();
        double anyos = meses / 12;
        double rendimiento = cantidad * Math.pow((interes/100 +1), anyos);
        System.out.printf("El capital final es: %,.2f", rendimiento);
    }
}
