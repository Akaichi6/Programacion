package EJERCICIO_4;

import java.util.Scanner;

public class AstrosPrincipal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Planetas
        Planeta tierra = new Planeta("Tierra", 5.97E24, 12742.0, 1.0, 365.25, 14.05, 9.78, 146600000.0);
        Planeta marte = new Planeta("Marte", 6.42E23, 6794.4, 24.62, 686.97, -46.0, 3.711, 22794);
        Planeta venus = new Planeta("Venus", 4.869E24, 12103.6, 243.02, 584.0, 463.85, 8.87, 108200000.0);
        //Satelites
        Satelite luna = new Satelite("Luna", 7.349E22, 3474.0, 27.5, 27.5, -153.0, 1.62, 384400.0, tierra);
        Satelite fobos = new Satelite("Fobos", 1.072E16, 11000.0, 0.0, 0.319, -40.15, 0.0084, 6000, marte);
        Satelite deimos = new Satelite("Deimos", 2.244E15, 12400.0, 0.0, 1.262, -40.15, 0.0039, 23460, marte);
        //pruebas

        int opcion;
        do {
            System.out.print("------menú--------" +
                    "\n1. Crear planeta." +
                    "\n2. Crear satélite." +
                    "\n3. Mostrar." +
                    "\n0. Salir");
            System.out.print("\nIntroduce una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    crearPlaneta(sc);
                case 2:
                    crearSatelite(sc);
                case 3:
                    mostrarTodo(sc);
                case 0:
                    System.out.println("Hasta luego");
                    System.exit(0);
            }

        } while (opcion != 0);

    }
    // metodos
    public static void crearPlaneta(Scanner sc){

    }
    public static void crearSatelite(Scanner sc){

    }
    public static void mostrarTodo(Scanner sc){

    }



}
