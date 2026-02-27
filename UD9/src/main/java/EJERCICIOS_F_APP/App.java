package EJERCICIOS_F_APP;

import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
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

             System.out.println("introduce el usuario: ");
             String usuario = sc.nextLine();
             System.out.print("Introduce la contraseña: ");
             String contrasenya = sc.nextLine();

             if (contrasenya_correcta.equals(contrasenya) && usuario_correcto.equals(usuario)) {
                 acceso = true;

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

     System.out.print("1. Crear cuenta");
     System.out.println("2. Consultar cuentas");
     System.out.println("3. Consultar transacciones");
     System.out.println("4. Realizar transacciones");
     System.out.println("5. Salir");
     System.out.println("Elige una opción: ");
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
     System.out.println("DNI del ressponsable: ");
     String dni_responsable = sc.next();
     System.out.println("Departamento: ");
     String departamento = sc.next();

 }
 public void consultarCuenta(){
     System.out.println("Introduce DNI o código de cuenta: ");
     String dni = sc.next();
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
