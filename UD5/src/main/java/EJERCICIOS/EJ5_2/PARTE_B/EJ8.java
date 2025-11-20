package EJERCICIOS.EJ5_2.PARTE_B;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce N1: ");
        double n1 = sc.nextDouble();
        System.out.println("Introduce N2: ");
        double n2 = sc.nextDouble();

        double contador = 0;

        while (n2 > n1){
            if (n2 > n1);{
                contador++;
                System.out.println(contador);
            }
            if(n1>n2){
                System.out.println("EL N2 debe de ser mayor a EL N1, vuelve a introducirlo");
            }

        }


    }

}
