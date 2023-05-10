
package servicio.aumotmores;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class SERVICIOAUMOTMORES {

   
    public static void main(String[] args) {
        
//        Crear un programa para un totem en una  empresa de servicio automotores, el cual el cliente debe completar y finalizado imprime un ticket de espera. Para lo cual debe solicitar:
//-Nombre del cliente
//-Teléfono
//-Dominio del vehículo
//-Debe seleccionar la marca de su vehículo (traída de un vector de marcas)
//-Debe seleccionar el servicio que desea hacer (traído de un vector de servicios)
//    - Alineación
//    - Balanceo (indicar cantidad)
//    - Cambio de aceite 
//    - Cambio de cubiertas (indicar cantidad)
//- Debe cargar un vector con los servicios que se seleccionaron para mostrarlos luego en el ticket
//-Finalizado la carga debe imprimir un ticket para que el cliente lo tenga con un numero aleatorio de espera
////Imprimir ticket
//        System.out.println("\n==================================");
//        System.out.println("======== Bienvenido ==============");
//        System.out.println("Centro de Servicios Automotor CFP N°36\nZavaleta 204, C1437EYF, CABA");
//        System.out.println("=====Nº ORDEN: " + numerodeespera + "===========================");
//        System.out.println("Nombre del Cliente: " + nombre);
//        System.out.println("DNI del cliente: " + dni);
//        System.out.println("Marca del Vehiculo: " + marca);
//        System.out.println("Dominio del Vehiculo: " + domVehiculo);
//        System.out.println("==================================");
//        System.out.println("Cantidad de servicios: " + cont);
//       
//System.out.println("Los servicios son : " + cont2);
//        System.out.println("==================================");
        
//******************************************************************************      
//******************************************************************************      
     
       
        //VARIABLES
        Scanner datos= new Scanner(System.in);
        Random nRandom= new Random();
       
        //VARIABLES
        String tickets [][]= new String [3] [6];
        
        tickets[0][0]="NOMBRE";
        tickets[0][1]="TELEFNO";
        tickets[0][5]="DNI";
        tickets[0][2]="DOMINIO";
        tickets[0][3]="MARCA";
        tickets[0][4]="SERVICIO1";
        
        
        String nombre= " ";
        String dni=" ";
        String telefono=" ";
        String dominio=" ";
        String marca="";
        int servicio;
        String servicios ="";
        int numeroEspera=nRandom.nextInt(100)+1;
       
        System.out.print("nombre: ");
        nombre=datos.nextLine();
        tickets[1][0]= nombre;
        System.out.print("Numero DNI: ");
        dni=datos.nextLine();
        tickets[1][5]=dni;
        System.out.print("telefono: ");
        telefono=datos.nextLine();
        tickets[1][1]= telefono;
        System.out.print("dominio: ");
        dominio=datos.nextLine();
        tickets [1][2]= dominio;
        
        
                  
        System.out.println("***   MARCA   ***");
        System.out.println("1- FORD    ");
        System.out.println("2- PEUGEOT      ");
        System.out.println("3- RENAULT       ");
        System.out.println("4- NISSAN     ");
        System.out.println("5- FIAT     ");
        System.out.print("LA MARCA DEL AUTO((numero): ");
        marca=datos.nextLine();
       
        switch (marca){
            case "1" : tickets[1][3]= "FORD";
            break;
            case "2": tickets[1][3]="PEUGEOT";
            break;
            case "3": tickets[1][3]=" RENAULT";
            break;
            case "4": tickets[1][3]=" NISSAN";
            break;
            default: System.out.print("no ha elegido un servicio.");
            break;
        }
        
       
        System.out.println("***   SERVICIOS   ***");
        System.out.println("1- ALINEACION    ");
        System.out.println("2- BALANCEO      ");
        System.out.println("3- ACEITE        ");
        System.out.println("4- CUBIERTAS     ");
        System.out.print("Elija un servicio((numero): ");
        servicio=datos.nextInt();
        
       
       
        switch (servicio){
            case 1 : tickets[1][4]= "ALINEACION";
            break;
            case 2: 
                    tickets[1][4]="BALANCEO";
                    String cantidadCubiertas="";
                    System.out.print("Cantidad: ");
                    cantidadCubiertas=datos.nextLine();
                    tickets[2][4]=cantidadCubiertas;
            break;
            case 3: tickets[1][4]=" ACEITE";
            break;
            case 4: tickets[1][4]=" CUBIERTAS";
            break;
            default: System.out.print("no ha elegido un servicio.");
            break;
        }
        
        
        
        
//        for(int f=0; f<tickets.length;f++){
//            for(int c=0; c<tickets[f].length;c++){
//                System.out.println(tickets[f][c]);
//            }            
//        }
        
          System.out.println("\n==================================");
          System.out.println("======== Bienvenido ==============");
          System.out.println("Centro de Servicios Automotor CFP N°36\nZavaleta 204, C1437EYF, CABA");
          System.out.println("=====Nº ORDEN: " + numeroEspera + "===========================");
          System.out.println("Nombre del Cliente: " + tickets[1][0]);
          System.out.println("DNI del cliente: " + tickets[1][5]);
          System.out.println("Marca del Vehiculo: " + tickets[1][3]);
          System.out.println("Dominio del Vehiculo: " + tickets[1][2]);
          System.out.println("==================================");
//          System.out.println("Cantidad de servicios: " + cont);
//       
//System.out.println("Los servicios son : " + cont2);
//        System.out.println("==================================");
        
//******************************************************************************      
//******************************************************************************      

       

    }
    
}
