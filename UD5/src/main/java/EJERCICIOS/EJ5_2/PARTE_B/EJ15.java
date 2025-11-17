package EJERCICIOS.EJ5_2.PARTE_B;

import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las horas HH:MM:SS : ");
        String time = sc.nextLine();
        while (true) {
        String horacort = time.substring(0, 2);
        String mincort = time.substring(3, 5);
        String seguncort = time.substring(6, 8);

        int hora = Integer.parseInt(horacort);
        int minuto = Integer.parseInt(mincort);
        int segundos = Integer.parseInt(seguncort);

            if (hora>= 0 && hora < 23){
                if(minuto >= 0 && minuto < 60){
                    if(segundos >= 0 && segundos < 60){

                            Thread.sleep(1000);
                            segundos++;
                            if (segundos > 59) {
                                segundos = 00;

                                minuto = minuto + 1;
                            }
                            if (minuto > 59) {
                                minuto = 00;
                                hora = hora + 1;

                            }
                            if (hora > 23) {
                                hora = 00;

                            }
                            System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundos);
                    }else {
                        System.out.println("Error segundos mal introducidos");
                        System.out.println("Introduce las horas HH:MM:SS : ");
                        time = sc.nextLine();
                    }

                }else {
                    System.out.println("Error minutos mal introduidos");
                    System.out.println("Introduce las horas HH:MM:SS : ");
                    time = sc.nextLine();
                    }
            }else {
                System.out.println("Error horas mal introducidas");
                System.out.println("Introduce las horas HH:MM:SS : ");
                time = sc.nextLine();
            }

        }







    }
}

