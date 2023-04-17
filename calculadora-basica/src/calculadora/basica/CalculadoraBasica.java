
package calculadora.basica;

import java.util.Scanner;


public class CalculadoraBasica {


    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
       
        double numeroA;
        double numeroB;
        double resultado;
        int operacion;
       
        System.out.println("***************************************");
        System.out.println("** Bienvenidos a la calculador CFP36 **");
        System.out.println("****** OPERACIONES DISPONIBLES ********");
              
        System.out.print("Ingrese el primer numero: ");
        numeroA=datos.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numeroB=datos.nextInt();
        
        System.out.println("            ** 1- SUMA **");
        System.out.println("            ** 2- RESTA **");
        System.out.println("       ** 3- MULTIPLICACION **");
        System.out.println("           ** 4- DIVISION **");
        System.out.print("Ingrese una operacion: ");
        operacion = datos.nextInt();
                                
        System.out.println("***************************************");
       
        if(operacion == 1 ){
            resultado= numeroA + numeroB;
            System.out.println("La operacion elegida es una Suma y el resultado es " + resultado);
        }else if(operacion == 2){
            resultado= numeroA - numeroB;
            System.out.println("La operacion elegida es una Resta y el resultado es " + resultado);
        }else if(operacion == 3){
            resultado= numeroA * numeroB;
            System.out.println("La operacion elegida es una Multiplicacion y el resultado es " + resultado);
        }else{
             resultado= numeroA / numeroB;
            System.out.println("La operacion elegida es una División y el resultado es " + resultado);
        }
    }
    
}
