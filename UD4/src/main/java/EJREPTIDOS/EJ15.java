package EJREPTIDOS;

import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tus horas de trabajo: ");
        int horasTrabajo = sc.nextInt();
        System.out.println("Introduce la tarifa por hora: ");
        double tarifaPorHora = sc.nextDouble();
        double irpf = 0.15;
        double bruto = horasTrabajo * tarifaPorHora;
        double neto = bruto -(bruto * irpf);
        System.out.println("Tu paga en bruto es de " + bruto + " y en neto es de" + neto);

    }
}
