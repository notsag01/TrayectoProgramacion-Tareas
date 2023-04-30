
package random.piedra_papel_tijera;

import java.util.Random;
import java.util.Scanner;


public class RANDOMPIEDRA_PAPEL_TIJERA {


    public static void main(String[] args) {
          //-Método Random
        //-Ejercicios en clase:
        //   -Crear un Programa que genere tres números aleatorio
        //comprendido entre 65 y 90
        //
        //   - Imprimir un número aleatorio 0 a 10
        //
        //    -Imprimir un numero aleatorio de 1 a 47
        //
        //    -Imprimir un numero aleatorio de 1 a 47
        //
        //     -Juego Piedra papel y tijera
        //
        //-Ejercicio para desarrollar
        //- Tomar el juego de piedra ,pepel y tijera, agregar :
        //        Pedir nombre de el jugador Humano.
        //       Cada jugador tiene tres posibilidades.
        //       Armar un tablero de resultados.
        Random rand= new Random();
       
       
  //***********************************************************      
//        int numA,numB,numC;
//        numA=ramd.nextInt(65) + 26;
//        System.out.println(numA + "-numero A");
//        
//        numB=rand.nextInt(11);
//        System.out.println(numB + "-número B, del 1 al 10");
//        
//        numC=rand.nextInt(47) + 1;
//        System.out.println(numC + "-número C, del 1 al 47");
//        
//        numC=rand.nextInt(47) + 1;
//        System.out.println(numC + "-número C, del 1 al 47");
//***********************************************************

        Scanner leer=new Scanner(System.in);
        String resp1=" ";
        String resp2 = " ";
        String jugador1=" ";
        String jugador2="COMPUTADORA";
        int numeroRandon= rand.nextInt(3) + 1;
        int cantidadVueltas=1;
        int jugadasGanadorasJ1=0;
        int jugadasGanadorasJ2=0;
       
        //INICIO DEL JUEGO
       
        System.out.println("**********************");
        System.out.println("PIEDRA, PAPEL O TIJERA");
        System.out.println("**********************");
        System.out.print("Ingrese su nombre: ");
        jugador1=leer.nextLine();
        
       
             
            System.out.println("**********************");
            System.out.println(" **INICIO DEL JUEGO **");
            
        while(cantidadVueltas <=3 ){
            System.out.println("**********************");
            System.out.println("**********************");
            System.out.println("P - PIEDRA************");
            System.out.println("L - PAPEL*************");
            System.out.println("T - TIJERA************");

            System.out.println("INTRUDUCIR SU OPCION, " + jugador1 + ": ");
            resp1=leer.next();

            switch(numeroRandon){
                case 1 -> resp2="P";
                case 2 -> resp2="L";
                case 3 -> resp2="T";

            }

            System.out.println("\n La opcion de  " + jugador2 + " fue: " + resp2);

            if(resp1.equals("P") && resp2.equals("P")){
                System.out.println("Empate!!!");
            }
            if(resp1.equals("P") && resp2.equals("L")){
                System.out.println("Ganador: " + jugador2);
                jugadasGanadorasJ2++;
            }
            if(resp1.equals("P") && resp2.equals("T")){
                System.out.println("Ganador: " + jugador1);
                jugadasGanadorasJ1++;
            }
            if(resp1.equals("L") && resp2.equals("L")){
                System.out.println("EMPATE ");
            }
            if(resp1.equals("L") && resp2.equals("P")){
                System.out.println("Ganador: " + jugador1);
                jugadasGanadorasJ1++;
            }
            if(resp1.equals("L") && resp2.equals("T")){
                System.out.println("Ganador: " + jugador2);
                jugadasGanadorasJ2++;
            }
            if(resp1.equals("T") && resp2.equals("T")){
                System.out.println("EMPATE ");
            }
            if(resp1.equals("T") && resp2.equals("P")){
                System.out.println("Ganador: " + jugador2);
                jugadasGanadorasJ2++;
            }
            if(resp1.equals("T") && resp2.equals("L")){
                System.out.println("Ganador: " + jugador1);
                jugadasGanadorasJ1++;
            }
            cantidadVueltas++;
            System.out.println(jugador1 + ": " + jugadasGanadorasJ1);
            System.out.println(jugador2 + ": " + jugadasGanadorasJ2);
        }
        if(jugadasGanadorasJ1 > jugadasGanadorasJ2){
            System.out.println("******************************");
            System.out.println("******************************");
            System.out.println("GANADOR, "+ jugador1);
            System.out.println("******************************");
            System.out.println("******************************");
        }else if (jugadasGanadorasJ1 < jugadasGanadorasJ2){
            System.out.println("******************************");
            System.out.println("******************************");
            System.out.println("GANADOR, "+ jugador2);
            System.out.println("******************************");
            System.out.println("******************************"); 
        }else{
            System.out.println("******************************");
            System.out.println("******************************");
            System.out.println("  EMPATE!!!!!!!!!");
            System.out.println("******************************");
            System.out.println("******************************"); 
        }
            
   }
}
