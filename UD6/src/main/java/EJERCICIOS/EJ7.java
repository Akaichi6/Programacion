package EJERCICIOS;

import java.util.Arrays;
import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el numero entero de donde quieres que empiece: ");
        int P = sc.nextInt();
        System.out.println("Introduce el numero entero que quieres que pare: ");
        int Q = sc.nextInt();
        int tamanio = Q - P + 1;
        int[] dimension = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            dimension[i] = P;
            P++;

        }
        System.out.println( Arrays.toString(dimension));
    }
}
