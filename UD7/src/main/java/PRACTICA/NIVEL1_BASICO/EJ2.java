package PRACTICA.NIVEL1_BASICO;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        esMayorEdad(edad);
        if (esMayorEdad(edad)) {
            System.out.println("Es mayor de edad");
        }else  {
            System.out.println("Es menor de edad");
        }
    }

    public static boolean esMayorEdad(int a){
        if(a>18){

            return true;
        }
        else{

            return false;
        }
    }
}
