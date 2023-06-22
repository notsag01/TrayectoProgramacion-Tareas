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
    public String cliente, elemento, marca;        
    
    public void getDatos(){
        cliente = (String)JOptionPane.showInputDialog(null,"Ingrese nombre Client","DATOS");
        elemento = (String)JOptionPane.showInputDialog(null,"Ingrese el elemento","DATOS");
        marca = (String)JOptionPane.showInputDialog(null,"Ingrese la marca","DATOS");
        
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
