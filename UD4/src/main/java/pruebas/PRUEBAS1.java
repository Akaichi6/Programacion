package pruebas;

public class PRUEBAS1 {
    public static void main(String[] args) {
        double a = 9.0, b = -4.7;

        // Raíz cuadrada y potencia
        System.out.println("√9 = " + Math.sqrt(a)); // 3.0
        System.out.println("2^5 = " + Math.pow(2, 5)); // 32.0
        // Valor absoluto y signo
        System.out.println("|-4.7| = " + Math.abs(b)); // 4.7
        System.out.println("Signo de -4.7 = " + Math.signum(b)); // -1.0
        // Redondeos
        System.out.println("floor(4.7) = " + Math.floor(4.7)); // 4.0
        System.out.println("ceil(4.7) = " + Math.ceil(4.7)); // 5.0
        System.out.println("round(4.7) = " + Math.round(4.7)); // 5
        // Máximo, mínimo y módulo
        System.out.println("max(9, -4.7) = " + Math.max(a, b)); // 9.0
        System.out.println("min(9, -4.7) = " + Math.min(a, b)); // -4.7
        System.out.println("9 mod 4 = " + Math.floorMod(9, 4)); // 1
        // Números aleatorios
        System.out.println("Número aleatorio [0,1): " + Math.random());
        System.out.println("Número aleatorio [1,10]: " + (1 + (int)(Math.random() * 10)));
        // Trigonometría (en radianes)
        double angulo = Math.toRadians(30);
        System.out.println("sin(30°) = " + Math.sin(angulo)); // 0.5 aprox
        System.out.println("cos(30°) = " + Math.cos(angulo)); // 0.866 aprox
        System.out.println("tan(30°) = " + Math.tan(angulo)); // 0.577 aprox
        // Constantes
        System.out.println("π = " + Math.PI);
        System.out.println("e = " + Math.E);

    }
}
