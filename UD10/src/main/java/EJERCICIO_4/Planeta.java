package EJERCICIO_4;

import java.util.ArrayList;

public class Planeta extends Astro {
    private double distanciaAlSol;
    private double orvitaAlSol;
    private boolean tieneSatelites;
    private ArrayList<Satelite>  satelites;

//constructor

    public Planeta(String nombre, double raio, double rotacion, double masa, double gravedad, double temperaturaMedia, double distanciaAlSol, double orvitaAlSol) {
        super(nombre, raio, rotacion, masa, gravedad, temperaturaMedia);

        if (distanciaAlSol < 0){
            throw new IllegalArgumentException("El distancia al sol debe ser mayor que 0");
        }
        if  (orvitaAlSol < 0){
            throw new IllegalArgumentException("El orvita al sol debe ser mayor que 0 Km");
        }

        this.distanciaAlSol = distanciaAlSol;
        this.orvitaAlSol = orvitaAlSol;
        this.tieneSatelites = false;
        this.satelites = satelites;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public void setDistanciaAlSol(double distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public double getOrvitaAlSol() {
        return orvitaAlSol;
    }

    public void setOrvitaAlSol(double orvitaAlSol) {
        this.orvitaAlSol = orvitaAlSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = false;
    }

    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }

    public void setSatelites(ArrayList<Satelite> satelites) {
        this.satelites = new ArrayList<>();
    }

// metodos

    @Override
    public void muestra() {
        System.out.println("--Planeta--");
        System.out.println("Nombre: " + nombre);
        System.out.println("Radio: " + radio + "Km");
        System.out.println("Rotacion: " + rotacion + "horas");
        System.out.println("Orvita: " + orvitaAlSol + "días");
        System.out.println("Masa: " + masa + "kg");
        System.out.println("Gravedad: " + gravedad + "m/s^2");
        System.out.println("Temperatura: " + temperaturaMedia + "ºC");
        System.out.println("Distancia alsol: " + distanciaAlSol + "Km");
        System.out.println("Tiene Satelites: " + tieneSatelites);

        if (tieneSatelites == true) {
            for (Satelite s : satelites) {
                System.out.println("\t" + s.getNombre());
            }
        }
    }
    public void anyadirSatelite(Satelite s) {
        satelites.add(s);
        tieneSatelites = true;
    }
}
