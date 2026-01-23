package EXAMEN_DE_PRUEBA;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

            int aleatorio;
            int filas;
            int columnas;
            int posicion_i=-1;
            int posicion_j=-1;
            int num_min=0;

            System.out.print("Introduce el numero de filas: ");
            filas=leer.nextInt();

            System.out.print("Ingresa el numero de columnas: ");
            columnas=leer.nextInt();

            int[][] matriz=new int[filas][columnas];

            for (int i=0;i<matriz.length;i++){

                for (int j=0;j<columnas;j++){
                    aleatorio=(int) (-1 + Math.random() * -10);
                    matriz[i][j]=aleatorio;
                }
            }
            for (int i=0 ; i <matriz.length; i++ ){

                for (int j=0;j<columnas;j++){
                    System.out.print(matriz[i][j]+"\t");

                    if (matriz[i][j]<num_min){
                        num_min=matriz[i][j];
                        posicion_j=j;
                        posicion_i=i;
                    }
                }
                System.out.println("");
            }
        System.out.println("El Numero mas pequeño es: "+ num_min +" en la posicion ("+posicion_i+","+posicion_j+")");

    }
}
