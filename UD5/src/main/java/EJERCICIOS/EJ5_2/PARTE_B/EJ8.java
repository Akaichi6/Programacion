package EJERCICIOS.EJ5_2.PARTE_B;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce N1: ");
        int n1 = sc.nextInt();
        System.out.println("Introduce N2: ");
        int n2 = sc.nextInt();


        while (n1 >= n2){
            System.out.println("N2 debe ser mayor que N1, vuelve a introducir N2:  ");
            n2 = sc.nextInt();
        }
        int contador = n1 -1;
        int pares = 0;

        while (n2 > n1 && contador < n2) {
                contador++;
                if(contador % 2 == 0){
                    pares++;
                }

                System.out.printf(" %d\t", contador);


        }
        System.out.printf("\nLa cantidad de pares es: %d", pares);

    }

}
