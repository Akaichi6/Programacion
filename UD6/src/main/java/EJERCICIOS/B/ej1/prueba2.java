package EJERCICIOS.B.ej1;

import java.util.Scanner;
import java.util.Arrays;

public class prueba2 {
        public static void main(String[] args) {
            Scanner leer=new Scanner(System.in);

            System.out.print("Introduce el numero de filas que deseas: ");
            int filas=leer.nextInt();

            System.out.print("Ingresa el numero de columnas que deseas: ");
            int columnas=leer.nextInt();

            int posicion_i=-1;
            int posicion_j=-1;

            int numero_min=0;
            int aleatorio;

            int[][] matriz = new int [filas][columnas];

            for (int i=0;i<matriz.length;i++)
            {
                for (int j=0;j<columnas;j++)
                {
                    aleatorio = (int) (-1+Math.random()*-10);
                    matriz[i][j]=aleatorio;
                }
            }

            for (int i=0;i<matriz.length;i++){
                for (int j=0;j<columnas;j++){

                    System.out.print(matriz[i][j]+"\t");

                    if (matriz[i][j]<numero_min)
                    {
                        numero_min = matriz[i][j];
                        posicion_j=j;
                        posicion_i=i;
                    }
                }
                System.out.println("");
            }
            System.out.println("El Numero mas pequeño es: "+numero_min+" en la posicion ("+posicion_i+","+posicion_j+")");

        }
    }


