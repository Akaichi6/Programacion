package EJERCICIOS;

import java.util.Arrays;
import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       //TAMAÑO DEL ARRAYS
       int TAMANIO = 100;
        double [] dimension = new double [TAMANIO];
        // BUCLE PARA ASIGNARLE POSICIONES A LOS NUMEROS ALEATORIOS
        for (int i = 0; i < TAMANIO; i++) {
            dimension[i] = Math.random();

        }
        System.out.println(Arrays.toString(dimension));

        System.out.println("Introduce un numero real entre 0 y 1: ");
         double R = sc.nextDouble();

        int mayoroigual = 0;

        for (int i = 0; i < TAMANIO; i++) {
            if(dimension[i]>=R){
                mayoroigual ++;
            }
        }
        System.out.println(mayoroigual);

    }
}
