                 
package ejercicio13m2Polimorfistmo;

import Funciones.Resta;
import Funciones.Suma;
import Funciones.Funciones;

public class ejercicio13m2Polimorfistmo {


    public static void main(String[] args) {
        Funciones suma= new Suma();
        Funciones resta= new Resta();
        
        int operacion=suma.presOpciones();
        switch(operacion){
            case 0: suma.obtenerDatos();
                    suma.operar();
                    suma.imprimir();
            break;
            case 1: resta.obtenerDatos();;
                    resta.operar();
                    resta.imprimir();
            break;
            case 2: System.exit(0);
            break;        
        }
        
        
        
        
        
    }
    
}
