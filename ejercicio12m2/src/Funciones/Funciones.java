/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import ejercicio12m2.Celulares;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gas12
 */
public class Funciones {
    String cliente, elemento, marca;
    ArrayList<Funciones> listaCelulares = new ArrayList<>();

    
    public Funciones(String cliente, String elemento, String marca){
        this.marca=cliente;
        this.elemento=elemento;
        this.marca=marca;
    }

    public Funciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void getDatos(){
        cliente = (String)JOptionPane.showInputDialog(null,"Ingrese nombre Client","DATOS");
        elemento = (String)JOptionPane.showInputDialog(null,"Ingrese el elemento","DATOS");
        marca = (String)JOptionPane.showInputDialog(null,"Ingrese la marca","DATOS");
        
        Funciones nuevoElemento= new Funciones(cliente, elemento, marca);
        
        listaCelulares.add(nuevoElemento);
    }
    public void imprimir(){
        JOptionPane.showMessageDialog(null,
                "Cliente: " + cliente + "\n" +
                "Elemento: " + elemento + "\n" +
                "Marca: " + marca,
                "DATOS INGRESADOS",
                JOptionPane.INFORMATION_MESSAGE,
                null);
    }
    
}
