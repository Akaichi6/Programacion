package EJERCICIOS.EJ5_1;

import java.util.Scanner;

//Escribir un programa que pida al usuario un número con decimales y muestre por pantalla si su parte entera es par o impar.
// Introduce un número con decimales: 27.85
// El número 27 es impar
// Introduce un número con decimales: 62.24
// El número 62 es par
public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero con decimales");
        double numero = sc.nextDouble();
        int entero = (int) numero;

        if (entero % 2 == 0){
            System.out.println("El numero" + entero + " es par");
        }else  {
            System.out.println("El numero"+ entero + " es impar");
        }
    }
}
