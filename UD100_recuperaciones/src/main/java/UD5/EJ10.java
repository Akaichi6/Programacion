package UD5;

import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

            System.out.print("Introduce tu edad: ");
            int edad = sc.nextInt();
            System.out.print("Introduce tus ingresos mensuales: ");
            int ingresos = sc.nextInt();
            if(edad>=16 && ingresos>1000){
                System.out.println("Debes de pagar Pringado");
            }else if(edad<16 && ingresos>100){
                System.out.println("Eres demasiado joven para tributar");
            }else if(edad>16 && ingresos<100){
                System.out.println("Eres demasiado pobre para tributar");
            }
    }
}
