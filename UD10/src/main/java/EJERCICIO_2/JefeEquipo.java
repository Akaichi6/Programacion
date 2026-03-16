package EJERCICIO_2;

public class JefeEquipo extends Empleado {
    public JefeEquipo(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase()* 1.20;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Puesto: JefeEquipo" );
        System.out.println(" ");
    }
}
