package EJERCICIOS.A.REPETIDOS;

import java.util.Arrays;
import java.util.Scanner;

public class EJ8_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAMANYO = 10;
        double [] A = new double [TAMANYO];

        for (int i = 0; i < TAMANYO; i++) {
            A[i] = Math.random();
        }
        System.out.printf("%.2f", Arrays.toString(A));
    }
}
