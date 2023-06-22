/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12m2;

import Funciones.Funciones;
import 
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
        while(nuevaEntrada==0){
            Funciones nuevoCelular=new Funciones();        
            nuevoCelular.getDatos();
            
            nuevoCelular.imprimir();
            
            int seleccion = JOptionPane.showOptionDialog(null,
                    "Desea cargar un nuevo elemento?",
                    "Nueva Carga",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí","No"},"Sí") ;
            switch(seleccion){
                case 0: nuevaEntrada=0;
                break;
                case 1: nuevaEntrada=1;
                break;
            }
        }
        
        
       
    }
    
}
