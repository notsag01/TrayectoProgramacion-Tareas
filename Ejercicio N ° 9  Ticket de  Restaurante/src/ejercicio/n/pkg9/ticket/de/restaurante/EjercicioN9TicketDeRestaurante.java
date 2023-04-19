
package ejercicio.n.pkg9.ticket.de.restaurante;

import java.util.Scanner;


public class EjercicioN9TicketDeRestaurante {

   
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        
        String nombreMozo;

        double totalCosunmido;
        int formaDePago;
        int cantidaCuotas;
        double descuentoEfectivo= 0.3;
        double descuentoDebito= 0.1;
        double recargoCredito= 0.1;
        double gaseosa=100;
        double milanesa=100;
        double flan=100;
        double cafe=100;
        double subtotal= gaseosa + milanesa + flan + cafe;
        
        System.out.print("Ingrese el nombre del mozo: ");
        nombreMozo=datos.nextLine();
        
        System.out.println(" INGRESE LA FORMA DE PAGO");
        System.out.println(" 1: EFECTIVO");
        System.out.println(" 2: TARJETA DE DEBITO");
        System.out.println(" 3: TARJETA DE CREDITO");
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
        System.out.print(nombreMozo);
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("1 GASEOSA");
        System.out.println("1 MILANESA NAPOLITANA CON FRITAS");
        System.out.println("1 FLAN CON CREMAS");
        System.out.println("1 CAFE");
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.print("SUBTOTAL: $");
        System.out.println(subtotal);
        System.out.print("FORMA DE PAGO");
//        if(formaDePago== 1){
//            System.out.println("EFECTIVO");
//        }
        
        

    }
    
}
