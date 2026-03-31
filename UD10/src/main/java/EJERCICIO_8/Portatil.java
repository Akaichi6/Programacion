package EJERCICIO_8;

public class Portatil implements Dispositivo {

    // Enumerado: solo puede tener estos dos valores
    public enum Estado {
        encendido, apagado
    }

    private String modelo;
    private Estado estado;

    public Portatil(String modelo) {
        this.modelo = modelo;
        this.estado = Estado.apagado;
    }

    public String getModelo() { return modelo; }
    public Estado getEstado() { return estado; }

    @Override
    public void encender() {
        this.estado = Estado.encendido;
        System.out.println("Portátil " + modelo + " encendido.");
    }

    @Override
    public void apagar() {
        this.estado = Estado.apagado;
        System.out.println("Portátil " + modelo + " apagado.");
    }

    @Override
    public void estadoDispositivo() {
        System.out.println("Portátil " + modelo + " está: " + estado);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Portatil) {
            Portatil otro = (Portatil) obj; // Casting para acceder a su modelo
            return this.modelo.equals(otro.getModelo());
        }
        return false;
    }
}
