package EJERCICIOS.B;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("introduce una vocal: ");
        String vocal = sc.nextLine();

        String cambio = frase.replace(vocal, vocal.toUpperCase());
        System.out.println(cambio);
    }
}
