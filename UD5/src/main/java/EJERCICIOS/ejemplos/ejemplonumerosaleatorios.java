package EJERCICIOS.ejemplos;

public class ejemplonumerosaleatorios {
    public static void main(String[] args) {
        // aleatorio entre dos rangos
        int aleatoio , rangoini, rangofin;
        rangoini = 150;
        rangofin = 200;
        aleatoio = (int) (Math.random() * (rangofin - rangoini + 1));
        System.out.printf("aleatoio entre %d y %d: ", aleatoio);
    }
}
