package EJERCICIOS.A;

import java.util.Arrays;

public class EJ14 {
    public static void main(String[] args) {


        int tamanyo = 0;
        int cantidad = 10;
        for (int i = 1; i <= cantidad; i++) {
            tamanyo += i;

        }
        int[] dimension = new int[tamanyo];
        int k = 0;

        for (int numero = 1; numero <= cantidad; numero++) {

            for (int veces = 1; veces <= numero; veces++) {
                dimension[k] = numero;
                k++;
            }
        }

        System.out.println(Arrays.toString(dimension));
    }
}




