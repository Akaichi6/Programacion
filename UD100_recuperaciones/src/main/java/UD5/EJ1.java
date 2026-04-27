package UD5;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad = 0;
        int salida = 0;


           while(salida == 0) {
               System.out.print("Introduce tu edad: ");
               edad = input.nextInt();

               if (edad < 0) {
                   System.out.println("El edad no puede ser negativa, ni has nacido cabrón");
               }if (edad > 120) {
                   System.out.println("Me da que eres demasiado mayor para saber usar un ordenador");
               }if (edad > 0 && edad < 18) {
                   System.out.println("eres menor de edad, eres un mierdas");
                   salida++;
               }if (edad > 18 && edad <= 120) {
                   System.out.println("eres mayor de edad, enhorabuena ya puedes ir a la carcel!!!!");
                   salida++;
               }

           }
    }
}
