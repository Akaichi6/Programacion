package EJERCICIO_3;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Repartidor {
    private String nombre;
    private String DNI;
    private ArrayList<Paquete> paquetes;

    public Repartidor(String nombre, String DNI) {
        if (DNI == null || DNI.isEmpty()) {
            throw new IllegalArgumentException("EL DNI no puede estar vacio");
        }
        this.nombre = nombre;
        this.DNI = DNI;
        this.paquetes = paquetes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }
    //Metodos
    public void asignarPaquete(Paquete p){
        if (paquetes.size()>10){
            throw new IllegalArgumentException("El repartidor ya ha llegado al limite de paquetes.");
        }
        paquetes.add(p);
        p.setEstado(EstadoEnvio.EN_REPARTO);
    }
    public void entregarPaquete(int idPaquete){
        paquetes.remove(idPaquete);
        for (Paquete p :  paquetes) {
            if (p.getIdentificador() ==  idPaquete) {
                p.setEstado(EstadoEnvio.ENTREGADO);
                return;
            }
        }
        throw new NoSuchElementException("No existe ningun paquete con ese id " + idPaquete);
    }
    @Override
    public String toString() {
        return "Repartidor: " + nombre +
                "DNI: " + DNI +
                "Paquetes: " + paquetes.size();
    }
}
