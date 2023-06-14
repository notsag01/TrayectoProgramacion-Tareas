/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2m2;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Auto {
    String marca="";
    String modelo="";
    String kilometraje="";
    
    //OBTENEMOS DATOS
    public void getData(){
        do{
            marca= (String) JOptionPane.showInputDialog(null, "Ingrese una Marca: ", "Marca", JOptionPane.QUESTION_MESSAGE, null, null, null);
        }while(marca == null || marca.equals("") );
        do{
            modelo= (String) JOptionPane.showInputDialog(null, "Ingrese una Modelo: ", "Modelo", JOptionPane.QUESTION_MESSAGE, null, null, null);
        }while(modelo == null || modelo.equals("") );
        do{
            kilometraje= (String) JOptionPane.showInputDialog(null, "Ingrese una Kilometraje: ", "Kilometraje", JOptionPane.QUESTION_MESSAGE, null, null, null);
        }while(kilometraje == null || kilometraje.equals("") );
    }
    
    public void estadoAuto(){
        int kilometrajeM=Integer.parseInt(kilometraje);
        
        if(kilometrajeM == 0){
            JOptionPane.showMessageDialog(null, "El auto esta 0KM", "INFORMACION DEL AUTO", JOptionPane.INFORMATION_MESSAGE, null);
        }else if( kilometrajeM <= 10000){
            JOptionPane.showMessageDialog(null, "El auto esta poco usado.", "INFORMACION DEL AUTO", JOptionPane.INFORMATION_MESSAGE, null);
            System.out.println("El auto poco usado");                
        }else if(kilometrajeM <=100000){
            JOptionPane.showMessageDialog(null, "El auto esta usado.", "INFORMACION DEL AUTO", JOptionPane.INFORMATION_MESSAGE, null);
            System.out.println("El auto usado");                
        }else{
            JOptionPane.showMessageDialog(null, "El auto esta muy usado.", "INFORMACION DEL AUTO", JOptionPane.INFORMATION_MESSAGE, null);
            System.out.println("El auto muy usado");                
        }
    }
    
}
