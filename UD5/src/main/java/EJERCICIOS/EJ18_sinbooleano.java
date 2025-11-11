package EJERCICIOS;

import java.util.Scanner;

public class EJ18_sinbooleano {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf(" ¡Bienvenido a la pizzeria BELLA NAPOLI!\n" +
                "tipos de pizza:\n" +
                "1- Vegetariana\n" +
                "2- No vergetariana,\n");
        System.out.println("Introduce el número correspondiente al tipo de pizza que quieres: ");
        int tipo_pizza = sc.nextInt();




        //TIPOS DE PIZZAS
        final int vegetariana = 1;
        final int No_vergetariana = 2;

        //ingredientes vegetarianos
        final int pimiento = 1;
        final int tofu = 2;

        // ingredientes no vegerarianos
        final int peperoni = 1;
        final int jamon = 2 ;
        final int salmon = 3 ;

        //ELECCION TIPOS DE PIZZA
        if (tipo_pizza == vegetariana){
            System.out.println("Ingredientes pizza vegetariana: ");
            System.out.println(" 1 - Pimiento");
            System.out.println(" 2 - Tofu");
            System.out.println("Introduce el numero del ingrediente que deseas: ");
            int ingredienteveg = sc.nextInt();
            if (ingredienteveg == pimiento){
                System.out.println("Has elegido la pizza Vegetariana con tomate,mozzarella y pimiento.");
            }else if (ingredienteveg == tofu){
                System.out.println("Has elegido la pizza Vegetariana con tomate,mozzarella y tofu.");


        } else if (tipo_pizza == No_vergetariana) {
            System.out.println("Ingredientes de pizzas no vegetarianas: ");
            System.out.println(" 1- Peperoni");
            System.out.println(" 2- Jamón");
            System.out.println(" 3- Salmón");
        }else {
            System.err.println( "Codigo de elecccion de pizza incorrecto");
        }

        //ELECCION DE INGREDIENTE

        if (tipo_pizza == vegetariana || tipo_pizza == No_vergetariana){
            System.out.println("Introduce el numero del ingrediente que deseas: ");
        }else
            System.out.println("error");

        int ingrediente = sc.nextInt();
        if (ingrediente == peperoni){
            System.out.println("Has elegido la pizza no vegetariana con tomate,mozzarella y peperoni.");
        } else if (ingrediente == jamon) {
            System.out.println("Has elegido la pizza no vegetariana con tomate,mozzarella y jamón.");
        } else if (ingrediente == salmon) {
            System.out.println("Has elegido la pizza no vegetariana con tomate,mozzarella y salmón.");

        }else {
            System.err.println( "Codigo de eleccion de ingrediente introducido incorrecto.");
        }
    }
}

}
