
 
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
        
        System.out.println("-- 1 Efectivo ------------ ");
        System.out.println("-- 2 Tarjeta de Crédito  - ");
        System.out.println("-- 3 Tarjeta de débito  -- ");
        System.out.print("---- Ingrese método de pago: ");
        formaPago= leerFormaPago.nextInt();
        
        switch(formaPago){
            case 1:
                total= importe / 1.4;
                System.out.println("-------------------------"      );
                System.out.println("Importe: $" + importe +"---"      );
                System.out.println("Medio de pago: EFECTIVO "       );
                System.out.println("DESCUENTO 10%" );
                System.out.println("TOTAL: $" + total );
                System.out.println("GRACIAS POR SU COMPRA ---------");
                break;
            case 2:
                total= importe * 1.2;
                System.out.println("Importe: $" + importe +"----------");
                System.out.println("Medio de pago: TARJETA CRÉDITO " );
                System.out.println("RECARGO 20%" );
                System.out.println("TOTAL: $" + total );
                System.out.print("Ingrese el numero de tarjeta: ");
                numeroTarjeta= leerFormaPago.nextInt();
                System.out.println("GRACIAS POR SU COMPRA ---");
            break;    
            case 3:
                total = importe * 1.1;
                System.out.println("Importe: $" + importe +"----------");
                System.out.println("Medio de pago: TARJETA DÉBITO" );
                System.out.println("RECARGO 10%" );
                System.out.println("TOTAL: $" + total );
                System.out.println("GRACIAS POR SU COMPRA ---");
            default:
                System.out.println("LA OPCIÓN ELEGIDA NO ES CORRECTA.");
                System.out.println("POR FAVOR, VUELVA A INTENTARLO.");
            break;
        }
    }
    
}
