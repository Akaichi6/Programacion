package EJERCICIO_1;

public class Coche extends Vehiculo {
    private int num_puertas;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
        this.num_puertas = num_puertas;
    }
    @Override
    public void acelerar(double velocidad) {
        super.acelerar(velocidad + 15);
    }
    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() +
                "\n Numero de puertas: " + num_puertas;
    }

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }
}
