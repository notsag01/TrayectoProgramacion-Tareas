
package metodossll;

import java.util.Scanner;


public class MetodosSLL {

    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Scanner leerNum= new Scanner(System.in);
        
        int cantidadCaracteres,desde, hasta;
        String cortado;
        String nombre="";
        
        System.out.print("Escriba su nombre: ");
        nombre = leer.nextLine();
        System.out.print("Desde: ");
        desde = leerNum.nextInt();
        System.out.print("Hata: ");
        hasta = leerNum.nextInt();
        
        cantidadCaracteres= nombre.length();
        cortado=nombre.substring(desde,hasta);
        System.out.println(cantidadCaracteres);
        System.out.println(cortado);
    }
    
}
