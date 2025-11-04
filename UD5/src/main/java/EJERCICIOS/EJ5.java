package EJERCICIOS;

import java.util.Scanner;

//Escribe un programa que lee un número y me dice si es positivo o negativo, consideraremos el cero como positivo
public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        double numero = sc.nextDouble();

        if (numero < 0){
            System.out.println("El numero es negativo");
        }else if (numero >= 0){
            System.out.println("El numero es positivo");
        }
    }
}
