package EJERCICIO_1;

public class Camion extends Vehiculo {
    private double cargaMaxima;
    private double cargaActual;

    public Camion(String marca, String modelo, double velocidadMaxima, double cargaMaxima, double cargaActual) {
        super(marca, modelo, velocidadMaxima);
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
    }

    @Override
    public void acelerar(double velocidad) {
        double mitadCarga = cargaMaxima/2;
        if (cargaActual > mitadCarga) {
            super.acelerar(velocidad);
        }else {
            super.acelerar(velocidad + 5);
        }
    }
    public boolean superarCarga(){
        return cargaActual < cargaMaxima;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() +
                "\ncargaMaxima: " + cargaMaxima
                + "\ncargaActual: " + cargaActual;
    }
    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }
}
