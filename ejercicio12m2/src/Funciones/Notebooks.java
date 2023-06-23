/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Notebooks extends Funciones {
    public Notebooks(String numCliente, String cliente, String marca, String modelo,String bateria, String defecto){
        this.numCliente=numCliente;
        this.cliente=cliente;
        this.marca=marca;
        this.modelo=modelo;
        this.bateria=bateria;
        this.defecto=defecto;
    }
    
    public void guardarDatos(ArrayList<Notebooks> listaNotebooks){
        //System.out.println(cliente + elemento + marca);
        
        Notebooks notebook=new Notebooks(numCliente,cliente, marca, modelo, bateria, defecto);
        
        listaNotebooks.add(notebook);
    }
    
    public void imprimirNotebooks(ArrayList<Notebooks> listaNotebooks){
        for(Notebooks notebook : listaNotebooks){
            
            System.out.println(
                    "--------------LISTA DE NOTEBOOKS---------" + "\n" +
                    "Numero de Cliente: " + notebook.numCliente + "\n" + 
                    "Cliente: " + notebook.cliente + "\n" + 
                    "Marca: " + notebook.marca + "\n" +
                    "Modelo: " + notebook.modelo + "\n" +
                    "Batería: " + notebook.bateria + "\n" +
                    "Defecto: " + notebook.defecto + "\n" );            
            }
            
    }
}
