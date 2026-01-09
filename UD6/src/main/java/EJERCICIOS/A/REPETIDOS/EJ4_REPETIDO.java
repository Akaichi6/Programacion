package EJERCICIOS.A.REPETIDOS;

import java.util.Scanner;

public class EJ4_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAMANYO = 20;
        double [] NUMEROS = new double[TAMANYO];


        int suma_positivos = 0;
        int suma_negativos = 0;
        for (int i =0; i < TAMANYO; i++) {
            System.out.println( "Introduce un numero real: ");
            NUMEROS[i] = sc.nextDouble();

            if (NUMEROS[i] < 0) {
                suma_negativos += NUMEROS[i];
            }
            else  {
                suma_positivos += NUMEROS[i];
            }
        }
        System.out.println("La suma de positivos es: " + suma_positivos);
        System.out.println("La suma de negativos es: " + suma_negativos);
    }
}
