package EJERCICIOS.EJ5_2.PARTE_B;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un numero entero positivo: ");
        int numero=sc.nextInt();
        int contador=1;
        while (contador<numero){
            contador++;
            if (contador>0){
                if (contador%2==0){
                    System.out.printf("%d\t",contador);
                    contador++;

                }//else {

                   // contador++;
               // }

            }
        }
    }



}

