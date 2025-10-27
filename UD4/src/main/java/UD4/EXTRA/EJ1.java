package UD4.EXTRA;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner segundos = new Scanner(System.in);
        System.out.println("Introduce una cantidad de segundos: ");
        int segundo = segundos.nextInt();
        int dia = 0;
        int hora = 0;
        int minuto =  0;

        System.out.println( + segundo + " Equivale a " + dia +" dias," +hora + "Horas, "+minuto + " Minutos, " + segundo + " Segundos ");


    }
}
