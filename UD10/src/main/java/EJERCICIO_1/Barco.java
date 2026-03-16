package EJERCICIO_1;

public class Barco extends Vehiculo{
    private double metrosEslora;

    public Barco(String marca, String modelo, double velocidadActual, double metrosEslora) {
        super(marca, modelo, velocidadActual);
        this.metrosEslora = metrosEslora;
    }
}
