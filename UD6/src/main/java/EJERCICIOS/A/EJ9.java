package EJERCICIOS.A;

import java.util.Arrays;
import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TAMAÑO ARRYS
        int TAMAIO = 100;
        int [] dimension = new int [TAMAIO];

        for (int i = 0; i < TAMAIO; i++) {
            dimension [i]= (int) (1 + Math.random() * 10);
        }

        System.out.println(Arrays.toString(dimension));

        System.out.println("Introduce un numero: ");
        int N = sc.nextInt();

        for (int i = 0; i < TAMAIO; i++) {

            if(dimension[i] == N){

                System.out.printf("%d\t",i +1);

            }
        }

    }
}
