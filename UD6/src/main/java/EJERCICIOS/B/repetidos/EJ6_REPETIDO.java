package EJERCICIOS.B.repetidos;

import java.util.Scanner;

public class EJ6_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce una frase: ");
        String frase = sc.nextLine().trim();

        String frase_invertida = new StringBuilder(frase).reverse().toString();

        System.out.println(frase);
        System.out.println(frase_invertida);
    }
}
