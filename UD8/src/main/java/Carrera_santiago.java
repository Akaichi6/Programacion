import java.util.*;

public class Carrera_santiago {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Map<String, Double> corredores = new HashMap<>();
        corredores.put("C-101", 58.47);
        corredores.put("N-225", 62.88);
        corredores.put("C-340", 65.0);
        corredores.put("P-175", 75.56);
        corredores.put("Z-067", 54.0);


    }

    public static void validarTiempo (double tiempo) {
           if(tiempo<30 && tiempo> 120){
               throw new TiempoInvalidoEx(String.valueOf(tiempo));
           }
    }
    public static void validarDorsal (String dorsal) {
            if (!dorsal.matches("^[A-Z]-\\d{3}$")) {
                throw new DorsalInvalidoEx(dorsal);
            }
    }
    public static Map<String, Double> obtenerCorredoresRapidos(double record, Map<String, Double> corredores)
            throws TiempoInvalidoEx, DorsalInvalidoEx {
        Map<String, Double> rapidos = new TreeMap<>();

        for (Map.Entry<String, Double> entrada : corredores.entrySet()) {
            String dorsal = entrada.getKey();
            Double tiempo = entrada.getValue();

            validarDorsal(dorsal);
            validarTiempo(tiempo);

            if (tiempo < record) {
                rapidos.put(dorsal, tiempo);
            }
        }
        return rapidos;
    }
    public static double calcularMedia (Map<String, Double> corredoresRapidos) {

        if (corredoresRapidos.isEmpty())
            return 0;

        double media = 0;
        double suma = 0;

        return media;
    }
}
class TiempoInvalidoEx extends RuntimeException {
    public TiempoInvalidoEx(String msg) {
        super("Tiempo invalido");
    }
}
class DorsalInvalidoEx extends RuntimeException {
    public DorsalInvalidoEx(String msg) {
        super("Dorsal invalido");
    }
}

