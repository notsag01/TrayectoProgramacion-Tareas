
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
        int cantidadServicios=1;
        String tickets[]= new String [5];
        String servicios[]= new String[cantidadServicios];
                               
        String nombre= " ";
        String dni=" ";
        String telefono=" ";
        String dominio=" ";
        String marca="";
        int servicio;
        String cantidadBalanceo="";
        String cantidadCubiertas="";
        int numeroEspera=nRandom.nextInt(100)+1;
        int servicioAdic=1;
       
        System.out.print("nombre: ");
        nombre=datos.nextLine();
        tickets[0]= nombre.toUpperCase();
        System.out.print("Numero DNI: ");
        dni=datos.nextLine();
        tickets[1]=dni;
        System.out.print("telefono: ");
        telefono=datos.nextLine();
        tickets[2]= telefono;
        System.out.print("dominio: ");
        dominio=datos.nextLine();
        tickets[3]= dominio;
        
        
                  
        System.out.println("***   MARCA   ***");
        System.out.println("1- FORD    ");
        System.out.println("2- PEUGEOT      ");
        System.out.println("3- RENAULT       ");
        System.out.println("4- NISSAN     ");
        System.out.println("5- FIAT     ");
        System.out.print("LA MARCA DEL AUTO((numero): ");
        marca=datos.nextLine();
       
        switch (marca){
            case "1" : tickets[4]= "FORD";
            break;
            case "2": tickets[4]="PEUGEOT";
            break;
            case "3": tickets[4]=" RENAULT";
            break;
            case "4": tickets[4]=" NISSAN";
            break;
            default: System.out.print("no ha elegido un servicio.");
            break;
        }
       
       for(int i=0; i<servicios.length;i++){ 
           
            while(servicioAdic == 1){
                 System.out.println("***   SERVICIOS   ***");
                 System.out.println("1- ALINEACION    ");
                 System.out.println("2- BALANCEO      ");
                 System.out.println("3- ACEITE        ");
                 System.out.println("4- CUBIERTAS     ");
                 System.out.print("Elija un servicio((numero): ");
                 servicio=datos.nextInt();

                 switch (servicio){
                     case 1 : servicios[i]= "ALINEACION";
                     break;
                     case 2: servicios[i]="BALANCEO";
                             System.out.print("Cantidad: ");
                             cantidadBalanceo=datos.nextLine();                        
                     break;
                     case 3: servicios[i]=" ACEITE";
                     break;
                     case 4: servicios[i]=" CUBIERTAS";
                             System.out.print("Cantidad: ");
                             cantidadCubiertas=datos.nextLine();                        
                     break;
                     default: System.out.print("no ha elegido un servicio.");
                     break;
                 }
                 if(servicio==2){                     
                             cantidadBalanceo=datos.nextLine();   
                             System.out.println(cantidadBalanceo);
                 }else if(servicio==4){
                             cantidadBalanceo=datos.nextLine();   
                             System.out.println(cantidadCubiertas);                 
                 }

                 System.out.println("DESEA AGREGAR OTRO SERVICIOS");
                 System.out.println("**** 1- SI *****************");
                 System.out.println("**** 2- NO *****************");
                 System.out.println("****************************");
                 servicioAdic=datos.nextInt();

                 switch(servicioAdic){
                     case 1: cantidadServicios++;
                     break;
                 }

            }
       }

        
          System.out.println("\n==================================");
          System.out.println("======== Bienvenido ==============");
          System.out.println("Centro de Servicios Automotor CFP N°36\nZavaleta 204, C1437EYF, CABA");
          System.out.println("=====Nº ORDEN: " + numeroEspera + "===========================");
          System.out.println("Nombre del Cliente: " + tickets[0]);
          System.out.println("DNI del cliente: " + tickets[1]);
          System.out.println("Telefono: " + tickets[2]);
          System.out.println("Marca del vehiculo: " + tickets[4]);
          System.out.println("Dominio del Vehiculo: " + tickets[3]);
          System.out.println("==================================");
          System.out.println("Cantidad de servicios: " + cantidadServicios);
          for(int i=0;i<servicios.length;i++){
              System.out.print(servicios[i]);
          }
//System.out.println("Los servicios son : " + cont2);
//        System.out.println("==================================");
        
//******************************************************************************      
//******************************************************************************      

       

    }
    
}
