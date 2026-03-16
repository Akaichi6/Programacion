package EJERCICIO_1;

public class Moto  extends Vehiculo{
    private double cilindrada;

    public Moto(String marca, String modelo, double velocidadMaxima, double cilindrada) {
        super(marca, modelo, velocidadMaxima);
        this.cilindrada = cilindrada;
    }
    @Override
    public void acelerar(double velocidad){
        super.acelerar(velocidad + 20);
    }
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() +
                "\nCilindrada: " + cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}
