package EJERCICIOS.EJ5_1.repetidos;

import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Las opciones de conversion son:" +
                "\n1 - De Celsius a Fahrenheit" +
                "\n2 - De Fahrenheit a Celsius" +
                "\n3 - De Celsius a Kelvin" +
                "\nSelecciona una de las opciones: ");
        int opcion = sc.nextInt();
        double celsius_a_fahrenheit;
        double celsius_a_kelvin;
        double fahrenheit_a_celsius;

        double temperatura;

        switch (opcion) {
            case 1:
                System.out.println("Introduce la temperatura en Celsius:");
                temperatura = sc.nextDouble();
                celsius_a_fahrenheit = (temperatura * 9/5) + 32;
                System.out.println("El cambio de celsius a fahrenheit es: ");
                System.out.println(celsius_a_fahrenheit + " Fahrenheit");
                break;
            case 2:
                System.out.println("Introduce la temperatura en Fahrenheit: ");
                temperatura = sc.nextDouble();
                fahrenheit_a_celsius = (temperatura - 32) * 5/9;
                System.out.println("El cambio de celsius a fahrenheit es: ");
                System.out.println(fahrenheit_a_celsius + "º Celsius");
                break;
            case 3:
                System.out.println("Introduce la temperatura en celsius: ");
                temperatura = sc.nextDouble();
                celsius_a_kelvin = temperatura + 273.15;
                System.out.println("El cambio de celsius a kelvin es: ");
                System.out.println(celsius_a_kelvin + " Kelvin");
                break;
                default:
                    System.out.println("Opcion no valida");






        }
    }
}
