package EJERCICIO_8;

public class Programador extends Empleado implements TrabajadorRemoro {

    public Programador(String pedro, double v, Portatil portatil1) {
        super();
    }

    public Programador(String luis, double v) {
        super();
    }

    public enum EstadoVPN {
        conectado, desconectado
    }

    private EstadoVPN estadoVPN;

    public Programador(String nombre, Dispositivo dispositivo, double salarioBase, EstadoVPN estadoVPN) {
        super(nombre, dispositivo, salarioBase);
        this.estadoVPN = estadoVPN;
    }

    // Bono del 10%
    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.10);
    }

    public EstadoVPN getEstadoVPN() { return estadoVPN; }

    @Override
    public void conectarVPN() {
        this.estadoVPN = EstadoVPN.conectado;
        System.out.println(nombre + " se ha conectado a la VPN.");
    }

    @Override
    public void desconectarVPN() {
        this.estadoVPN = EstadoVPN.desconectado;
        System.out.println(nombre + " se ha desconectado de la VPN.");
    }

    @Override
    public void estadoConexionVPN() {
        System.out.println(nombre + " — Estado VPN: " + estadoVPN);
    }

    @Override
    public String toString() {
        return super.toString() + " / Categoría: Programador";
    }
}
