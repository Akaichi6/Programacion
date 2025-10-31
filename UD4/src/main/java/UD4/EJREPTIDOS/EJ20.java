package UD4.EJREPTIDOS;

import java.util.Scanner;

public class EJ20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero depositada: ");
        double deposito = sc.nextDouble();
        double interes = 0.04;
        double priemeranyo = deposito + (deposito * interes);
        double segundoanyo = priemeranyo + (priemeranyo * interes);
        double terceranyo = segundoanyo + (segundoanyo * interes);
        System.out.println("Balance año 1: "+ priemeranyo);
        System.out.println("Balance año 2: "+ segundoanyo);
        System.out.println("Balance año 3: "+ terceranyo);


    }
}
