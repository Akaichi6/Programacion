package EJERCICIOS.EJ5_2.PARTE_A;

import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int contador500=0;
        int contador200=0;
        int contador100=0;
        int contador50=0;
        int contador20=0;
        int contador10=0;

        System.out.println("Introduce la cantidad de euros: ");
        int euros=sc.nextInt();

        if (euros % 5==0) {

            while (euros >= 500) {
                euros = euros - 500;
                contador500++;
            }
            System.out.println("la cantidad necesaria de billetes es de 500: " + contador500);

            while(euros >= 200) {
                euros = euros - 200;
                contador200++;
                System.out.println("la cantidad necesaria de billetes es de 200: " + contador200);
            }
            while(euros >= 100) {
                euros = euros - 100;
                contador100++;
                System.out.println("la cantidad necesaria de billetes es de 100: "  + contador100);

            }
            while(euros >= 50){
                euros = euros - 50;
                contador50++;
                System.out.println("la cantidad necesaria de billetes es de 50: "  + contador50);
            }
            while(euros >= 20){
                euros = euros - 20;
                contador20++;
                System.out.println("la cantidad necesaria de billetes es de 200: " + contador20);

            }
            while(euros >= 10){
                euros = euros - 10;
                contador10++;
                System.out.println("la cantidad necesaria de billetes es de 200: "  + contador10);

            }
        }
        else
            System.out.println("El euros no es valido");


    }



}

