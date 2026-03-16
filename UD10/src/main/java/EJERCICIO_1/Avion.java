package EJERCICIO_1;

public class Avion extends Vehiculo {
    private double alturaMaxima;

    public Avion(String marca, String modelo, double velocidadMaxima, double alturaMaxima) {
        super(marca, modelo, velocidadMaxima);
        this.alturaMaxima = alturaMaxima;
    }
    public void acelerar(double velocidad){
        super.acelerar(velocidad + 100);
    }
    public boolean alturaPermitida(double alturaActual){
        boolean permiso = false;
        if  (alturaMaxima > alturaActual){
            permiso = true;
        }
        return permiso;
    }
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() + "Altura maxima: " + alturaMaxima + " m";
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
}
