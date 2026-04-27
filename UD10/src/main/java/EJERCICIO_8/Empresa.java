package EJERCICIO_8;

import java.util.ArrayList;

public class Empresa {

    private String nombre;
    private ArrayList<Empleado> empleados; // Lista dinámica de empleados

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>(); // Empieza vacía
    }

    public String getNombre() { return nombre; }
    public ArrayList<Empleado> getEmpleados() { return empleados; }

    public void añadirEmpleado(Empleado e) {
        empleados.add(e);
    }
}
