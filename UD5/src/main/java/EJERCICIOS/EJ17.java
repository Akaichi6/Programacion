package EJERCICIOS;

import java.util.Scanner;

public class EJ17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // horas
        System.out.println("Introduce la hora de entrada: ");
        int horas = sc.nextInt();
       //minutos
        System.out.println("Introduce los minutos de entrada: ");
        int minutos = sc.nextInt();
        //segundos
        System.out.println("Introduce los segundos de entrada: ");
        int segundos = sc.nextInt();

        // colores
        String azul = "\u001B[34m";

        //constantes
        final int horas_ = 24;
        final int minutos_ = 60;
        final int segundos_ = 60;

        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }

        System.out.printf(azul + "%02d:%02d:%02d\n", horas, minutos, segundos);
    }
}
