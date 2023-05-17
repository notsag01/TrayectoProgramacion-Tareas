
package cargamatrizdinamica;

import java.util.Scanner;


public class CargaMatrizDinamica {

    public static void main(String[] args) {
        
        int matriz[][] = new int[3][3];
        
        Scanner consola = new Scanner(System.in);
//        
//     //cargar matriz dinamica con usuario  
//        for (int x=0; x < matriz.length; x++) {
//            for (int y=0; y < matriz[x].length; y++) {
//            System.out.print("Introduzca un numero a la matriz[" + x + "," + y + "]  ");
//            matriz[x][y] = consola.nextInt();
//        }
//        }
//        // mostrar matriz
//        for (int[] matriz1 : matriz) {
//            for (int y = 0; y < matriz1.length; y++) {
//                //System.out.println ("[" + x + "," + y + "] = " + matriz[x][y]);
//                System.out.print(matriz1[y]);
//                System.out.print("-");
//            }
//        }

        String nombres[][]= new String [2][2];
        
        for(int x=0; x<nombres.length; x++){
            for(int y=0; y<nombres[x].length; y++){
                //System.out.print(nombres[x][y]);
                //System.out.print("-");
                System.out.print("Introduzca un nombre a la matriz[" + x + "," + y + "]  ");
                nombres[x][y]=consola.nextLine();
            }
        }
        for(int x=0; x<nombres.length; x++){
            for(int y=0; y<nombres[x].length;y++){
            System.out.print(nombres[x][y] + "-");
            }
        }




    }
    
}
