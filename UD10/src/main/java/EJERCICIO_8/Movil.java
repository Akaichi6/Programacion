package EJERCICIO_8;

public class Movil implements Dispositivo {

    public enum Estado {
        encendido, apagado
    }

    private String modelo;
    private Estado estado;

    public Movil(String modelo) {
        this.modelo = modelo;
        this.estado = Estado.apagado;
    }

    public String getModelo() { return modelo; }
    public Estado getEstado() { return estado; }

    @Override
    public void encender() {
        this.estado = Estado.encendido;
        System.out.println("Móvil " + modelo + " encendido.");
    }

    @Override
    public void apagar() {
        this.estado = Estado.apagado;
        System.out.println("Móvil " + modelo + " apagado.");
    }

    @Override
    public void estadoDispositivo() {
        System.out.println("Móvil " + modelo + " está: " + estado);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Movil) {
            Movil otro = (Movil) obj;
            return this.modelo.equals(otro.getModelo());
        }
        return false;
    }
}
