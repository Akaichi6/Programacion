package EJERCICIO_4;

public class Satelite extends Astro{
    private double distanciaAlPlaneta;
    private double orbitaPlanetaria;
    private String planetaPertenece;

    public Satelite(String nombre, double raio, double rotacion, double masa, double gravedad, double temperaturaMedia) {
        super(nombre, raio, rotacion, masa, gravedad, temperaturaMedia);
    }

    @Override
    public void muestra() {

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

    public String getPlanetaPertenece() {
        return planetaPertenece;
    }

    public void setPlanetaPertenece(String planetaPertenece) {
        this.planetaPertenece = planetaPertenece;
    }
}
