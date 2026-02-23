package EJERCICIOS_E;

import EJERCICIOS_E.Persona;

public class Main {
    public static void main(String[] args) {
        EJERCICIOS_D.Persona p1 = new EJERCICIOS_D.Persona("46084137A","Santiago", "Palacios Navarro",28);
        EJERCICIOS_D.Persona p2 = new EJERCICIOS_D.Persona("22126577W","Jose","Palacios Perez",67);

        Persona.validarDNI();
    }
}
