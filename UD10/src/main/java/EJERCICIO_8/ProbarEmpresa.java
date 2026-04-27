package EJERCICIO_8;

import java.util.ArrayList;
import java.util.Arrays;

public class ProbarEmpresa {
    public static void main(String[] args) {
        Portatil portatil1 = new Portatil("Dell XPS");
        Portatil portatil2 = new Portatil("MacBook Pro");
        Movil movil1 = new Movil("iPhone 14");

        Administrativo ana  = new Administrativo("Ana", movil1, 2500.0);
        Programador pedro   = new Programador("Pedro",    3200.0, portatil1);
        JefeEquipo carlos   = new JefeEquipo("Carlos", portatil2, 3000.0);
        Programador luis    = new Programador("Luis",     2000.0);

        pedro.conectarVPN();
        carlos.conectarVPN();

        portatil1.encender();
        movil1.encender();

        Empresa empresa = new Empresa("TechCorp S.L.");
        empresa.añadirEmpleado(ana);
        empresa.añadirEmpleado(pedro);
        empresa.añadirEmpleado(carlos);
        empresa.añadirEmpleado(luis);

        System.out.println(" EMPLEADOS DE " + empresa.getNombre() + "\n");
        mostrarTodosLosEmpleados(empresa.getEmpleados());

        System.out.println("\nRANKING POR SALARIO:");
        System.out.println("====================================================");
        imprimirRankingSalarios(empresa.getEmpleados());

        Portatil otroDell = new Portatil("Dell XPS");
        System.out.println("\n¿portatil1 igual que otroDell? " + portatil1.equals(otroDell));
        System.out.println("¿portatil1 igual que portatil2? " + portatil1.equals(portatil2));
    }
    public static void mostrarTodosLosEmpleados(ArrayList<Empleado> lista) {
        for (Empleado e : lista) {
            System.out.println(e);
            System.out.println("  Salario con bono: " + e.calcularSalario() + " euros");

        }
    }
    public static void imprimirRankingSalarios(ArrayList<Empleado> lista) {
        Empleado[] array = lista.toArray(new Empleado[0]);

        Arrays.sort(array, new ComparaSalario());

        int posicion = 1;
        for (Empleado e : array) {
            System.out.println(posicion + " -> " + e);
            posicion++;
        }
    }
}
