package EJERCICIOS.EJ5_2.PARTE_B;

import java.time.Year;
import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el año de nacimiento: ");
        int anyo =sc.nextInt();

        int añoactual = Year.now().getValue();

        int edad = añoactual - anyo;

        System.out.println("Has cumplido: " + edad);







    }
}
