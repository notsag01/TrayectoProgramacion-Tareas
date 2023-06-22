/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12m2;

import Funciones.Funciones;
import Funciones.Celulares;


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
      
        
        int nuevaEntrada=0;
        do{                   
            Celulares nuevoCelular=new Celulares("", "", "");        
            nuevoCelular.getDatos();      
            nuevoCelular.guardarDatos();
            
            nuevaEntrada=nuevoCelular.recargar();
        }while(nuevaEntrada==0);
        
        
       
    }
    
}
