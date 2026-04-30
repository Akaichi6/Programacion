package UD5;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clave = "thebest";
        int contador = 0;
        while (contador == 0) {
            System.out.print("Introduce la contrasela:");
            String contrasela = sc.nextLine().toLowerCase();
            if (contrasela.length() >= 7) {
                if (clave.equals(contrasela)) {
                    System.out.println("La contraseña coincide");
                    contador++;
                } else
                    System.out.println("La contrsaeña not coincide");
            }else
                System.out.println("La contraseña debe de tenrer 8 caracteres");
        }
    }
}
