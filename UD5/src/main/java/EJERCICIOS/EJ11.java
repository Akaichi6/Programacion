package EJERCICIOS;

import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inrtroduce una temperatura: ");
        double temperatura = sc.nextDouble();

        System.out.println("opcion 1 De celsius a Fahrenheit");
        System.out.println("opcion 2 De Fahrenheit a Celsius");
        System.out.println("opcion 3 De celsius a Kelvin");
        System.out.println("inntriduce la opcion correspondiente (1/2/3): ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            double farenheit = (temperatura * 9/5) + 32;
            System.out.println(temperatura + "grados Celsius son " + farenheit + " Fahrenheit");
        }else if (opcion == 2) {
            double celsius = ( (temperatura - 32)) * 5/9;
            System.out.println(temperatura + "gadros Fahrenheit son " + String.format("%.2f", celsius) + " celsius");

        }else if (opcion == 3) {
            double kelvin = temperatura + 273.15;
            System.out.printf(temperatura + "grados Celsius son " + kelvin + " kelvin");
        }else  {
            System.out.println("error");
        }
    }
}
