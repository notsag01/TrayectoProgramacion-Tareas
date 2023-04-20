
 
package ejercicio.n.pkg10.pkgswitch;

import java.util.Scanner;

public class EjercicioN10SWITCH {

   
    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        Scanner leerFormaPago= new Scanner(System.in);
        
        double importe;
        double total;
        int formaPago;
        int numeroTarjeta;
        
        System.out.print("Ingrese un importe: ");
        importe = leer.nextDouble();
        
        System.out.println("-- Ingrese método de pago: ");
        System.out.println("-- 1 Efectivo ------------ ");
        System.out.println("-- 2 Tarjeta de Crédito  - ");
        System.out.println("-- 3 Tarjeta de débito  -- ");
        formaPago= leerFormaPago.nextInt();
        
        switch(formaPago){
            case 1:
                total= importe / 1.4;
                System.out.println(total);
                break;
            case 2:
                total= importe * 1.2;
                System.out.println(total);
                System.out.print("Ingrese el numero de tarjeta: ");
                numeroTarjeta= leerFormaPago.nextInt();
            case 3:
                
            default:
            break;
        }
    }
    
}
