package UD4;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el numero de la tabla de multiplicar:");
        int num_mult = input.nextInt();
        int multiplicador = 0;

        System.out.println(" TABLA DEL " + num_mult );
        while (multiplicador < 11) {
            System.out.println(num_mult + " X " + multiplicador + " = " + num_mult * multiplicador);
            multiplicador++;
        }
    }
}
