package EXAMEN_DE_PRUEBA;

import java.util.Scanner;

public class EJ1 {

        public static void main(String[] args) {

            Scanner leer = new Scanner(System.in);

            System.out.print("Introdece una frase: ");
            String frase = leer.nextLine().toLowerCase();

            int tamanio_palabra = 0;
            String palabra;
            String palabra_mas_larga = "";

            String[] secuencia_palabras = frase.split(" ");

            for (int i = 0; i < secuencia_palabras.length; i++) {

                palabra = secuencia_palabras[i];

                if (palabra.length() > palabra_mas_larga.length()) {
                    palabra_mas_larga = palabra;
                    tamanio_palabra = palabra_mas_larga.length();
                }
            }

           boolean tiene_o = false;
            int contador_o = 0;
            for (int i = 0; i < palabra_mas_larga.length(); i++) {
                if (palabra_mas_larga.charAt(i) == 'o') {
                    contador_o++;
                    tiene_o = true;
                }
            }

            System.out.println("Numero total de palabras: " + secuencia_palabras.length);
            System.out.println(" La Palabra más larga es: " + palabra_mas_larga + " y su Tamaño es de: " + tamanio_palabra + " letras");
            System.out.println(" La palabra tiene 'o'? "+ tiene_o);
            System.out.println(" EL numero de 'o' que tiene la palabra es: " + contador_o);

        }

}
