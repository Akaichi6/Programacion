package EXAMEN_DE_PRUEBA;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> lista_invertida = new ArrayList<>();

        System.out.println("poc ");
        String numeros_comprobacion= sc.nextLine();      //" 50,   60, 12, -65   ,0,   57,-21,-15 ,  -64  ";

        String[] numeros_separados = numeros_comprobacion.split(" ");
        String[] numeros_sin_espacios;

        String total = "";
        String posicion;

        for (int i=0;i< numeros_separados.length;i++)
        {
            for (int j = 0; j < numeros_separados[i].length(); j++)
            {

                posicion = String.valueOf(numeros_separados[i].charAt(j));

                if (!posicion.equals(" "))
                {
                    total += posicion;
                }
            }
        }

        numeros_sin_espacios=total.split(",");

        for (int cont=0;cont<numeros_sin_espacios.length;cont++)
        {
            lista.add(Integer.valueOf(numeros_sin_espacios[cont]));
        }

        Collections.sort(lista);

        int max;
        int min;

        min=Collections.min(lista);
        max=Collections.max(lista);

        lista_invertida.addAll(lista);

        Collections.sort(lista_invertida, Collections.reverseOrder());

        System.out.println("Lista ordenada: "+lista);
        System.out.println("Lista invertida: "+lista_invertida);
        System.out.println("Numero mayor: "+max);
        System.out.println("Numero menor: "+min);

    }
}
