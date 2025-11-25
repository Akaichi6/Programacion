package EJERCICIOS;

import java.util.Arrays;
import java.util.Scanner;

public class EJ3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        final int TAMANYO = 10;
        double[] numero = new double[TAMANYO];

        for (int i = 0; i < numero.length; i++){
            System.out.println("Introduce un numero real: ");
            numero[i] = sc.nextDouble();
        }
        Arrays.sort(numero);
        double min = numero[0];
        double max = numero[TAMANYO -1 ];
        System.out.println("El numero más alto es: " + max);
        System.out.println("El numero más pequeño es: " + min);
    }
}
