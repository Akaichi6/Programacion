package EXAMEN_DE_PRUEBA;

import java.util.Scanner;

public class EJ1 {

        public static void main(String[] args) {

            Scanner leer=new Scanner(System.in);
            String frase;
            String palabra;
            String palabra_mas_larga = "";
            int longitud = 0;
            System.out.print("Introdece una frase: ");
            frase=leer.nextLine();
            String[] cadena=frase.split(" ");
            for (int cont=0;cont<cadena.length;cont++){
                palabra=cadena[cont];
                if(palabra.length()>palabra_mas_larga.length()){
                    palabra_mas_larga=palabra;
                    longitud=palabra_mas_larga.length();
                }
            }
            System.out.println("Numero total de palabras: "+cadena.length);
            System.out.println("Palabra más larga: "+palabra_mas_larga+" (Longitud: "+longitud+")");


        }

}
