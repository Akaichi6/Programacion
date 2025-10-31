package pruebas;

public class EJEMPLOS {
    public static void main(String[] args) {
        //conversiones
            // de int a char
            char a = (char) 500; // a es Ǵ
            System.out.println(a);
            // de float a char
            char b = (char) 2000.53f; // b es el caracter ߐ, se pierden los decimales
            System.out.println(b);
            // de float a int
            int c = (int) 14.67565f; // c es 14, se pierden los decimales
            // Formas de convertir variables a String (Concatenar cadena vacía)
            String v1 = "" + 'a'; // v1 es "a"
            String v2 = "" + 865; // v2 es "865"
            String v3 = "" + 23.78f; // v3 es "23.78"
            boolean encontrado = true;
            String v4 = "" + encontrado; // v4 es "true"
            System.out.printf("%s / %s / %s / %s%n", v1, v2,v3,v4);
            // Formas de convertir variables a String (función valueOf)
            String v5 = String.valueOf('a'); // v5 es "a"
            String v6 = String.valueOf(865); // v6 es "865"
            String v7 = String.valueOf(23.78f); // v7 es "23.78"
            String v8 = String.valueOf(encontrado); // v8 es "true"
            System.out.printf("%s / %s / %s / %s%n", v5, v6,v7,v8);
            //No se puede convertir String a Char, pero sí extraer caracteres de una
            //determinada posición
            char v = "Viernes".charAt(0); // v es 'V'
            char l = "Lunes".charAt(4); // l es 's'
            System.out.println("Ejemplo charAt: " + v + " " + l);
            //Conocer longitud de un String
            String var10 = "HOLA COMO ESTAS";
            System.out.println("LENGTH VAR10: " + var10.length());
            //parseInt() y parseFloat()
            String n1 = "213";
            int n11 = Integer.parseInt(n1); // n11 es 213
            String n2 = "23.78";
            float n22 = Float.parseFloat(n2); // n22 es 23.78f
            System.out.println("Ejemplo parseInt: " + n11 + " y parseFloat " + n22);

            // colores
                String ANSI_BLACK = "\u001B[30m";
                String ANSI_RED = "\u001B[31m";
                String ANSI_GREEN = "\u001B[32m";
                String ANSI_YELLOW = "\u001B[33m";
                String ANSI_BLUE = "\u001B[34m";
                String ANSI_PURPLE = "\u001B[35m";
                String ANSI_CYAN = "\u001B[36m";
                String ANSI_WHITE = "\u001B[37m";
                System.out.println(ANSI_BLACK + "Texto de color negro");
                System.out.println(ANSI_RED + "Texto de color rojo");
                System.out.println(ANSI_GREEN + "Texto de color verde");
                System.out.println(ANSI_YELLOW + "Texto de color amarillo");
                System.out.println(ANSI_BLUE + "Texto de color azul");
                System.out.println(ANSI_PURPLE + "Texto de color morado");
                System.out.println(ANSI_WHITE + "Texto de color blanco");
                System.out.println(ANSI_CYAN + "Texto de color cyan");
                System.out.println("------------------------------------------------------------");
                System.out.println(ANSI_GREEN);
                System.out.println("ESCRIBO EN VERDE");
                System.out.println("SIGO ESCRIBIENDO EN VERDE PORQUE NO HE CAMBIADO DE COLOR");
                System.out.println(ANSI_BLUE + "CAMBIO A AZUL");
                System.out.println("SIGO ESCRIBIENDO EN AZUL HASTA QUE VUELVA A CAMBIAR DE COLOR");
                System.out.println("AZUL");
                System.out.println("AZUL");
                System.out.println("AZUL");
                System.out.println(ANSI_RED + "CAMBIO A ROJO");

                // decimalformat
                    //DecimalFormat df = new DecimalFormat("####.##");
                   // System.out.println(df.format(10.43456458)); //10,43
                   // df = new DecimalFormat("0000.00");
                   // System.out.println(df.format(10.4)); //0010,40
                    //df = new DecimalFormat("###.##%");
                    //System.out.println(df.format(0.3444)); //34,44%
                    //double a = 1.2345;
                    //double b = 1.2356;
                    //df = new DecimalFormat("#.##");
                    //System.out.println(df.format(a)); // 1,23
                    //System.out.println(df.format(b)); // 1,24



    }
}
