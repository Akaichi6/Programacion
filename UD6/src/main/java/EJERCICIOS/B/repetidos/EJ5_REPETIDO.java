package EJERCICIOS.B.repetidos;

import java.util.Scanner;

public class EJ5_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("escribe una frase que sea palindroma : ");
        String frase = sc.nextLine().toLowerCase();

        String frase_sin_espacios = frase.replace(" ", "");
        //System.out.println(frase_sin_espacios);
        String frase_invertida = new StringBuilder(frase_sin_espacios).reverse().toString();

       if (frase_sin_espacios.equals(frase_invertida)){
           System.out.println("Es un palíndromo");
       }else {
           System.out.println("No es un palíndromo");
       }


    }
}
