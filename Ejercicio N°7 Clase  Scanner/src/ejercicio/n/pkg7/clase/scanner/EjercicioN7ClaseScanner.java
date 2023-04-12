
package ejercicio.n.pkg7.clase.scanner;

import java.util.Scanner;


public class EjercicioN7ClaseScanner {

   
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        
        /*
        Realizar un programa en el cual se le solicite al usuario :
        Nombre
        Apellido
        DNI
        Año de Nacimiento
        Luego de ingresar los datos por consola, calcular la edad del usuario e imprimir 
        toda la información del usuario en un recuadro por consola.
        */
        String nombre;
        String apellido;
        int dni;
        int añoNacimiento;
        int edad;
        int añoActual= 2023;
        
        System.out.print("Ingrese su nombre: ");
        nombre= lector.nextLine();
        
        System.out.print("Ingrese su apellido: ");
        apellido= lector.nextLine();
        
        System.out.print("Ingrese su dni: ");
        dni= lector.nextInt();

        System.out.print("Ingrese su Año de nacimiento: ");
        añoNacimiento= lector.nextInt();
        
        edad = añoActual - añoNacimiento;
        
        System.out.println("Hola, "+ nombre + " " + apellido + ". Tu dni es " +
                dni + " y tu edad es " + edad);
        
        
 

    }
    
}
