
package matrices;


public class Matrices {

    
    public static void main(String[] args) {
        
GASTON CORDOBA <gcordoba1981@gmail.com>
vie, 5 may, 20:02 (hace 1 día)
para mí

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
       
        Scanner leer=new Scanner(System.in);
       
        int filas=0;
        int columnas=0;
        int contador=1;

        System.out.print("Indique la cantidad de filas: ");
        filas=leer.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        filas=leer.nextInt();
        int numeros[][]= new int [filas][columnas];
       
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                numeros [i][j]=contador;
                contador++;
                System.out.print(numeros[i][j]);
            }
               
        }
    }
    
}
