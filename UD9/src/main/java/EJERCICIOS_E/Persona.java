package EJERCICIOS_E;

public class Persona {

        private final String dni;
        private String nombre;
        private String apellido;
        private int edad;
        private final static int mayoriaEdad = 18;

        public Persona(String dni, String nombre, String apellido, int edad) {
            this.dni = dni;
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }


        public String getDni() {
            return dni;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void imprime(){
            System.out.print("" +
                    "\n DNI: " + dni
                    + "\n Nombre: " + nombre
                    + "\n Apellido: " + apellido
                    + "\n Edad: " + edad);
        }
        public boolean esMayorEdad(){
            boolean mayor = false;
            if(edad>18){
                mayor = true;
            }
            return mayor;
        }
        public boolean esJubilado(){
            boolean jubilado = false;
            if(edad>=65){
                jubilado = true;
            }
            return jubilado;
        }
        public int diferenciaEdad(Persona p){
            int resta = this.edad-p.edad;
            return Math.abs(resta);
        }
        public static boolean validarDNI(String dni){
            boolean valido = false;
            if(dni.length()==11){

            }
            return valido;
        }
}
