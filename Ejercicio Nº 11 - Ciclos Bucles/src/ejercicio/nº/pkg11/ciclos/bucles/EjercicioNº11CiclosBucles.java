
package ejercicio.nº.pkg11.ciclos.bucles;

import java.util.Scanner;


public class EjercicioNº11CiclosBucles {


    public static void main(String[] args) {
        //Scanner leerNum= new Scanner (System.in);
        
        //VARIABLES
        int contadorA=0;
        int contadorB=1;
        int contadorC=1;
       
        // CICLO FOR - CONTADOR 1*************************
       for( contadorA=1; contadorA <=100 ; contadorA++){
           System.out.println(contadorA + "- Contador 1.");
       }
       
       //CICLO WHILE - CONTADOR 2*************************
       while(contadorB <= 100){
           System.out.println(contadorB + "- Contador 2.");
           contadorB++;
       }
       
       //CICLO DO WHILE - CONTADOR3 3*********************
       do{
           System.out.println(contadorC  + "- Contador 3.");
           contadorC++;
       }while(contadorC <=100);
       
       
        
        
        
        
        
        
    }
    
}
