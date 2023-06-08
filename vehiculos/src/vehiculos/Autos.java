/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Autos {
    //ArrayList<String> listaAutos=new ArrayList<String>();
    
    String marca="";
    String modelo="";
    
    public void nuevoAuto(){
        marca  = JOptionPane.showInputDialog(null,"Marca: ","marca",JOptionPane.QUESTION_MESSAGE);
        modelo  = JOptionPane.showInputDialog(null,"Modelo: ","modelo", JOptionPane.QUESTION_MESSAGE);
        
        
    }
    
    
    
    
    
    
    
}
