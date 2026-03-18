package EJERCICIO_3;

import java.time.LocalDate;

public class Paquete {
    private int identificador;
    private double peso;
    private LocalDate fecha_estimada;
    private EstadoEnvio estado;
    private static int contadorId = 0; // es para asignarle un id a cada paquete

    public Paquete(int identificador, double peso, LocalDate fecha_estimada, EstadoEnvio estado) {
        this.identificador = identificador;
        this.peso = peso;
        this.fecha_estimada = fecha_estimada;
        this.estado = EstadoEnvio.PENDIENTE;
        contadorId++;
        if (peso <= 0 | peso > 20 ){
            throw new IllegalArgumentException("El peso debe de estar entre 0 y 20");
        }
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFecha_estimada() {
        return fecha_estimada;
    }

    public void setFecha_estimada(LocalDate fecha_estimada) {
        this.fecha_estimada = fecha_estimada;
    }

    public EstadoEnvio getEstado() {
        return estado;
    }

    public void setEstado(EstadoEnvio estado) {
        this.estado = estado;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Paquete.contadorId = contadorId;
    }

    // metodos

    static void estaRetrasado(LocalDate fecha_estimada) {

    }


}
