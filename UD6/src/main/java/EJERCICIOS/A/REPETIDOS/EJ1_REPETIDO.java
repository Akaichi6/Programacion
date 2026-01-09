package EJERCICIOS.A.REPETIDOS;

import java.util.Arrays;
import java.util.Scanner;

public class EJ1_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] numeros = new double  [10];

        for(int i=0;i<numeros.length;i++){
            System.out.println("Introduce numeros reales: ");
            numeros[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(numeros));
    }
}
