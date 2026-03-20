package EJERCICIO_3;

import java.time.LocalDate;

public abstract class Paquete {
    private int identificador;
    double peso;
    private static LocalDate fecha_estimada;
    private static EstadoEnvio estado;
    private static int contadorId = 0; // es para asignarle un id a cada paquete

    public Paquete(double peso) {

        if (peso <= 0 || peso > 20 ){
            throw new IllegalArgumentException("El peso debe de estar entre 0 y 20");
        }
        contadorId++; // Para asignar un id
        this.identificador = contadorId;
        this.peso = peso;
        this.estado = EstadoEnvio.PENDIENTE; // de esta forma empieza en pendiente
        this.fecha_estimada = calcularFechaEstimada(peso);
    }

    private static LocalDate calcularFechaEstimada(double peso) {
        LocalDate hoy = LocalDate.now();
        if ( peso < 5 ){
            return hoy.plusDays(1);
        } else if (peso > 5 && peso < 10) {
            return hoy.plusDays(2);
        }else if (peso > 10 && peso < 15){
            return hoy.plusDays(4);
        }else {
            return hoy.plusDays(5);
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
    public boolean estaRetrasado() {
        return  LocalDate.now().isAfter(fecha_estimada) && estado != EstadoEnvio.ENTREGADO ;
    }
    public void entregar() {
        if (estado == EstadoEnvio.ENTREGADO){
            throw new IllegalStateException("El paquete ya ha sido entregado");
        }
        estado = EstadoEnvio.ENTREGADO; // Esto es para ponerlo en Entregado si antes no lo estaba
    }

    @Override
    public String toString() {
        return "id: " + identificador +
                "\n peso: " + peso + "kg" +
                "\n Estado: " + estado +
                "\n fecha estimada: " + fecha_estimada;
    }
}


