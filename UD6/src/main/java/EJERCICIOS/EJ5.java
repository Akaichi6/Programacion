package EJERCICIOS;

import java.util.Arrays;
import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TAMANYO = 5;
        int[] numero = new int [TAMANYO];
        double suma = 0;
        double media = 0;

        for (int i = 0; i < numero.length; i++){
            System.out.println("Introduce un numero real: ");
            numero[i] = sc.nextInt();
            suma += numero[i];
            media = suma / numero.length;
        }
        System.out.println("La media es: " + media);
    }

}
