package EJERCICIOS;

import java.util.Locale;
import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la contrseña:");
        String usuario = sc.nextLine();

        final String clave = "thebest";
        String usuMinusculas = usuario.toLowerCase();
        if (usuMinusculas.equals(clave)) {
            System.out.println("La contraseña coincide:");
        } else {
            System.out.println("La contraseña no coincide:");

        }
    }
}
