/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6m2.areas;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Funciones {
    private float base, altura;
    
    //CONSTRUCTOR
    public Funciones(float base, float altura){
        this.base=base;
        this.altura=altura;
    }
    
    public void getDatos(){
        String datoBase= (String)JOptionPane.showInputDialog(null,"Ingrese la base", "base",JOptionPane.QUESTION_MESSAGE);
        //float base=Float.parseFloat(datoBase);
        String datoAltura= (String)JOptionPane.showInputDialog(null,"Ingrese la altura", "altura",JOptionPane.QUESTION_MESSAGE);
        //float altura=Float.parseFloat(datoAltura);
        
        
    }
    public void imprimir(){
        System.out.println(this.base);
        System.out.println(this.altura);
    }
    
    
    
}
