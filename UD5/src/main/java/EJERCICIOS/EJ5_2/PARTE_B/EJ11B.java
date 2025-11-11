package EJERCICIOS.EJ5_2.PARTE_B;

import java.util.Scanner;

public class EJ11B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Di un numero (Al introducir el 0 terminas): ");
        int numero = sc.nextInt();

        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";

        int numanterior=-1;
        int contadorfallos = 0;
        int contadornumero = 0;
        int contadorvalidos = 0;



            while (numero != 0) {
                System.out.println("Di un numero (Al introducir el 0 terminas): ");
                numero = sc.nextInt();
                if (numero >= numanterior) {
                    numanterior = numero;
                        contadornumero++;
                        contadorvalidos++;

                }else{
                    numanterior = numero;
                    contadorfallos++;
                    System.out.println( ANSI_RED + "Fallo! Errores: " +contadorfallos + ANSI_RESET);
                }
                System.out.println("numero: " + numanterior);


            }

        System.out.println("---------------------------------------------");
        System.out.println("Los aciertos son: "+contadorvalidos);
        System.out.println("los numeros introducidos son: "+contadornumero);
        System.out.println("Total de fallos: " +contadorfallos);

        }
    }



