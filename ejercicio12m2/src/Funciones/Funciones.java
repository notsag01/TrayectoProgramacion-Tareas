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
    //VARIABLES
    public String numCliente, cliente,marca,modelo, bateria , defecto;        
    
    // METODOS INPUTS
    public void getDatos(){
        do{
            numCliente = (String)JOptionPane.showInputDialog(null,"Ingrese numero de Cliente",null);
            System.out.println(numCliente);
        }while(numCliente == null || numCliente.equals(""));
        do{
            cliente = (String)JOptionPane.showInputDialog(null,"Ingrese nombre Cliente",null).toUpperCase();
        }while(cliente==null||cliente.equals(""));
        do{
            marca = (String)JOptionPane.showInputDialog(null,"Ingrese la marca",null).toUpperCase();
        }while(marca==null||marca.equals(""));
        do{
            modelo = (String)JOptionPane.showInputDialog(null,"Ingrese el modelo",null).toUpperCase();
        }while(modelo==null||modelo.equals(""));
        do{
            bateria = (String)JOptionPane.showInputDialog(null,"Ingrese tipo de Batería",null).toUpperCase();
        }while(modelo==null||modelo.equals(""));
        do{
            defecto = (String)JOptionPane.showInputDialog(null,"Explique brevemente el defecto",null).toUpperCase();
        }while(defecto==null||defecto.equals(""));
        
    }
    // METODO PARA SELECCIONAR EL DISPOSITIVO(RETORNA UN STRING)
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
    
    // METODO PARA SELECCIONAR EL ELEMENTO(RETORNA UN ENTERO 1 Y CORTA EL CICLO CON VARIABLE "NUEVA ENTRADA")
    public int recargar(){
        int seleccion = JOptionPane.showOptionDialog(null,
                    "Desea cargar un nuevo elemento?",
                    "Nueva Carga",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí","No"},"Sí");
            return seleccion;
    }
    
    // METODO PREGUNTA SI SE DESEA IMPRIMIR (RETORNA UN ENTERO 1 )
    public int imprimir(){
        int seleccion = JOptionPane.showOptionDialog(null,
                "Desea imprimir listado?",
                "Impresion", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Sí", "No"}, "Sí");
        return seleccion;
    }
    
}
