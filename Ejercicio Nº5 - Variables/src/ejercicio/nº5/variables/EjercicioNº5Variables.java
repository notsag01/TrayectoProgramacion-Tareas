
package ejercicio.nº5.variables;


public class EjercicioNº5Variables {

   
    public static void main(String[] args) {
/*Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos variables N y M de 
tipo double y asigna a cada una un valor. A continuación, muestra por pantalla:
El valor de cada variable.
La suma X + Y
La diferencia X – Y
El producto X * Y
El cociente X / Y
El resto X % Y
La suma N + M
La diferencia N – M
El producto N * M
El cociente N / M
El resto N % M
La suma X + N
El cociente Y / M
El resto Y % M
El doble de cada variable
La suma de todas las variables
El producto de todas las variables
Si por ejemplo le hemos dado a X el valor 1, a Y el valor 2, a M el valor 3.2 y a N el valor 4.7 se debe mostrar por pantalla:
Variable X = 1
Variable Y = 2
Variable M = 3.2
Variable N = 4.7
1 + 2 = 3
1 - 2 = -1
1 * 2 = 2
1 / 2 = 0
1 % 2 = 1
4.7 + 3.2 = 7.9
4.7 - 3.2 = 1.5
4.7 * 3.2 = 15.040000000000001
4.7 / 3.2 = 1.46875
4.7 % 3.2 = 1.5
1 + 4.7 = 5.7
2 / 3.2 = 0.625
2 % 3.2 = 2.0
Variable X = 1 el doble es 2
Variable Y = 2 el doble es 4
Variable M = 3.2 el doble es 6.4
Variable N = 4.7 el doble es 9.4
1 + 2 + 4.7 + 3.2 = 10.9
1 * 2 * 4.7 * 3.2 = 30.080000000000002*/

int X = 10;
int Y =20;
double N= 3.14;
double M=1.618;

System.out.println("Variable X es igual a " + X);
System.out.println("Variable Y es igual a " + Y);
System.out.println("Variable N es igual a " + N);
System.out.println("Variable M es igual a " + M);

//sumo los nùmero enteros
int sumar= X+Y;
int restar= Y-X;
int multiplicar=Y*X;
double dividir=X/N;
double resto=X%N;

System.out.println("X + Y = " + sumar);
System.out.println("Y + X = " + restar );
System.out.println("Y * X = " + multiplicar );
System.out.println("X * N = " + dividir );
System.out.println("X % N = " + resto );




        
    

    }
    
}
