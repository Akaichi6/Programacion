package EJERCICIOS;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pedimos el tamaño del array por teclado al usuario (Las alturas que él quiere introducir)
        System.out.println("ingresa la cantidad de alturas que hay que comprobar: ");
        int N = sc.nextInt();

        final int TAMAIO = N;
        double[] dimension = new double[TAMAIO];
        double suma = 0;

       for(int i=0; i<TAMAIO; i++){ // bucle para pedirle al usuario las alturas y hacer que se almacenen en el arrays
           System.out.println("Introduce tu altura (en metros): ");
           dimension [i] = sc.nextDouble();
           suma += dimension[i]; // es la suma de las alturas que se almacena en suma
       }

        System.out.println(Arrays.toString(dimension));
        Arrays.sort(dimension); // esto es para ordenar el array de menor a mayor
        double min = dimension[0]; // le dcimos que la posicion mas pequequeña es la 0 ya que la hemos ordenado con sort
        double max = dimension[dimension.length -1]; //Le decimos que el mas grande es la ultima posicion ya que antes la hemos ordenado
        double media = suma/TAMAIO; //la suma la dividimos entre el tamaño del array

        System.out.println("La altura maxima es: " + max);

        System.out.println("La altura minima es: " + min);

        System.out.println("La media es: " + media);




    }
}
