package EJERCICIO_8;

public class JefeEquipo extends Empleado implements TrabajadorRemoro {

    public enum estadoVPN{
        Conectado, Desconectado
    }
    private estadoVPN estadoVPN;

    public JefeEquipo(String nombre, Dispositivo dispositivo, double salarioBase) {
        super(nombre, dispositivo, salarioBase);
        this.estadoVPN = estadoVPN.Desconectado;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.25);
    }

    @Override
    public void conectarVPN() {

    }

    @Override
    public void desconectarVPN(){
        this.estadoVPN = estadoVPN.Desconectado;
        System.out.println(nombre + "Desconectado");
    }
    @Override
    public void estadoConexionVPN() {
        System.out.println(nombre + " — Estado VPN: " + estadoVPN);
    }
    @Override
    public String toString() {
        return super.toString() + " / Categoría: Jefe de equipo";
    }
}
