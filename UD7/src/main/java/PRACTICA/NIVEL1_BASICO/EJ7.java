package PRACTICA.NIVEL1_BASICO;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el alto: ");
        int a = sc.nextInt();
        System.out.println("Introduce el ancho: ");
        int b = sc.nextInt();
        System.out.println( " El perimetro del cuadrado es: " +  areaRectangulo(a, b));
        System.out.println(" EL perimetro del rectangulo es: " + perimetroRectangulo(a, b));

    }
    public static double perimetroRectangulo(double ancho, double alto){

        return  2 * (ancho + alto);
    }
    public static double  areaRectangulo(double ancho, double alto){

        return ancho*alto;
    }
}
