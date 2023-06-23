/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10m2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author gas12
 */
public class Encapsulamiento {
    ImageIcon inicio = new ImageIcon("src/imagenes/lavar.png");
    ImageIcon color =  new ImageIcon("src/imagenes/color66.png");
    ImageIcon peso =  new ImageIcon("src/imagenes/peso.png");
    String tipo="";
    
    public String tipoRopa(){
        int tiporopa = JOptionPane.showOptionDialog(null,
               "Por favor seleccione el tipo de ropa que va a lavar",
               "Tipo de Ropa",
               JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE,color,
               new Object []{"Color", "Blanca" },"Color");
        
        switch(tiporopa){
            case 0:  tipo="Color";
            break;
            case 1:  tipo="Blanca";
            break;
        }
        return tipo;
    }
    public int obtnerKilos(){
        String peso2 = (String) JOptionPane.showInputDialog (null,
                "Ingrese en entero un peso aproximado de la ropa ingresada",
                "Peso de la ropa",
                JOptionPane.QUESTION_MESSAGE,
                peso,
                null,
                "");
        int  kilos = Integer.parseInt(peso2);
        return kilos;
    }
    public String claseRopa(){
        String tiposRopa [] = {"LANA", "ROPA SUCIA", "ECONOMICO" , "BEBE"};
        String tipoLavado=(String) JOptionPane.showInputDialog(null,
                "Selecciones qué tipo de ropa lavará: ",
                "TIPO DE ROPA",
                JOptionPane.QUESTION_MESSAGE,
                null,
                tiposRopa,
                tiposRopa[0]); 
        return tipoLavado;
    }
}
