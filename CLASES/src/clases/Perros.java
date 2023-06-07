/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author gas12
 */
public class Perros {
    String nombre="";
    String raza="";
    String color="";
    String edad;
    
    public void fichar(){
      nombre= JOptionPane.showInputDialog(null,"Nombre: ", "nombre", JOptionPane.QUESTION_MESSAGE);
      raza= JOptionPane.showInputDialog(null,"Raza: ", "raza", JOptionPane.QUESTION_MESSAGE);
      color= JOptionPane.showInputDialog(null,"color: ", "color", JOptionPane.QUESTION_MESSAGE);
      edad= JOptionPane.showInputDialog(null,"edad: ", "edad", JOptionPane.QUESTION_MESSAGE);
    }
}
