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
    private float base, altura, superficie;
    
    //CONSTRUCTOR
    public Funciones(float base, float altura, float superficie){
        this.base=base;
        this.altura=altura;
        this.superficie=superficie;
    }
    
    public void getDatos(){
        String datoBase= (String)JOptionPane.showInputDialog(null,"Ingrese la base", "base",JOptionPane.QUESTION_MESSAGE);
        String datoAltura= (String)JOptionPane.showInputDialog(null,"Ingrese la altura", "altura",JOptionPane.QUESTION_MESSAGE);
        
        this.parsear(datoBase,datoAltura);
    }
    public void parsear(String datoBase, String datoAltura){
        float base=Float.parseFloat(datoBase);
        float altura=Float.parseFloat(datoAltura);
        
        this.calcularSuperficie(base,altura);
    }
    
    public void calcularSuperficie(float base, float altura){
        float superficie= base * altura;
        //System.out.println(superficie);
        setSuperficie(superficie);
        imprimirResultado(superficie);
    }
    public void setSuperficie(float superficie){
        this.superficie=superficie;
    }
    public float getSuperficie(){
        return superficie;
    }
    public void imprimirResultado(float resultado){
        System.out.println("La superficie es igual a: " + getSuperficie());
    }
    
}
