package UD4.EJERCICIOS;

public class EJ1 {
    public static void main(String[] args) {
        int dias = 365;
        int horas = 24;
        int minutos = 60;
        int segundos = 60;

        int horasanu = horas * dias;
        int minutosanu = minutos * horasanu;
        int segundosanu = segundos * minutosanu;
        System.out.println(" Usando Println");
        System.out.println("EL año tiene: " + horasanu + " horas");
        System.out.println("El año tiene: " + minutosanu + " minutos");
        System.out.println("EL año tiene: " + segundosanu + " segundos");

        System.out.printf("Usando Printf\n");
        System.out.printf("El año tiene: %1$,d horas \nEl año tiene: %2$,d minutos\nEl año tiene: %3$,d segundos ", horasanu, minutosanu, segundosanu);


    }
}
