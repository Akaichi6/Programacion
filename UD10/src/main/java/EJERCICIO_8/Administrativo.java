package EJERCICIO_8;

public class Administrativo extends Empleado
{

    public Administrativo(String nombre, Dispositivo dispositivo, double salarioBase) {
        super(nombre, dispositivo, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() + " / Categoría: Administrativo";
    }
}

