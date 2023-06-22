/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gas12
 */
public class Funciones {
    public String cliente, elemento, marca;        
    
    public void getDatos(){
        cliente = (String)JOptionPane.showInputDialog(null,"Ingrese nombre Cliente",null);
        elemento = (String)JOptionPane.showInputDialog(null,"Ingrese el elemento",null);
        marca = (String)JOptionPane.showInputDialog(null,"Ingrese la marca",null);
        
    }
    
    public int recargar(){
    int nuevaEntrada=0;
        int seleccion = JOptionPane.showOptionDialog(null,
                    "Desea cargar un nuevo elemento?",
                    "Nueva Carga",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí","No"},"Sí") ;
            //System.out.println(seleccion);
            switch(seleccion){
                case 0: nuevaEntrada=0;
                break;
                case 1: nuevaEntrada=1;
                break;
            } 
            //System.out.println(nuevaEntrada);
            return nuevaEntrada;
    }
    public int imprimir(){
        int seleccion = JOptionPane.showOptionDialog(null,
                "Desea imprimir listado?",
                "Impresion", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Sí", "No"}, "Sí");
        return seleccion;
    }
    
}
