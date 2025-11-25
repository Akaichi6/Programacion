package EJERCICIOS;

import java.util.Scanner;

public class EJ2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TAMANYO = 10;
        double[] numero = new double[TAMANYO];
        double suma = 0;



        for (int i = 0; i < numero.length; i++) {
            System.out.println("introduce numero reales: ");
            numero[i] = sc.nextDouble();
            suma += numero[i];
        }
        System.out.println("suma: " + suma);
    }
}
