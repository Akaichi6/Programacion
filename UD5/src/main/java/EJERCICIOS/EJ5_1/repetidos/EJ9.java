package EJERCICIOS.EJ5_1.repetidos;

import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introdice la contraseña: ");
        String contrasenya=sc.nextLine();

        int intentos = 0;
         final String CLAVE = "TheBeSt";
        while (intentos == 0){
            if (contrasenya.equals(CLAVE)){

                System.out.println("La contraseña coincide");
                intentos++;
            }else
            {
                System.out.println(" La contraseña no conincide");
                System.out.println("Introduce la contraseña de nuevo:");
                contrasenya=sc.nextLine();

            }
        }

    }
}
