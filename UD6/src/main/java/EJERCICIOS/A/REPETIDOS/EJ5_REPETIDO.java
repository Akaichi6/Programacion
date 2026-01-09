package EJERCICIOS.A.REPETIDOS;

import java.util.Scanner;

public class EJ5_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAMANYO = 20;
        double [] NUMEROS = new double[TAMANYO];

        double media = 0;
        double suma = 0;
        for(int i = 0; i < TAMANYO; i++){
            System.out.println("Introduce un numero real: ");
            NUMEROS[i] = sc.nextDouble();
            suma += NUMEROS[i];
        }
        media = suma / TAMANYO;
        System.out.println("La media es: " + media);
        System.out.println("La suma es: " + suma);
    }

}
