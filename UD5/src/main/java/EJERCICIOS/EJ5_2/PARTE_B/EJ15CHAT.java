package EJERCICIOS.EJ5_2.PARTE_B;

import java.util.Scanner;

public class EJ15CHAT {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        int h = 0, m = 0, s = 0;
        boolean formatoValido = false;

        while (!formatoValido) {
            System.out.print("Introduce una hora en formato (HH:MM:SS): ");
            String hora = sc.nextLine();

            // Dividir la hora por los ":"
            String[] partes = hora.split(":");

            // Validar que haya 3 partes
            if (partes.length == 3) {
                try {
                    h = Integer.parseInt(partes[0]);
                    m = Integer.parseInt(partes[1]);
                    s = Integer.parseInt(partes[2]);

                    // Validar rangos reales de un reloj
                    if (h >= 0 && h <= 23 &&
                            m >= 0 && m <= 59 &&
                            s >= 0 && s <= 59) {
                        formatoValido = true; // Correcto
                    } else {
                        System.out.println("Formato incorrecto, vuelve a introducirla.");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Formato incorrecto, vuelve a introducirla.");
                }
            } else {
                System.out.println("Formato incorrecto, vuelve a introducirla.");
            }
        }

        // Simulación del reloj
        while (true) {
            // Mostrar la hora formateada
            System.out.printf("%02d:%02d:%02d%n", h, m, s);

            Thread.sleep(1000); // Esperar 1 segundo real

            // Sumar 1 segundo
            s++;
            if (s == 60) {
                s = 0;
                m++;
            }
            if (m == 60) {
                m = 0;
                h++;
            }
            if (h == 24) {
                h = 0;
            }
        }

    }
    }