package EJERCICIOS.B.repetidos;

import java.util.Scanner;

public class EJ2_REPETIDO {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase1 = input.nextLine();


        System.out.println("Introduce una frase: ");
        String frase2 = input.nextLine();

        if (frase1.equalsIgnoreCase(frase2))
        {
            System.out.println("Las frases coinciden");
        }else {
            System.out.println("Las frases no coinciden");
        }
    }
}
