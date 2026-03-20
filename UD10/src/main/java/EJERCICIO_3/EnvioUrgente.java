package EJERCICIO_3;

import java.time.LocalDate;

public class EnvioUrgente extends Paquete {
    public EnvioUrgente(double peso) {
        super(peso);
        LocalDate fechaUrgente = LocalDate.now().plusDays(2);
        if (getFecha_estimada().isAfter(fechaUrgente)) {
            throw new IllegalArgumentException("No se puede garantizar a entrega en 48H");
        }
    }
    @Override
    public boolean estaRetrasado() {
        return !LocalDate.now().isBefore(getFecha_estimada()) && getEstado() == EstadoEnvio.ENTREGADO;
    }

    @Override
    public String toString() {
        return "[URGENTE]" + super.toString();
    }
}
