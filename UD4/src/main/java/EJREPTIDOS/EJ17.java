package EJREPTIDOS;

import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de empanadillas a enviar: ");
        int empanadillas = sc.nextInt();
        System.out.println("Ingrese el numero de napolitanas a enviar: ");
        int napolitanas = sc.nextInt();
        double pesoemp = 0.112;
        double pesonap = 0.075;
        double pesoemptotal = empanadillas * pesoemp;
        double pesonaptotal = napolitanas * pesonap;
        double pesototal = pesoemptotal + pesonaptotal;
        System.out.println("El numero de empanadillas a enviar es: " + empanadillas);
        System.out.println("EL peso de las napolitanas a enviar es: " + napolitanas);
        System.out.println("EL peso del paquete es: " + pesototal);
    }
}
