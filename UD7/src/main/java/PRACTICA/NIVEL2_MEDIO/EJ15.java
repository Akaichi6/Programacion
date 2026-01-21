package PRACTICA.NIVEL2_MEDIO;

import java.util.Arrays;
import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {

        int [] numeros_reales = new int [100];
        for (int i = 0; i < numeros_reales.length; i++) {
            numeros_reales[i] = i+1;
        }
        System.out.println("La suma de los numeros reales es: " + suma(numeros_reales));
        System.out.println("La media de los numeros reaes es: " + median(numeros_reales));


    }
    public static int suma (int [] numeros_reales) {
        int suma = 0;
        for (int i = 0; i < numeros_reales.length; i++) {
            suma += numeros_reales[i];
        }
        return suma;
    }
    public static double median (int [] numeros_reales) {
        double media = 0;
        int suma = 0;
        for (int i = 0; i < numeros_reales.length; i++) {
            suma += numeros_reales[i];
             media = (double) suma / numeros_reales.length;

        }
        return media;
    }
}
