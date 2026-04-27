package UD4;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dias = 365;
        int horas=24;
        int minutos=60;
        int segundo=60;

        int horasanu = dias*horas;
        int minutosanu = horasanu*minutos;
        int segunanu = minutosanu*segundo;

        System.out.println("El año tiene " + horasanu + " horas");
        System.out.println("El año tiene " + minutosanu + " minuts");
        System.out.println("El año tiene " + segunanu + " segundos");

    }
}
