/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import Funciones.Funciones;
import Funciones.Celulares;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author gas12
 */
public class Celulares extends Funciones {
    

    
    public Celulares(String numCliente, String cliente, String marca, String modelo,String bateria, String defecto){
        this.cliente=cliente;
        this.marca=marca;
    }
    
    public void guardarDatos(ArrayList<Celulares> listaCelulares){
        //System.out.println(cliente + elemento + marca);
        
        Celulares celular=new Celulares(numCliente,cliente, marca, modelo, bateria, defecto);
        
        listaCelulares.add(celular);
    }
    
    public void imprimirListado(ArrayList<Celulares> listaCelulares){
        for(Celulares celular : listaCelulares){
            JOptionPane.showMessageDialog(null,
                    "Cliente: " + celular.cliente + "\n" + 
                    "Marca: " + celular.marca + "\n");
            
            System.out.println("Cliente: " + celular.cliente + "\n" + 
                    "Marca: " + celular.marca + "\n");
        };
            
    }
    
    
    
}