package EJERCICIOS.B.repetidos;

import java.util.Scanner;

public class EJ1_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine().trim();

        frase.split(" ");

        String [] palabras = frase.split(" ");

        for(int i=0; i< palabras.length; i++){
            System.out.println(palabras[i]);
        }
    }
}
