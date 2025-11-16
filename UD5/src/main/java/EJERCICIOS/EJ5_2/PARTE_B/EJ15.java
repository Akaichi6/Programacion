package EJERCICIOS.EJ5_2.PARTE_B;

import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las horas (0-23): ");
        int hora = sc.nextInt();
        System.out.println("Introduce los minutos (0-59): ");
        int minuto = sc.nextInt();
        System.out.println("Introduce las segundos (0-59): ");
        int segundos = sc.nextInt();

        while (true){


            if (hora < 0 && hora > 23 ){
                System.out.println("Valor introducido incorrecto");
                System.out.println("Introduce las horas (0-23): ");
                int hora2 = sc.nextInt();

            }

            if (minuto < 0 || minuto > 59) {
                System.out.println("Valor introducido incorrecto");
                System.out.println("Introduce los minutos (0-59): ");
                int minuto2 = sc.nextInt();

            }

            if (segundos < 0 || segundos > 59) {
                System.out.println("Valor introducido in correcto");
                System.out.println("Introduce las segundos (0-59): ");
                int segundos2 = sc.nextInt();


            } else {
                    System.out.println("Error: valores fuera de rango.");
                    System.out.println("Introduce las horas (0-23): ");
                    int hora2 = sc.nextInt();
                    System.out.println("Introduce los minutos (0-59): ");
                    int minuto2 = sc.nextInt();
                    System.out.println("Introduce las segundos (0-59): ");
                    int segundos2 = sc.nextInt();

                    while (true){

                        Thread.sleep(1000);
                        segundos++;
                        if (segundos2 >= 59){
                            segundos2 = 00;

                            minuto2 = minuto2 + 1;
                        } if (minuto2 >= 59) {
                            minuto2 = 00;
                            hora2 = hora2 + 1;

                        } if (hora2 >= 23) {
                            hora2 = 00;

                        }
                        System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundos);
                    }

            }


        while (true){

            Thread.sleep(1000);
            segundos++;
            if (segundos >= 59){
                segundos = 00;

                minuto= minuto + 1;
            } if (minuto >= 59) {
                minuto = 00;
                hora = hora + 1;

            } if (hora >= 23) {
                hora = 00;

            }
            System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundos);
        }

    }
}
}
