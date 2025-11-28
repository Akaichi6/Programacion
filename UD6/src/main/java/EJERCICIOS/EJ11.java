package EJERCICIOS;

import java.util.Arrays;
import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TAMAIO = 100;
        int[] dimension1 = new int[TAMAIO];
        int[] dimension2 = new int[TAMAIO];

        for(int i=0;i<TAMAIO;i++){
            dimension1[i] = i;
        }
        System.arraycopy(dimension1,0,dimension2,0,TAMAIO);
        for(int i=0;i<TAMAIO;i++){
            dimension2[i] = dimension1[99-i];
        }
        System.out.println(Arrays.toString(dimension1));
        System.out.println(Arrays.toString(dimension2));
     }
}
