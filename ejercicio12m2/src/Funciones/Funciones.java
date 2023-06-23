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
        
            numCliente = (String)JOptionPane.showInputDialog(null,"Ingrese numero de Cliente",null).toUpperCase();
            this.verificarStrings(numCliente);        
        
            cliente = (String)JOptionPane.showInputDialog(null,"Ingrese nombre Cliente",null).toUpperCase();
            this.verificarStrings(cliente);        
        
            marca = (String)JOptionPane.showInputDialog(null,"Ingrese la marca",null).toUpperCase();
            this.verificarStrings(marca);        

            modelo = (String)JOptionPane.showInputDialog(null,"Ingrese el modelo",null).toUpperCase();
            this.verificarStrings(modelo);        

            this.seleccTipoBateria();
            
            defecto = (String)JOptionPane.showInputDialog(null,"Explique brevemente el defecto",null).toUpperCase();
            this.verificarStrings(defecto);        
        
    }
    // METODO PARA SELECCIONAR EL DISPOSITIVO(RETORNA UN STRING)
    public String seleccionarElemento(){
        String listaDispositivos[]={"CELULARES","TABLETS","NOTEBOOKS"};
        
        String dispositivoSeleccionado= (String) JOptionPane.showInputDialog(null,
                "Seleccione el dispositivo que va a ingresar.",
                "Elección del Dispositivo",
                JOptionPane.QUESTION_MESSAGE, null,
                listaDispositivos, listaDispositivos[0]);
        
        //System.out.println(dispositivoSeleccionado);
        return dispositivoSeleccionado;
    }
    
    // METODO PARA SELECCIONAR LA BATERIA(RETORNA UN STRING)
    public String seleccTipoBateria(){
         String listaBaterias[]={"NO APLICA ","3000ma5h)","4000ma9h","7000ma12h"};
        
        String tipoBateria = (String )JOptionPane.showInputDialog(null,
                "Selecciones el tipo de bateria",
                "BATERIA",
                JOptionPane.QUESTION_MESSAGE, null,
                listaBaterias, listaBaterias[0]);
        return tipoBateria;
    }
    
    // METODO PARA SELECCIONAR EL ELEMENTO(RETORNA UN ENTERO 1 Y CORTA EL CICLO CON VARIABLE "NUEVA ENTRADA")
    public int recargar(){
        int seleccion = JOptionPane.showOptionDialog(null,
                    "Desea cargar un nuevo elemento?",
                    "Nueva Carga",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí","No"},"Sí");
        
                    if(seleccion==1){
                        System.exit(0);
                    }
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
    //VERIFICA QUE LOS IMPUTS ESTEN LLENOS O NO SEAN NULL
    public void verificarStrings(String dato){
        if(dato==null){
            System.exit(0);
        }else if(dato.equals("")){
            JOptionPane.showMessageDialog(null, "Campo vacío. Ingrese el valor nuevamente","CAMPO VACIO",JOptionPane.INFORMATION_MESSAGE);
            if (dato.equals(numCliente)){
                numCliente = (String)JOptionPane.showInputDialog(null,"Ingrese numero de Cliente",null).toUpperCase();
                this.verificarStrings(numCliente);      
            }else if(dato.equals(cliente)){
                cliente = (String)JOptionPane.showInputDialog(null,"Ingrese nombre Cliente",null).toUpperCase();
                this.verificarStrings(cliente);       
            }else if(dato.equals(marca)){
                marca = (String)JOptionPane.showInputDialog(null,"Ingrese nombre Cliente",null).toUpperCase();
                this.verificarStrings(marca);       
            }else if(dato.equals(modelo)){
                modelo = (String)JOptionPane.showInputDialog(null,"Ingrese el modelo",null).toUpperCase();
                this.verificarStrings(modelo);  
            }else if(dato.equals(defecto)){
                defecto = (String)JOptionPane.showInputDialog(null,"Explique brevemente el defecto",null).toUpperCase();
                this.verificarStrings(defecto); 
            }
            
        }
        
    }
    
}
