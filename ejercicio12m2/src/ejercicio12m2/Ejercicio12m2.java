/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12m2;

import Funciones.Funciones;
import Funciones.Celulares;
import java.util.ArrayList;


import javax.swing.JOptionPane;

/**
 *
 * @author gas12
 */
public class Ejercicio12m2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ArrayList<Celulares> listaCelulares=new ArrayList<>();

        
        int nuevaEntrada=0;
        do{    
            Funciones funcion=new Funciones();
              String elemento = funcion.seleccionarElemento();
              
            switch(elemento){
                case "CELULARES":   Celulares nuevoCelular=new Celulares("","","","","", "");        
                                    nuevoCelular.getDatos();      
                                    nuevoCelular.guardarDatos(listaCelulares);
                                    int imprimirListados=nuevoCelular.imprimir();
                                    switch(imprimirListados){
                                        case 0: nuevoCelular.imprimirListado(listaCelulares);
                                        break;
                                    }
                break;
                    
                    
            }  
            
            
            
            nuevaEntrada=funcion.recargar();
        }while(nuevaEntrada==0);
        
        
       
    }
    
}
