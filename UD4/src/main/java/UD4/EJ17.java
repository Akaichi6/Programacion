package UD4;

import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de empanadillas a enviar: ");
        double empanadillas = sc.nextDouble();
        System.out.println("Introduce el numero de napolitanas a enviar: ");
        double napolitanas = sc.nextDouble();
        double pesoempanadillas = 0.112;
        double pesonapolitanas = 0.075;
        double enviosempanadilas = empanadillas * pesoempanadillas;
        double enviosnapolitanas = napolitanas * pesonapolitanas;
        double pesototalpaquetre =  enviosempanadilas + enviosnapolitanas;
        System.out.println("El peso total de empanadillas es(Println): " + enviosempanadilas+ "Kg");
        System.out.println("El peso total de las napolitanas es(Prinln): " + enviosnapolitanas+ "Kg");
        System.out.println("El peso total del paquete es(Prinln): "+ pesototalpaquetre);
        System.out.printf("El peso total de las empanadiilas es(Printf): %.3f\nEl peso total de las napolitanas es(Printf): %.3f\nEl peso total del paquete es(Printf): %.3f ", enviosempanadilas, enviosnapolitanas,pesototalpaquetre );

    }
}
