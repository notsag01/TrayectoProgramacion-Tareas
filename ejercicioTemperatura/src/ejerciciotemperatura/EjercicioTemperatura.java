
package ejerciciotemperatura;

import java.util.Scanner;


public class EjercicioTemperatura {

    
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        
        int temperatura;
        
        System.out.print("Ingrese la temperatura actura; ");
        temperatura= lector.nextInt();
        
        if(temperatura >= 25){
            System.out.println("Ir a la playa.");
        }else if(temperatura <25 && temperatura>=10){
            System.out.println("Ir a caminar");
        }else{
            System.out.println("Abrigarse");
        }
    }
    
}
