
package arrays;

import java.util.Scanner;


public class ARRAYS {


    public static void main(String[] args) {
        int numeros[]= new int[5];
        
        numeros[0]=100;
        numeros[1]=200;
        numeros[2]=300;
        numeros[3]=400;
        numeros[4]=500;
        
        System.out.println("Primero: "+numeros[1]);
        System.out.println("Segundo: "+ numeros[2]);
        System.out.println("Tercero: "+numeros[3]);
        System.out.println("Cuarto: "+numeros[4]);
        
        for( int i=0 ; i < numeros.length ; i++){
            
            System.out.print(i+1 + " ");
            System.out.println(numeros[i]);
        }
        
//        int digitos[] = new int[5];
//        
//        for(int i=0; i<= digitos.length;i++){
//            digitos[i]= i+ 9;
//            System.out.print(i);
//            System.out.print(digitos[i]);
//        }
        
        String utiles []= {"Lapicera", "Cuaderno", "Cartuchera", "Mochila"};
        double precios [] = {4.5 , 139.99, 560.50 , 103.99};

        for(int i=0; i < utiles.length;i++){
            System.out.println(utiles[i] + ": $" + precios[i]);
        }
        
        String nom="";
        Scanner leer = new Scanner(System.in);
        
        String nombre [] ={"juan", "pedro", "gabriel", "gaston"};
        
        
    }
    
}
