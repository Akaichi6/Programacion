package EJERCICIOS.C.REPETIDOS;

import java.util.Scanner;

public class EJ4_REPETIDOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero_alummno = 4;
        int asignatura = 5;

        double [][] matriz = new double[numero_alummno][asignatura];


        for (int i = 0; i < 4; i++) { //filas
            System.out.println("introduciendo notas del alumno " + (i + 1));
            for (int j = 0; j < 2; j++) { // columnas
                System.out.println("Nota del alumno: ");
                matriz[i][j] = sc.nextInt();


            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < numero_alummno; i++) {
            double suma = 0;
            double min = matriz[i][0];
            double max = matriz[i][0];

            for (int j = 0; j < asignatura; j++) {
                double nota = matriz[i][j];
                suma += nota;

                if (nota < min) {
                    min = nota;
                }
                if (nota > max) {
                    max = nota;
                }
            }
            double media = suma / asignatura;
            System.out.println("nota minima: " + min);
            System.out.println("nota maxima: " + max);
            System.out.println("media: " + media);
        }

    }
}
