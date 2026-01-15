package EJERCICIOS.B.repetidos;

import java.util.Scanner;

public class EJ4_REPETIDO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("introduce una frase: ");
        String frase1 = input.nextLine().trim();

        int contador_a = 0;
        int contaor_e = 0;
        int contador_i = 0;
        int contador_o = 0;
        int contador_u = 0;

        for (int i = 0; i < frase1.length(); i++) {
            if (frase1.charAt(i) == 'a') {
                contador_a++;
            }
            if (frase1.charAt(i) == 'e') {
                contaor_e++;
            }
            if (frase1.charAt(i) == 'i') {

                contador_i++;
            }
            if (frase1.charAt(i) == 'o') {
                contador_o++;
            }
            if (frase1.charAt(i) == 'u') {
                contador_u++;
            }
        }

        System.out.println("EL numero de 'a' es:  " + contador_a);
        System.out.println("EL numero de 'e' es:  " + contaor_e);
        System.out.println("EL numero de 'i' es:  " + contador_i);
        System.out.println("EL numero de 'o' es:  " + contador_o);
        System.out.println("EL numero de 'u' es:  " + contador_u);


    }
}
