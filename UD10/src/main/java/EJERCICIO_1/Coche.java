package EJERCICIO_1;

public class Coche extends Vehiculo {
    private int num_puertas;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
        this.num_puertas = num_puertas;
    }
    public void acelerar(double velocidad) {
        super.acelerar(velocidad + 15);
    }
}
