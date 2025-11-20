package EJERCICIOS.EJ5_2.PARTE_B;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuantas notas vas a introducir: ");
        int numnotas=sc.nextInt();

        int notasmetidas = 1;
        int contador=0;
        double suma = 0;


        while(numnotas>contador){

            System.out.println("Dime numero " + notasmetidas + ":");
            double nota =sc.nextDouble();
            if (nota > 0){
                contador++;
                notasmetidas++;
                suma+=nota;
            }else {
                System.out.println("no se pueden meter notas negativas");
            }


        }
        double media = suma/numnotas;
        System.out.println("La media de todas las notas es: " + media);
    }
}
