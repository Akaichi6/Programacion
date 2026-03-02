package EJERCICIOS_F_APP;

import java.util.*;

//atributos
public class App {
    //ATRIBUTOS
    private String nombreEmpresa;
    private Set<Cuenta> cuentas;

    //CONSTANTES
    private Scanner sc = new Scanner(System.in);
    private final String contrasenya_correcta ="1234";
    private final String usuario_correcto = "admin";

    public App(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.cuentas = new HashSet<>();
    }

    public Set<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Set<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public boolean login (){
    boolean acceso = false;

     for ( int i = 0; i < 3; i++ ) {

             System.out.print("introduce el usuario: ");
             String usuario = sc.nextLine().toLowerCase();
             System.out.print("Introduce la contraseña: ");
             String contrasenya = sc.nextLine().toLowerCase();

             if (contrasenya_correcta.equals(contrasenya) && usuario_correcto.equals(usuario)) {
                 acceso = true;
                 break;

             }else  {
                 acceso = false;
                 System.out.println("El usauario o la contraseña no son correcto vuelve a intentarlo");
             }
     }
     if (!acceso) {
         System.out.println("Has superado el numero de intentos");
     }
     return acceso;
 }
 public void menuSeleccionarOpcion(){

     System.out.println("** Bienvenido a DAW STOCK MANAGEMENT **");
     System.out.println("---------------------------------------");
     System.out.println("cuentas administradas " +  cuentas.size());
     System.out.println("---------------------------------------");
     System.out.println("1. Crear cuenta");
     System.out.println("2. Consultar cuentas");
     System.out.println("3. Consultar transacciones");
     System.out.println("4. Realizar transacciones");
     System.out.println("5. Salir");
     System.out.print("Elige una opción: ");
     int opcion = sc.nextInt();

    switch (opcion) {
        case 1:
            crearCuenta();
            break;
        case 2:
            consultarCuenta();
            break;
        case 3:
            consultarTransacciones();
            break;
        case 4:
            realzarTransacciones();
            break;
        case 5:
            salir();
            break;
    }
 }

 public void crearCuenta(){
     System.out.println("-- ALTA DE CUENTA --");
     System.out.print("DNI del responsable: ");
     String dni= sc.next().toLowerCase().trim();

     //validar formato dni
     if (dni.matches("[0-9]{8}[A-Z]")){
         System.out.println("El DNI es correcto");
     }else {
         System.out.println("El DNI es incorrecto");
     }

     // buscar dni dentro de cada cuenta
     for ( Cuenta cuenta : cuentas ) {
        if (cuenta.getDniResponsale().equals(dni)) {
            System.out.println("El dni existe");
            return;
        }
     }

     System.out.println("Departamento: ");
     String departamento = sc.next().toLowerCase().trim();
     try {

     }
 }
 public void consultarCuenta(){
     System.out.println("Introduce DNI o código de cuenta: ");
     String dni = sc.next().toLowerCase().trim();
 }
 public void consultarTransacciones(){

     System.out.println("Introduce DNI o codigo de cuenta: ");
     String codigo = sc.next();
     System.out.println("Transacciones a fecha ");
     String fecha = sc.next();
 }
 public void realzarTransacciones() {

 }
 public void salir (){
     System.out.println("Saliendo");
  }


}
