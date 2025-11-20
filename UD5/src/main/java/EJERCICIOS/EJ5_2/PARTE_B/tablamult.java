package EJERCICIOS.EJ5_2.PARTE_B;

public class tablamult {
    public static void main(String[] args) {
        int numtabla = 1; // número de la tabla

        while (numtabla <= 10) { // bucle exterior -> tablas del 1 al 10

            int multiplicador = 1; // multiplicador de cada tabla

            System.out.println("Tabla del " + numtabla + ":");

            while (multiplicador <= 10) { // bucle interior -> multiplicaciones del 1 al 10
                System.out.println(numtabla + " x " + multiplicador + " = " + (numtabla * multiplicador));
                multiplicador++;
            }

            System.out.println(); // línea en blanco para separar tablas
            numtabla++;
        }
    }
}
