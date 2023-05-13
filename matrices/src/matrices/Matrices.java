
package matrices;

import java.util.Scanner;


public class Matrices {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);


//        String estaciones[][] = new String[2][2];
//        
//        estaciones[0][0]= "OTOÑO";
//        estaciones[0][1]="VERANO";
//        estaciones[1][0]="INVIERNO";
//        estaciones[1][1]="PRIMAVERA";
//        
//        System.out.println(estaciones[0][0]);
//        System.out.println(estaciones[0][1]);
//        System.out.println(estaciones[1][0]);
//        System.out.println(estaciones[1][1]);
       
//*****************************************************************************
       
        //**********  RECORRER MATRIZ ***********************
//        int filas=0;
//        int columnas=0;
//        int contador=1;
//
//        System.out.print("Indique la cantidad de filas: ");
//        filas=leer.nextInt();
//        System.out.print("Ingrese la cantidad de columnas: ");
//        columnas=leer.nextInt();
//        int numeros[][]= new int [filas][columnas];
//       
//        for(int i=0; i<filas; i++){
//            for(int j=0; j<columnas; j++){
//                numeros [i][j]=contador;
//                contador++;
//                System.out.println(numeros[i][j]);
//            }
//          } 
//****************************************************************************
            
//        int mat [][]= new int [3][5];
//        for (int[] mat1 : mat) {
//            for (int c = 0; c<mat.length; c++) {
//                System.out.print("Ingrese un componente: ");
//                mat1[c] = leer.nextInt();
//                System.out.println(mat[c]);
//            }
//        }

//**************************************************************************

        int matriz [][]= new int[3][3];
        
        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[0][2]=3;
        
        matriz[1][0]=1;
        matriz[1][1]=2;
        matriz[1][2]=3;
        
        matriz[2][0]=1;
        matriz[2][1]=2;
        matriz[2][2]=3;
        
        for(int posX=0; posX<matriz.length;posX++){
            for(int posY=0; posY<matriz[posX].length;posY++){
                System.out.print(matriz[posX] [posY]);
                System.out.println(" - ");
                System.out.println("\n");
                
            }
        }
        
//        for(int posX=0; posX<matriz.length;posX++){
//            for(int posY=0; posY<matriz[posX].length;posY++){
//               System.out.print(matriz[posX] [posY]= posY + 1);
//               System.out.print(" - ");
//               System.out.print("\n ");               
//            }
//        }
        
        //********************************************************************
        //COMPILA MAL !!!***
//        for(int[] fila : matriz ){
//            System.out.println(fila);
//            for(int[] celda : matriz){
//                System.out.println(fila);
//            }
//        }

//**********   MATRICES IRREGULARES  *********************************

        int mat [][];
        mat = new int [3][];
        mat [0] = new int [2];
        mat [1] = new int [3];
        mat [2] = new int [4];
        
        System.out.println("Cantidad: " + mat.length);
        System.out.println("Cantidad: " + mat[0].length);
        System.out.println("Cantidad: " + mat[1].length);
        System.out.println("Cantidad: " + mat[2].length);
        
        mat [0][0]= 10;
        mat [0][1]= 20;
        
        for(int f=0; f<mat.length;f++){
            for(int y=0; y<mat[f].length;y++){
                System.out.println(mat [f][y]);
            }
        }
























        
    }
    
}
