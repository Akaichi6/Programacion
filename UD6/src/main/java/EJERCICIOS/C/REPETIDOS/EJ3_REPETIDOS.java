package EJERCICIOS.C.REPETIDOS;

import java.util.Scanner;

public class EJ3_REPETIDOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el numero de filas que deseas: ");
        int filas = sc.nextInt();
        System.out.println("introduce el numero de columnas que deseas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        int mayor_0 = 0;
        int menor_0 = 0;
        int igual_0 = 0;


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("intodice el valor de la fila " + i + " columna " + j);
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] > 0) {
                    mayor_0++;
                } else if (matriz[i][j] < 0) {
                    menor_0++;
                } else  {
                    igual_0++;
                }
            }
        }
        System.out.println("Hay un total de " + mayor_0 + " mayores a 0");
        System.out.println("hay un total de " + menor_0 + " menores a 0");
        System.out.println("hay un total de " + igual_0 + " iguales a 0");
    }
}
