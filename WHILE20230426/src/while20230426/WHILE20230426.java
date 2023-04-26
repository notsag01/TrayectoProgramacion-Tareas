
package while20230426;

import java.util.Scanner;


public class WHILE20230426 {

   
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int contador=0;
//       while(contador<10){
//           System.out.println(contador);
//           contador ++;
//       }
       
//       do{
//            System.out.println(contador);
//            contador ++;
//        }while(contador<10);
        
        String usuario="";
        
        while(contador <= 3){
            System.out.print("Ingrese el usuario: ");
            usuario= leer.nextLine();
            if(usuario.equals("pepe")){
                System.out.println("Usuario Correcto");
            }else{
                System.out.println("Usuario Incorrecto");
            }
                contador++;
        }
        
        
    }
    
}
