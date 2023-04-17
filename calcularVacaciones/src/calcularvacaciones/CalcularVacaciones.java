
package calcularvacaciones;

import java.util.Scanner;


public class CalcularVacaciones {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombre=" ";
        int area=0;
        int antiguedad=0;
       
        System.out.println("******************************************");
        System.out.println("--------------  TATOOINE SA  -------------");
        System.out.println("*********LIQUDACION DE VACACINES *********");
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.print("Ingrese el nombre del trabajador: ");
        nombre=entrada.nextLine();
        System.out.print("Ingrese la antiguedad: ");
        antiguedad=entrada.nextInt();
        System.out.println("CLAVE 1: ATENCION AL CLIENTE *************");
        System.out.println("CLAVE 2: DEPARTAMETO DE LOGISTICA*********");
        System.out.println("CLAVE 3: GERENCIA ***********************");
        System.out.print("Ingrese el area: ");
        area=entrada.nextInt();
       
        if(area == 1){
            if(antiguedad == 1){
                System.out.println("Trabajador: " +  nombre + ". Antiguedad: " + antiguedad + " año.");
                System.out.println("Atencion al cliente");
                System.out.println("Dias de vacaciones: 6 dias de vacaciones." );
            } else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("Trabajador: " +  nombre + ". Antiguedad: " + antiguedad + " años.");
                System.out.println("Atencion al cliente");
                System.out.println("Dias de vacaciones: 14 dias de vacaciones." );
            }else if(antiguedad >= 7){
               System.out.println("Trabajador: " +  nombre + ". Antiguedad: " + antiguedad + " años.");
                System.out.println("Atencion al cliente");
                System.out.println("Dias de vacaciones: 20 dias de vacaciones." );
            }
        }else if(area == 2){
            if(antiguedad == 1){
                System.out.println("Trabajador: " +  nombre + ". Antiguedad: " + antiguedad + " año.");
                System.out.println("Departamento de Logística");
                System.out.println("Dias de vacaciones: 7 dias de vacaciones." );
            } else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("Trabajador: " +  nombre + ". Antiguedad: " + antiguedad + " años.");
                System.out.println("Departamento de Logística");
                System.out.println("Dias de vacaciones:  15 dias de vacaciones." );
            }else if(antiguedad >= 7){
               System.out.println("Trabajador: " +  nombre + ". Antiguedad: " + antiguedad + " años.");
                System.out.println("Departamento de Logística");
                System.out.println("Dias de vacaciones:  22 dias de vacaciones." );
            }
        }else if(area == 3){
            if(antiguedad == 1){
                System.out.println("Trabajador: " +  nombre + ". Antiguedad: " + antiguedad + " año.");
                System.out.println("Gerencia.");
                System.out.println("Dias de vacaciones: 10 dias de vacaciones." );
            } else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("Trabajador: " +  nombre + ". Antiguedad: " + antiguedad + " años.");
                System.out.println("Gerencia.");
                System.out.println("Dias de vacaciones: 20 dias de vacaciones." );
            }else if(antiguedad >= 7){
               System.out.println("Trabajador: " +  nombre + ". Antiguedad: " + antiguedad + " años.");
                System.out.println("Gerencia.");
                System.out.println("Dias de vacaciones: 30 dias de vacaciones." );
            }
        }
    }
    
}
