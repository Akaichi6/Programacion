package EJERCICIOS.EJ5_2.PARTE_B;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce N1: ");
        double n1 = sc.nextDouble();
        System.out.println("Introduce N2: ");
        double n2 = sc.nextDouble();


        while (n1 > n2){
            System.out.println("N2 debe ser mayor que N1, vuelve a introducir N2:  ");
            n2 = sc.nextDouble();
        }
        int contador = 0;

        while (n2 > n1 && contador < n2) {
                contador++;
                System.out.printf(" %d\t", contador);


        }


    }

}
