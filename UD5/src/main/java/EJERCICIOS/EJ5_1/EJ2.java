package EJERCICIOS.EJ5_1;
// Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres mayor de
//edad” o el mensaje de “eres menor de edad”.

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que edad tienes?");
        int edad = sc.nextInt();
        if (edad>=18 && edad<=125){
            //JOptionPane.showMessageDialog(null, "Su edad es mayor a 125!");
            System.out.println("eres mayor de edad");
        }

        else if (edad<=0){
            System.err.println("error");
        }
        else {
            System.out.println("eres menor de edad");
        }
    }
}
