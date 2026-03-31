package EJERCICIO_8;

import java.util.Comparator;

public class ComparaSalario implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        // Casting para poder usar getSalarioBase()
        Empleado e1 = (Empleado) obj1;
        Empleado e2 = (Empleado) obj2;

        if (e1.getSalarioBase() < e2.getSalarioBase()) {
            return -1; // e1 va primero (menor salario)
        } else if (e1.getSalarioBase() > e2.getSalarioBase()) {
            return 1;  // e2 va primero
        } else {
            return 0;  // Empate
        }
    }
}
