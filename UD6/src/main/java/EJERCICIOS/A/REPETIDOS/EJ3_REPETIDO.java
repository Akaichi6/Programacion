package EJERCICIOS.A.REPETIDOS;

import java.util.Arrays;
import java.util.Scanner;

public class EJ3_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -10;
        int min = 10;

        double [] numeros = new double[10];

        for(int i=0;i<numeros.length;i++){
            System.out.println("Introduce numeros reales");
            numeros[i]=sc.nextDouble();
            if(numeros[i]>max){
                max = i + 1;
            }
            if(numeros[i]<min){
                min = i + 1;
            }
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(max);
        System.out.println(min);
    }
}
