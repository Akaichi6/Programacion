package EJERCICIO_1;

import java.util.Arrays;

public class VehiculosPrincipal {
    public static void main(String[] args) {
        Coche coche = new Coche("Honda","Cívic",180.0, 4);
        Moto moto = new Moto("Honda","CBR",220, 600);
        Camion camion = new Camion("Volvo", "FH16", 120, 20000,8000);
        Barco barco = new Barco("Beneteau", "Oceanis", 40, 12.5);
        Avion avion = new Avion("Boeing", "737", 900, 12000);

        // aceleraciones
        coche.acelerar(50);
        moto.acelerar(60);
        camion.acelerar(30);
        barco.acelerar(10);
        avion.acelerar(200);

        //Información vehiculos
        System.out.println("-- Información de Vehículos --");
        System.out.println(coche.mostrarInfo());
        System.out.println(moto.mostrarInfo());
        System.out.println(camion.mostrarInfo());
        System.out.println(barco.mostrarInfo());
        System.out.println(avion.mostrarInfo());

        // orden
        Vehiculo [] vehiculos = {coche, moto, camion, barco, avion};
        Arrays.sort(vehiculos);
        System.out.println("--Vehículos ordenados por velocidad--");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.mostrarInfo());
        }
    }
}
