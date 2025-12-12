package EJERCICIOS.EJ5_1.repetidos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que edad tienes?");

        //determinacion de variables
        int edad = sc.nextInt();
        System.out.println("¿Cuales son tus ingresos mensuales?");
        int ingresos = sc.nextInt();
        int contador = 0;
        while (contador == 0)
        {
            if (edad < 0)
            {
                System.out.println("No puedes introducir edades menores a 0");
                System.out.println("introduce de nuevo tu edad: ");
                edad = sc.nextInt();
            } else if (ingresos >= 1000 && edad >= 16)
            {
                System.out.println("Debes de tributar");
                contador++;
            }
            else
            {
                System.out.println("No debes de tributar");
                contador++;
            }





        }

    }
}
