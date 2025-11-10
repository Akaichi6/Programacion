package EJERCICIOS.EJ5_1;

import java.util.Scanner;

// Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.
public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" introduce un numero");
        double numero1 = sc.nextDouble();
        System.out.println(" introduce un numero");
        double numero2 = sc.nextDouble();
        if (numero1<numero2) {
            System.out.println(" el numero " + numero2 + " es mayor a " + numero1);
        }
            else if (numero1>numero2){
                System.out.println(" el numero "+numero1+" es mayor a "+numero2);
            }
            else {
            System.out.println("Los nuemeros son iguales");
        }
        }
    }

