package EXAMEN_DE_PRUEBA;

import java.util.*;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] paises={"Europa","África","Oceanía","Australia","Norte América","Europa","Sud América","Australia"};

        ArrayList<String> lista = new ArrayList<>();

        Collections.addAll(lista, paises);

        LinkedHashSet<String> conjuntos_sin_copias = new LinkedHashSet<>(lista);

        TreeSet<String> conjuntos_ordenados = new TreeSet<>(conjuntos_sin_copias);

        System.out.println(conjuntos_sin_copias);
        System.out.println(conjuntos_ordenados);

        System.out.print("Introduce un continente para buscar: ");
        String continente = sc.nextLine();

        if (conjuntos_sin_copias.contains(continente)){
            System.out.println("El continente '"+continente+"' esta en el conjunto");
        }else {
            System.out.println("El continente '"+continente+"' no esta en el conjunto");
        }
    }
}
