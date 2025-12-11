package EJERCICIOS.EJ5_1.repetidos;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = sc.nextInt();
        System.out.println("Introduce el tercer numero: ");
        int numero3 = sc.nextInt();

        if (numero1 > numero2)
        {
            if (numero1 > numero3)
            {
                System.out.println("El primer numero que es el numero " + numero1 + " es el mayor");
            }
        } else if (numero2 > numero3)
        {
            if (numero2 > numero1)
            {
                System.out.println("El segundo numero que es  el " + numero2 + " es el mayor");
            }
        } else
        {
            System.out.println("El tercer numero que es el numero " + numero3 + " es el mayor");
        }

    }
}
