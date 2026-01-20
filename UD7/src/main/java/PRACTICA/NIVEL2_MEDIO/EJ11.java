package PRACTICA.NIVEL2_MEDIO;

import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int numero = sc.nextInt();

        System.out.println("La tabla del " + numero);
        tablademultiplicacion(numero);

    }
    public static void tablademultiplicacion(int a){
        for (int i = 1; i <= a; i++) {
            int multi = i*a;
            System.out.println(i + "x" + a + " = " + multi);
        }
    }
}
