package EJERCICIOS.C.REPETIDOS;

import java.util.Scanner;

public class EJ6_REPETIDOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int [3][6];

        for (int i = 0; i < 3; i++) {
            System.out.println("fila "+(i)+"\t");
            for (int j = 0; j < 6; j++) {
                System.out.print("columna "+(j)+"\t");
                matriz[i][j] = sc.nextInt();
            }
        }// encabezado
        for (int i = 0; i < 6; i++) {
            System.out.print("columna "+ i +"\t");
        }//mosntrar contenido del matriz
        for (int i = 0; i < 3; i++) {
            System.out.print("fila "+ i +"\t");
            for (int j = 0; j < 6; j++) {
                System.out.print("fila "+(j)+"\t\t");
                System.out.print(matriz[i][j]+ "\t\t");

            }
            System.out.println();
        }


    }
}
