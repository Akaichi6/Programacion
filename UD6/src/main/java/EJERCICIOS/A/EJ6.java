package EJERCICIOS.A;

import java.util.Arrays;
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero entero para determinar el tamaño del cajon: ");
        int N = sc.nextInt();
        System.out.println("Ingresa otro numero ");
        int M = sc.nextInt();
        final int TAMANYO = N;
        int[] numero = new int[TAMANYO];

        for (int i=0; i < TAMANYO; i++){
          numero[i] = M;

        }
        System.out.println( Arrays.toString(numero));
    }
}
