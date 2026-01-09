package EJERCICIOS.A.REPETIDOS;

import java.util.Arrays;
import java.util.Scanner;

public class EJ7_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor por el que quieres que comience: ");
        int P = sc.nextInt();
        System.out.println("Introduce el valor por el que quieres que termine: ");
        int Q = sc.nextInt();

        double[] A = new double[Q];

        for (int i = 0; i < Q; i++) {
            A[i] = P++;
        }
        System.out.println(Arrays.toString(A));




    }
}
