package EJERCICIOS.A;

import java.util.Arrays;
import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       double[] numero = new double[10];


       for ( int i = 0; i < numero.length; i++) {
           System.out.println("Introduce un numero real: ");
           numero[i] = sc.nextDouble();
       }
        System.out.println(Arrays.toString(numero));
    }

}
