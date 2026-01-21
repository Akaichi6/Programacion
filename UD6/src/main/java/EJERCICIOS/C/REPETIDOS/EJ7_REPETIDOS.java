package EJERCICIOS.C.REPETIDOS;

import java.util.Arrays;
import java.util.Scanner;

public class EJ7_REPETIDOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] matriz = new int[3][2];
        int [] sumafilas = new int[matriz.length]; // porque se hace asi?
        int []suma_columnas = new int[matriz[0].length]; // porque se hace asi?
        int suma_total = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("fila "+(i)+" columna "+(j)+ ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumafilas[i] += matriz[i][j];
                suma_columnas[j] += matriz[i][j];
                suma_total+= matriz[i][j];

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]+"\t");
            }
            System.out.println("|"+ sumafilas[i]);
        }
        System.out.println("----------------------------------");

        for (int j = 0; j < suma_columnas.length; j++) {
            System.out.print(suma_columnas[j]+"\t");
        }
        System.out.println("|"+suma_total);

    }
}
