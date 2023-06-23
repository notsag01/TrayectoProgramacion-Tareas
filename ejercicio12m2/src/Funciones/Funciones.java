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
    public String numCliente, cliente,marca,modelo, bateria , defecto;        
    
    public void getDatos(){
        numCliente = (String)JOptionPane.showInputDialog(null,"Ingrese numero de Cliente",null).toUpperCase();
        cliente = (String)JOptionPane.showInputDialog(null,"Ingrese nombre Cliente",null).toUpperCase();
        marca = (String)JOptionPane.showInputDialog(null,"Ingrese la marca",null).toUpperCase();
        modelo = (String)JOptionPane.showInputDialog(null,"Ingrese el modelo",null).toUpperCase();
        bateria = (String)JOptionPane.showInputDialog(null,"Ingrese tipo de Batería",null).toUpperCase();
        defecto = (String)JOptionPane.showInputDialog(null,"Explique brevemente el defecto",null).toUpperCase();
        
    }
    
    public String seleccionarElemento(){
        String listaDispositivos[]={"CELULARES","TABLET","NOTEBOOKS"};
        
        String dispositivoSeleccionado= (String) JOptionPane.showInputDialog(null,
                "Seleccione el dispositivo que va a ingresar.",
                "Elección del Dispositivo",
                JOptionPane.QUESTION_MESSAGE, null,
                listaDispositivos, listaDispositivos[0]);
        
        //System.out.println(dispositivoSeleccionado);
        return dispositivoSeleccionado;
    }
    
    public int recargar(){
//    int nuevaEntrada=0;
        int seleccion = JOptionPane.showOptionDialog(null,
                    "Desea cargar un nuevo elemento?",
                    "Nueva Carga",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí","No"},"Sí");
            return seleccion;
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
