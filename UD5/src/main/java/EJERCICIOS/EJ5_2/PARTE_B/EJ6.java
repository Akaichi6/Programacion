package EJERCICIOS.EJ5_2.PARTE_B;

import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce N: ");
        int numero =sc.nextInt();

        int contador=1;
        int contadormult3 = 0;
        while(contador<numero){
            if(contador % 3==0){
                contador++;
                contadormult3++;
            }else {
                contador++;
            }
        }
        System.out.println("Cantidad de multiplos de 3: "+contadormult3);
    }
}
