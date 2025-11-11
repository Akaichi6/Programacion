package EJERCICIOS;

import java.util.Scanner;

public class EJ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ¡Bienvenido a la pizzeria BELLA NAPOLI!");
        System.out.println("Tipos de pizza");
        System.out.println("1 - Vegetariana");
        System.out.println("2 - No vergetariana");

        System.out.println("Introduce el número correspondiente al tipo de pizza que quieres: ");
        int tipo_pizza = sc.nextInt();
        //pizzas
        int vegetariana = 1;
        int no_vergetariana = 2;
        // ingredientes
         final int peperoni = 1;
        final int jamon = 2;
        final int salmon = 3;

        //eleccion
        switch (tipo_pizza){

            case 1:
                System.out.println("ingredientes de pizzas vegetarianas: ");
                System.out.println("1. Pimiento");
                System.out.println("2. Tofu");
                System.out.println("Introduce el ingrediente que quieres: ");
                int ingredienteveg = sc.nextInt();
                if (ingredienteveg == peperoni) {

                }
            break;
            case 2:
                System.out.println(" Ingredienes de pizzas no vegetarianas: ");
                System.out.println(" 1 - Peperoni");
                System.out.println(" 2 - Jamón");
                System.out.println(" 3 - Salmón");
                System.out.println("Introduce el ingrediente que deseas: ");
                int ingrediente = sc.nextInt();
                switch (ingrediente){
                    case peperoni:
                        int peperoni_ = 1;
                        break;
                    case jamon:
                        int jamon_ = 2;
                        break;
                    case salmon:
                        int salmonn = 3;
                        break;
                }

            default:
                System.out.println("Tipo de pizza incorrecto");

        }
        }
    }

