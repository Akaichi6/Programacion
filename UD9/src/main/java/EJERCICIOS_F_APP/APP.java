package EJERCICIOS_F_APP;

import java.util.Scanner;
import java.util.Set;
//atributos
public class APP {
    private String nombreEmpresa;
    private Set<Cuenta> cuentas;
    private Scanner sc = new Scanner(System.in);

 public boolean login (){

     return true;
 }
 public void menu(){

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



    }
 }
 public void crearCuenta(){
     System.out.println("-- ALTA DE CUENTA --");
     System.out.println("DNI del ressponsable: ");
     String dni = sc.next();
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
}
