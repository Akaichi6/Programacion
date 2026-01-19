package PRACTICA;

import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int valor_inicial = 1;

        System.out.println("Introduce un numero entero: ");
        int numero_entero = sc.nextInt();

        System.out.println(" El sumatorio es: " + suma1aN(numero_entero));
        System.out.println(" El productorio es: " + producto1aN(numero_entero));
        System.out.println(" El valor intermedio es: " + intermedio1aN(numero_entero));

    }
    public static int  suma1aN(int n){
        int suma = 0;
        for(int i=1;i<=n;i++){

            suma += n;
        }
        return suma;
    }
    public static int producto1aN(int n){
        int producto = 1;
        for(int i=1;i<=n;i++){
            producto *= i;

        }
        return producto;
    }
    public static double  intermedio1aN(int n){
        return n*0.5;
    }
}
