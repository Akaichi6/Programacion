package EJERCICIOS_D;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("46084137A","Santiago", "Palacios Navarro",28);
        Persona p2 = new Persona("22126577W","Jose","Palacios Perez",67);

        p1.imprime();
        System.out.println(" ");
        System.out.println(" La personas es mayor de edad: " + p1.esMayorEdad());
        p1.diferenciaEdad(p1);
        p1.esJubilado();
        System.out.println(" La persona es jubilado/a: " + p1.esJubilado());
        System.out.println(" La diferencia de edad entre las personas es: " + p1.diferenciaEdad(p2));

        p2.imprime();
        System.out.println(" ");
        System.out.println(" La personas es mayor de edad: " + p2.esMayorEdad());
        p2.esJubilado();
        System.out.println(" La persona es  jubilado/a: " + p2.esJubilado());
        p2.diferenciaEdad(p1);
        System.out.println(" La diferencia de edad entre las personas es: " + p2.diferenciaEdad(p1));

        Articulo a1 = new Articulo("Detergente Ariel", 12.99, 21, 20);
        Articulo a2 = new Articulo("Saco Patatas", 8.99, 10, 100);

        a1.imprimir();
        a1.getPVP();
        a1.vender();
        a1.comprar();

        a2.imprimir();
        a2.getPVP();
        a2.vender();
        a2.comprar();

    }
}
