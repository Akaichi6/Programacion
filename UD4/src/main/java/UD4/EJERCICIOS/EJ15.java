package UD4.EJERCICIOS;

import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tus horas trabajo: ");
        double horas = sc.nextDouble();
        System.out.println("Introduce la tarifa por hora: ");
        double precio = sc.nextInt();
        double bruto = precio * horas;
        double salario = bruto - (bruto * 0.15);
        System.out.println("El salario Bruto es(Prinln):"+ bruto);
        System.out.println("La salario es(Println): " + salario);
        System.out.printf("El salario bruto es(Printf): %.2f\nEL salario es(Printf): %.2f",bruto ,salario);
    }
}
