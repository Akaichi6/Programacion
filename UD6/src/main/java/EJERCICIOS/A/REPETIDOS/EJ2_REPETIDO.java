package EJERCICIOS.A.REPETIDOS;

import java.util.Arrays;
import java.util.Scanner;

public class EJ2_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] numeros = new double[10];
        int suma = 0;

        for(int i=0;i<numeros.length;i++){
            System.out.println("Introduce numeros reales: ");
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println("La suma es: "+suma);
    }
}
