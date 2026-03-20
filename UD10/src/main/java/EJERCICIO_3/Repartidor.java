package EJERCICIO_3;

import java.util.ArrayList;

public class Repartidor {
    private String nombre;
    private String DNI;
    private ArrayList<Paquete> paquetes;

    public Repartidor(String nombre, String DNI, ArrayList<Paquete> paquetes) {

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
    public void asignarPaquete(Paquete paquete){
        paquetes.add(paquete);
        if (paquetes.size()>10){

        }
    }
}
