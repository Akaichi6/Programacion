package EJERCICIO_2;

public class Administrativo extends Empleado{
    public Administrativo(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Puesto: Administrativo" );
        System.out.println(" ");
    }
}
