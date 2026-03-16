package EJERCICIO_2;

import java.util.ArrayList;

public class EmpresaPrincipal {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new JefeEquipo("Carlos", 3000));
        empleados.add(new Programador("Ana",2500));
        empleados.add(new Programador("Luis", 2000));
        empleados.add(new Administrativo("Elena", 1800));
        empleados.add(new Administrativo("Pedro",1500));

        MostrarSalarioEmpleados(empleados);
    }
    public static void MostrarSalarioEmpleados (ArrayList<Empleado> empleados){

        for (Empleado empleado : empleados) {
            empleado.mostrarInfo();
        }
    }
}
