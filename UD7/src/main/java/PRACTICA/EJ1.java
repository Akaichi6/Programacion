package PRACTICA;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero: ");
        double numero1 = sc.nextDouble();

        System.out.println("introduce un numero: ");
        double numero2 = sc.nextDouble();

        System.out.println("El resultado es: " + multiplica(numero1, numero2));

    }

    public static  double multiplica(double a, double b){

        return a * b;
    }
}
