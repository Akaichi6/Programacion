package EJERCICIOS.A.REPETIDOS;

import java.util.Arrays;
import java.util.Scanner;

public class EJ6_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño de array: ");
        int tamanio_N = sc.nextInt();

        System.out.println("Introduce el valor del array: ");
        int valor_M = sc.nextInt();

        double [] M = new double[tamanio_N];

        for (int i = 0; i < M.length; i++) {
        M[i] = valor_M;
        }
        System.out.println(" El array es: " + Arrays.toString(M));

    }
}
