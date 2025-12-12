package EJERCICIOS.EJ5_1.repetidos;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double numero = sc.nextDouble();

        int numero1 = (int)numero;

        if (numero % 2 == 0)
        {
            System.out.println(" el numero " + numero1 + " es par");

        }else
        {
            System.out.println(" el numero " + numero1 + " es impar");
        }
    }
}
