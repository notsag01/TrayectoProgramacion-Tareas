
package ejercicio11m2.herencia;

import Funciones.Resta;
import Funciones.Suma;
import Funciones.Funciones;

public class Ejercicio11m2Herencia {


    public static void main(String[] args) {
        Suma suma= new Suma();
        Resta resta= new Resta();
        Funciones funcion = new Funciones();
        
        int operacion=funcion.presOpciones();
        switch(operacion){
            case 0: suma.obtenerDatos();
                    suma.sumar();
                    suma.imprimir();
            break;
            case 1: resta.obtenerDatos();;
                    resta.restar();
                    resta.imprimir();
            break;
            case 2: System.exit(0);
            break;        
        }
        
        
        
        
        
    }
    
}
