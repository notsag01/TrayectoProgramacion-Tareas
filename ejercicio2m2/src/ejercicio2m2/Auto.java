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
        marca= (String) JOptionPane.showInputDialog(null, "Ingrese una Marca: ", "Marca", JOptionPane.QUESTION_MESSAGE, null, null, null);
        modelo= (String) JOptionPane.showInputDialog(null, "Ingrese una Modelo: ", "Modelo", JOptionPane.QUESTION_MESSAGE, null, null, null);
        kilometraje= (String) JOptionPane.showInputDialog(null, "Ingrese una Kilometraje: ", "Kilometraje", JOptionPane.QUESTION_MESSAGE, null, null, null);
    }
    
    public void estadoAuto(){
        int kilometrajeM=Integer.parseInt(kilometraje);
        
        if(kilometrajeM == 0){
            System.out.println("El auto está 0KM");
        }else if( kilometrajeM <= 10000){
            System.out.println("El auto poco usado");                
        }else if(kilometrajeM <=100000){
            System.out.println("El auto usado");                
        }else{
            System.out.println("El auto muy usado");                
        }
    }
    
}
