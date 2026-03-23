package EJERCICIO_4;

public class Satelite extends Astro{
    private double distanciaAlPlaneta;
    private double orbitaPlanetaria;
    private Planeta planetaPertenece;

    public Satelite(String nombre, double raio, double rotacion, double masa, double gravedad, double temperaturaMedia, double distanciaAlPlaneta, double orbitaPlanetaria, Planeta planetaPertenece) {
        super(nombre, raio, rotacion, masa, gravedad, temperaturaMedia);
        if (distanciaAlPlaneta < 0) {
            throw new IllegalArgumentException("La Distancia al planeta no puede ser menor a 0.");
        }
        if (orbitaPlanetaria < 0) {
            throw new IllegalArgumentException("\"El orvita al sol debe ser mayor que 0 Km");
        }
        this.distanciaAlPlaneta = distanciaAlPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaPertenece = planetaPertenece;
        planetaPertenece.anyadirSatelite(this);
    }

    public double getDistanciaAlPlaneta() {
        return distanciaAlPlaneta;
    }

    public void setDistanciaAlPlaneta(double distanciaAlPlaneta) {
        this.distanciaAlPlaneta = distanciaAlPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public Planeta getPlanetaPertenece() {
        return planetaPertenece;
    }

    public void setPlanetaPertenece(Planeta planetaPertenece) {
        this.planetaPertenece = planetaPertenece;
    }

    @Override
    public void muestra() {
        System.out.println("--Satelite--");
        System.out.println("Nombre: " + nombre);
        System.out.println("Radio: " + radio + "Km");
        System.out.println("Rotacion: " + rotacion + "horas");
        System.out.println("Masa: " + masa + "kg");
        System.out.println("Gravedad: " + gravedad + "m/s^2");
        System.out.println("Temperatura: " + temperaturaMedia + "ºC");
        System.out.println("Distancia al planeta: " + distanciaAlPlaneta + "Km");
        System.out.println("Orbita planetaria: " + orbitaPlanetaria + "Km");
        System.out.println("Pertenencia: " + planetaPertenece.getNombre());
    }
}
