package EJERCICIOS.B.repetidos;

import java.util.Scanner;

public class EJ8_REPETIDO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu correo electronico: ");
        String correo = sc.nextLine();
        String [] partes = correo.split("@");

        System.out.println(partes[0] + "@gmail.com");
    }
}
