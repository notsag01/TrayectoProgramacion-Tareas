
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
     
       
        //VARIABLES***
        Scanner datos= new Scanner(System.in);
        Random nRandom= new Random();
       
        //ARRAYS***
        String [] nombres=new String[1];
        String [] telefonos=new String[1];
        String [] dniS=new String[1];
        int [] nOrden=new int[1];
        String [] dominios=new String[1];
        String [] marcas=new String[1];
        String [] servicios1=new String[1];
        String [] cantidadCubiertas= new String[1];
        String [] servicios2=new String[1];
        String [] servicios3=new String[1];
        String [] servicios4=new String[1];
        
        //CONTADORES**
        
        for(int i=0; i<nombres.length;i++){
            System.out.print("Ingrese su nombre: ");
            String nombre= datos.nextLine();
            nombres[i]=nombre;
            
            System.out.print("Ingrese su telefono: ");
            String telefono= datos.nextLine();
            telefonos[i]=telefono;
            
            System.out.print("Ingrese su DNI: ");
            String dni= datos.nextLine();
            dniS[i]=dni;
            
            int orden=nRandom.nextInt(100) + 1;
            nOrden[i]=orden;
            
            System.out.println("***   MARCA   ***");
            System.out.println("1- FORD    ");
            System.out.println("2- PEUGEOT      ");
            System.out.println("3- RENAULT       ");
            System.out.println("4- NISSAN     ");
            System.out.println("5- FIAT     ");
            System.out.print("LA MARCA DEL AUTO((numero): ");
            String marca=datos.nextLine();
            
            switch (marca){
                case "1" : marcas[i]= "FORD";
                break;
                case "2": marcas[i]="PEUGEOT";
                break;
                case "3": marcas[i]=" RENAULT";
                break;
                case "4": marcas[i]=" NISSAN";
                break;
                case "5": marcas[i]=" FIAT";
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
            String servicio=datos.nextLine();
            
             switch (servicio){
                case "1" : servicios1[i]= "ALINEACION";
                break;
                case "2": servicios1[i]="BALANCEO";
                          System.out.print("Cantidad: ");
                          String cantCubiertas="";
                          cantCubiertas=datos.nextLine();
                          cantidadCubiertas[i]=cantCubiertas;
                          break;
                          case "3": servicios1[i]=" ACEITE";
                          break;
                          case "4": servicios1[i]=" CUBIERTAS";
                          break;
                          default: System.out.print("no ha elegido un servicio.");
                          break;
            }
            
            System.out.println(nombres[i]+ "- " + telefonos[i] + "- " + dniS[i]
                                +"- " + nOrden[i] + "- "+ marcas[i] + "- " + servicios1[i] + "-" + cantidadCubiertas[i] );
        }
        
       

    }
    
}
