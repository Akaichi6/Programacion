package PRACTICA.NIVEL2_MEDIO;

import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el caracter de la piramide: ");
        String caracter = sc.nextLine();

        System.out.println("Introduce las lineas que quieres que ocupe la piramide: "  );
        int lineas = sc.nextInt();

        triangulo(caracter, lineas);


    }
    public static void triangulo(String caracter, int a){
       for (int i = 1; i <= a; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print(caracter);
           }
           System.out.println();
       }

    }

}
