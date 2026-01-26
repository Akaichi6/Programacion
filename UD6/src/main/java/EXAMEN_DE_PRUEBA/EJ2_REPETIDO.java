package EXAMEN_DE_PRUEBA;

import java.util.Scanner;

public class EJ2_REPETIDO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int aleatorio;
        int fila;
        int columna;
        int posicion_i=-1;
        int posicion_j=-1;
        int num_min;

        System.out.println("Digite el numero de filas: ");
        fila = input.nextInt();
        System.out.println("Digite el numero de columnas: ");
        columna = input.nextInt();

        int [][] matriz = new int [fila][columna];

        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                aleatorio= (int) (-1 * Math.random()*10);
                matriz[i][j]=aleatorio;
            }
        }
        for (int i=0;i<matriz.length;i++){
            System.out.println(matriz[i][columna] + "\\t");
            for (int j=0;j<matriz[i].length;j++){

            }
        }
    }
}
