package EJERCICIOS.EJ5_1.repetidos;

import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        String precio_ninyos_menos_4_anyos = "Gratuita";
        int precio_ninyos_mas_4_anyos = 5;
        int precio_adultos = 10;
        int contador = 0;

        while (contador == 0)
        {
            if (edad < 0)
            {
                System.out.println("La edad introducida no es valida");
                System.out.println(" Introduce de nuevo tu edad: ");
                edad = sc.nextInt();
            } else if (edad < 4)
            {
                {
                    System.out.println("La entrada es de " + precio_ninyos_menos_4_anyos);
                    contador++;
                }
            } else if (edad >= 4 && edad <= 17) {
                System.out.println("El precio de la entrada es de " + precio_ninyos_mas_4_anyos + " €");
                contador++;
            } else if (edad >= 18) {
                System.out.println("EL precio de la entrada es de " + precio_adultos + " €");
                contador++;
            }
        }
    }
}

