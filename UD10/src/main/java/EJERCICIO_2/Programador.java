package EJERCICIO_2;

public class Programador extends Empleado{
    public Programador(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.10;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Puesto: Programador" );
        System.out.println(" ");
    }
}
