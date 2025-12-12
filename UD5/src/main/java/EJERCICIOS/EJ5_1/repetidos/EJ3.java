package EJERCICIOS.EJ5_1.repetidos;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2){
            System.out.println("El primer numero es mayor a el segundo numero");
        }else if (numero1 < numero2){
            System.out.println("El segundo numero es mayor a el primer numero");

        }else {
            System.out.println(" los numeros son iguales");
        }
    }
}
