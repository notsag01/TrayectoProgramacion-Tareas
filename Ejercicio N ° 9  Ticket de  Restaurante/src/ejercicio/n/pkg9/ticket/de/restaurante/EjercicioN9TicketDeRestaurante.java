
package ejercicio.n.pkg9.ticket.de.restaurante;

import java.util.Scanner;


public class EjercicioN9TicketDeRestaurante {

   
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        
        String nombreMozo;

        double subtotal;
        double total;
        int formaDePago;
        int numeroTarjeta;
        
        System.out.print("Ingrese el nombre del mozo: ");
        nombreMozo=datos.nextLine();
        System.out.print("Ingrese el subtotal: ");
        subtotal=datos.nextFloat();
        
         System.out.println("FORMA DE PAGO");
        System.out.println(" 1: EFECTIVO");
        System.out.println(" 2: TARJETA DE DEBITO");
        System.out.println(" 3: TARJETA DE CREDITO");
        System.out.print(" INGRESE LA FORMA DE PAGO: ");
        formaDePago = datos.nextInt();
        
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("RESTAURANTE CFP N°36");
        System.out.println("ZABALETA 204, C1437EYF CABA");
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.print("CAJA 1  ");
        System.out.println("TICKET 0001");
        System.out.print("LO ATENDIO: ");
        System.out.println(nombreMozo);
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("Subtotal: $" + subtotal);
        
        if(formaDePago ==1 ){
            System.out.println("Forma de pago: EFECTIVO");
            System.out.println("Descuento: 30%");
            total= (subtotal / 1.3);
            System.out.println("TOTAL: $" + total);
            System.out.println("----------------------");
            System.out.println("GRACIAS POR SU COMPRA.");
            System.out.println("----------------------");
             
        }else if(formaDePago == 2){
            System.out.println("Forma de pago: DEBITO");        
            System.out.println("Recargo: 10%");      
            total=(subtotal * 1.1);
            System.out.println("TOTAL: $" + total);
            System.out.print("Ingres el número de su tarjeta: ");
            numeroTarjeta= datos.nextInt();
            System.out.print("Ingres el número de cuotas: ");
            System.out.println("----------------------");
            System.out.println("GRACIAS POR SU COMPRA.");
            System.out.println("----------------------");     
            
        }else{
            System.out.println("Forma de pago: CREDITO");        
            System.out.println("Recargo: 30%");    
            total=(subtotal * 1.3);
            System.out.println("TOTAL: $" + total);
            System.out.print("Ingres el número de su tarjeta: ");
            numeroTarjeta= datos.nextInt();
            System.out.print("Ingres el número de cuotas: ");
            int cantidadCuotas = datos.nextInt();
            System.out.println("----------------------");
            System.out.println("GRACIAS POR SU COMPRA.");
            System.out.println("----------------------");  
        }
        

       
        
        
        

    }
    
}
