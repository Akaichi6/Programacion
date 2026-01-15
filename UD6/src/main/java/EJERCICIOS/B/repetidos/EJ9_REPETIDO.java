package EJERCICIOS.B.repetidos;

import java.util.Scanner;

public class EJ9_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("Introduce una voocal: ");
        String vocal = sc.nextLine();

        String frase_modificada = frase.replace(vocal,vocal.toUpperCase());

        System.out.println(frase_modificada);
        }

    }

