package EJERCICIOS.EJ5_1;
//Escribe un programa que lee dos números y los visualiza en orden descendente
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        double numero = sc.nextDouble();
        System.out.println("Introduce un numero: ");
        double numero2 = sc.nextDouble();

        if (numero > numero2) {
            System.out.printf("%.1f\n%.1f",numero,numero2);

        }else  {
            System.out.printf("%.1f\n%.1f",numero2,numero);
        }
    }
}
