/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4m3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gas12
 */
public class Autos {
    String marca="";
    String modelo="";
    String color="";
    String costo="";
    int precioVenta=0;
    private ArrayList<Autos> listaAutos= new ArrayList<>();
    
    public Autos(String marca, String modelo, String color){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        
    }
    
    public void getDatos(){
        String marca =(String) JOptionPane.showInputDialog(null, "Marca", "marca", JOptionPane.QUESTION_MESSAGE, null, null, null);
        String modelo =(String) JOptionPane.showInputDialog(null, "Modelo", "modelo", JOptionPane.QUESTION_MESSAGE, null, null, null);
        String color =(String) JOptionPane.showInputDialog(null, "color", "color", JOptionPane.QUESTION_MESSAGE, null, null, null);
        String costo =(String) JOptionPane.showInputDialog(null, "costo", "costo", JOptionPane.QUESTION_MESSAGE, null, null, null);  
        
        Autos auto=new Autos(marca, modelo, color);
        
        listaAutos.add(auto);
        System.out.println(auto.marca);
    
    }
    
    public void imprimir(){
        for(Autos auto : listaAutos){
            System.out.println("nombre: "+ auto.marca);
            System.out.println("modelo: "+ auto.modelo);
            System.out.println("color: "+ auto.color);
        }
        
    }
    
    
    
    
    
}   
