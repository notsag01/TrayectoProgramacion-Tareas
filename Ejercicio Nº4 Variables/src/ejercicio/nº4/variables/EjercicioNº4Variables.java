
package ejercicio.nº4.variables;


public class EjercicioNº4Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo
        double y una variable C de tipo char y asigna a cada una un valor. A continuación, muestra por pantalla:
        El valor de cada variable.
        La suma de N + A
        La diferencia de A - N
        El valor numérico correspondiente al carácter que contiene la variable C.
        Si por ejemplo le hemos dado a N el valor 5, a A el valor 4.56 y a C el valor ‘a’, se debe mostrar por pantalla:
        Variable N = 5
        Variable A = 4.56
        Variable C = a
        5 + 4.56 = 9.559999999999999
        4.56 - 5 = -0.4400000000000004
        Valor numérico del carácter a = 97  */
        
        //Declaro las variables
        int N;
        double A;
        char C;
        double sumar;
        double restar;
        //Asigno valore a las variables
        N=20;
        A= 3.14;
        C= 1;
        
        //Muestro las varibles por pantallas
        
        System.out.println("La variable N es igual a " + N + ", A es igual a " + A + " y C a " + C);
        
        //Declaro la variable sumar
        sumar = N + A;
        //Muestro por pantalla
        System.out.println("La suma de A + N es igual a " + sumar);
        
        //Declaro la variable restar
        restar= A - N;
        System.out.println("La diferencia entre A y N es " + restar);
        
        System.out.println("El valor nùmerico de C es " + 1);

    }
    
}
