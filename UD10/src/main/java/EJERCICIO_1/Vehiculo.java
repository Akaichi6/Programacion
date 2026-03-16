package EJERCICIO_1;

public class Vehiculo implements Comparable{
    // atributos
    protected String marca;
    protected String modelo;
    protected double velocidadActual;
    protected double velocidadMaxima;
    // constructor
    public Vehiculo(String marca, String modelo, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
        this.velocidadMaxima = velocidadMaxima;
    }
    // getters y setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    protected void acelerar(double velocidad) {
        velocidadActual += velocidad;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
            System.out.println("Velocidad Máxima Superada!!");
        }
    }
    public String mostrarInfo() {

       return "Marca: " + marca + "" +
               "\nModelo: " + modelo +"" +
               "\nVelocidad Actual: " + velocidadActual + "";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
