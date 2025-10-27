package UD4;

import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_WHITE = "\u001B[37m";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dividendo debe de ser entero: ");
        int dividendo = sc.nextInt();
        System.out.println("Ingrese el divisor debe de ser entero: ");
        int divisor = sc.nextInt();
        if (divisor != 0){
            int cociente = dividendo/divisor;
            int resto = dividendo%divisor;
            System.out.println("El resultado es: "+ ANSI_BLUE + dividendo +ANSI_WHITE+ " entre "+ ANSI_BLUE + divisor + ANSI_WHITE +" da un cociente de "+ ANSI_BLUE + cociente + ANSI_WHITE+" y un resto de "+ ANSI_BLUE + resto);
        } else {
            System.err.println("no se puede dividir entre 0");
        }
        sc.close();

    }
}
