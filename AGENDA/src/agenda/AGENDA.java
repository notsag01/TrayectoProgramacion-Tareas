
package agenda;

import java.util.Scanner;


public class AGENDA {

   
    public static void main(String[] args) {
        
        Scanner buscar=new Scanner(System.in);
        String nombres []= new String[5];
        String apellidos []=new String[5];
        String telefonos []=new String[5];
        
        String busqueda="";
        
        for(int i=0; i<nombres.length;i++){
            System.out.print("Ingrese un nombre: ");
            String nombre= buscar.nextLine();
            nombres[i]= nombre;
            System.out.print("Ingrese un apellido: ");
            String apellido= buscar.nextLine();
            apellidos[i]= apellido;
            System.out.print("Ingrese un telefono: ");
            String telefono= buscar.nextLine();
            telefonos[i]= telefono;
        }
        
        System.out.println("\n****************************************");
        System.out.println("*******   AGENDA TELEFONICA   ********");
        System.out.println("****************************************\n");
        for( int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i] + " " + apellidos[i] + ": " + telefonos[i]);
        }
        
        System.out.println("\n****************************************");
        System.out.println("*******   BUSCAR UN NOMBRE   ********");
        System.out.println("****************************************\n");
        System.out.print("Escriba el nombre que desea buscar: ");
        busqueda= buscar.nextLine();
        for(int b=0; b< nombres.length; b++){
            if(busqueda.equals(nombres[b])){
            System.out.println("El nombre `" + nombres[b] + "` se encuentra en el indice " + b);
            }
        }
        
        
        
        
        
        
    }
    
}
