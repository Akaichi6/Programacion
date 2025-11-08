package EJERCICIOS;

import java.util.Scanner;

public class EJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Como te llamas?");
        String nombre = sc.nextLine();


        System.out.println("¿Cual es tu genero (H o M)?");
        String genero = sc.nextLine();

        String nommin = nombre.toLowerCase();
        char nom = nommin.charAt(0);
        char gen = genero.toLowerCase().charAt(0);

      if (nom <= 'm' && gen == ('m')) {
          System.out.println(" tu grupo es A");

      }else if (nom >= 'n' && gen == ('h')) {
          System.out.println("tu grupo es A");

      }else {
          System.out.println("tu grupo es B");

        }

    }
    }

