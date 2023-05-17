/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package credenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author gas12
 */
public class CREDENCIALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre="GASTON";
        String id="1234";
        String nombreVerificar="";
        String idVerificar;
        
        
        nombreVerificar= JOptionPane.showInputDialog(null,"Ingrese su nombre ","INPUT",JOptionPane.QUESTION_MESSAGE).toUpperCase();        
        System.out.println(nombreVerificar);
        idVerificar = JOptionPane.showInputDialog(null,"Ingrese su nombre ","INPUT",JOptionPane.QUESTION_MESSAGE);        
        System.out.println(idVerificar);
        
        if(nombre.equals(nombreVerificar)){
            JOptionPane.showMessageDialog(null,"ACCESO ","Mensaje de Informacion",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        
        
        
        
        
        
    }
    
}
