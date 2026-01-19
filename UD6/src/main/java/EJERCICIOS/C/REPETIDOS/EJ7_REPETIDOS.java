package EJERCICIOS.C.REPETIDOS;

import java.util.Arrays;
import java.util.Scanner;

public class EJ7_REPETIDOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] matriz = new int[3][2];
        int [] sumafilas = new int[3]; // porque se hace asi?
        int []suma_columnas = new int[2]; // porque se hace asi?
        int suma_total = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("fila "+(i)+" columna "+(j)+ ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                sumafilas[i] += matriz[i][j];
                suma_columnas[j] += matriz[i][j];
                suma_total+=sumafilas[i]+suma_columnas[j];

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]+"\t");
            }
            System.out.println("sumafila :"+ sumafilas[i]);
        }
        System.out.println("----------------------------------");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("suma_columna :"+ suma_columnas[i]);
        }
    }
}
