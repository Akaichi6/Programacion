package EJERCICIOS;

import java.util.Arrays;
import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAMANYO = 20;
        int[] numero = new int[TAMANYO]; // esto es el array
        int positivos = 0;
        int negativos = 0;


        for (int i = 0; i < numero.length; i++)
        {
            System.out.println("Introduce un numero reales: ");
            numero[i] = sc.nextInt();

            if (numero[i] > 0){
            positivos += numero[i];

            }
            else {
                negativos += numero[i];

            }
        }
        System.out.println("Los positivos son: " + positivos);
        System.out.println("Los negativos son: " + negativos);
        System.out.println("Los numeros son: " + Arrays.toString(numero));


    }

}


