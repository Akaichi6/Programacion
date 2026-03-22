package EJERCICIO_3;

import java.util.ArrayList;
import java.util.Scanner;

public class BiciExpressPrincipal {

    static ArrayList<Paquete> todosLosPaquetes = new ArrayList<>();
    static ArrayList<Repartidor> todosRepartidores  = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("--MENSAJERÍA BICI-EXPRESS ---\n" +
                    "1. Crear repartidor\n" +
                    "2. Crear paquete normal\n" +
                    "3. Crear envío urgente\n" +
                    "4. Mostrar paquetes no asignados\n" +
                    "5. Asignar paquete a repartidor\n" +
                    "6. Entregar paquete a cliente\n" +
                    "7. Mostrar repartidores y paquetes asignados\n" +
                    "8. Mostrar paquetes retrasados\n" +
                    "9. Mostrar paquetes entregados\n" +
                    "0. Salir\n" +
                    " ");
            System.out.print("Introduce una opcion: ");
            opcion=  sc.nextInt();
            sc.nextLine(); // para limpiar

            switch (opcion) {
                case 1:
                    crearRepartidor(sc);
                    break;
                case 2:
                    crearPaqueteNormal(sc);
                    break;
                case 3:
                    crearEnvioUrgente(sc);
                    break;
                case 4:
                    mostrarPaquetesNoAsignados(sc);
                    break;
                case 5:
                    asignarPaqueteRepartidor(sc);
                    break;
                case 6:
                    entregarPaqueteRepartidor(sc);
                    break;
                case 7:
                    mostrarRepPaqAsignados(sc);
                    break;
                case 8:
                    mostrarPaquetesRetrasados(sc);
                    break;
                case 9:
                    mostrarPaquetesEntregados(sc);
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    System.exit(0);
            }
        } while (opcion != 0);
    }


    public static void crearRepartidor(Scanner sc) {
        System.out.print("Introduce el nombre del repartidor: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce el DNI: ");
        String DNI = sc.nextLine();
        try{
            Repartidor r = new Repartidor(nombre, DNI);
           todosRepartidores.add(r);
            System.out.println("Repartidor creado");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
    public static void crearPaqueteNormal(Scanner sc) {
        System.out.print("Introduce el peso del paquete (Kg): ");
        double peso = sc.nextDouble();
        try {
            Paquete p = new Paquete (peso);
            todosLosPaquetes.add(p);
            System.out.print("Paquete creado: " + p);
        }catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void crearEnvioUrgente(Scanner sc) {
        System.out.print("Introduce el peso del paquete (Kg): ");
        double peso = sc.nextDouble();
        sc.nextLine();
        try {
            Paquete eu = new EnvioUrgente (peso);
            todosLosPaquetes.add(eu);
            System.out.print("Paquete creado: " + eu);
        }catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void mostrarPaquetesNoAsignados(Scanner sc) {
        System.out.println("--Paquetes no asignados--");
        boolean hayNoAsignados = false;
        for (Paquete p : todosLosPaquetes) {
            if (p.getEstado() == EstadoEnvio.PENDIENTE) {
                hayNoAsignados = true;
            }
        }
        if (!hayNoAsignados) {
            System.out.println("Paquetes no asignados");
        }
    }
    public static void asignarPaqueteRepartidor(Scanner sc) {
        System.out.println("ID del paquete: ");
        int ID = sc.nextInt();
        System.out.println("DNI del repartidor: ");
        String DNI = sc.nextLine();

        Paquete paqueteEncontrado = null;
        for (Paquete p : todosLosPaquetes) {
            if (p.getIdentificador() == ID) {
                paqueteEncontrado = p;
                break;
            }
        }
        Repartidor repartidorEncontrado = null;
        for (Repartidor r : todosRepartidores) {
            if (r.getDNI().equals(DNI)) {
                repartidorEncontrado = r;
                break;
            }
        }
        if (repartidorEncontrado == null) {
            System.out.println("No Existe el repartidor");
        }
        if (paqueteEncontrado != null) {
            System.out.println("No Existe el paquete");
        }
        try {
            repartidorEncontrado.asignarPaquete(paqueteEncontrado);
            System.out.println("Paquete asignado");
        }catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void entregarPaqueteRepartidor(Scanner sc) {
        System.out.print("ID del paquete: ");
        int ID = sc.nextInt();
        System.out.print("DNI del repartidor: ");
        String DNI = sc.nextLine();

        for (Repartidor r : todosRepartidores) {
            if (r.getDNI().equals(DNI)) {
                try {
                    r.entregarPaquete(ID);
                    System.out.println("Paquete entregado");
                }catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                return;
            }
        }
        System.out.println("no Existe ese repartidor");
    }
    public static void mostrarRepPaqAsignados(Scanner sc) {
        System.out.println("--Paquetes asignados--");
        boolean hayAsignados = false;
        for (Repartidor r : todosRepartidores) {
            System.out.println("repartidor asignado: " + r);
            for (Paquete p : todosLosPaquetes) {
                System.out.println("paquete asignado: " + p);
            }
        }
    }
    public static void mostrarPaquetesRetrasados(Scanner sc) {
        System.out.println("--Paquetes retrasados--");
        boolean hayRetrasados = false;
        for (Paquete p : todosLosPaquetes) {
            if (p.estaRetrasado()) {
                hayRetrasados = true;
            }
        }
        if (!hayRetrasados) {
            System.out.println("No Hay Paquetes retrasados");
        }
    }
    public static void mostrarPaquetesEntregados(Scanner sc) {
        System.out.println("--Paquetes entregados--");
        boolean hayEntregados = false;
        for (Paquete p : todosLosPaquetes) {
            if (p.getEstado() == EstadoEnvio.ENTREGADO) {
                System.out.println("paquete entregado: " + p);
                hayEntregados = true;
            }
        }
        if (!hayEntregados) {
            System.out.println("No Hay Paquetes entregados");
        }
    }
}
