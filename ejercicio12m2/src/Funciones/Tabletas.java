/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import Funciones.Funciones;
import Funciones.Tabletas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Tabletas extends Funciones {
    public Tabletas(String numCliente, String cliente, String marca, String modelo,String bateria, String defecto){
        this.numCliente=numCliente;
        this.cliente=cliente;
        this.marca=marca;
        this.modelo=modelo;
        this.bateria=bateria;
        this.defecto=defecto;
    }
    
    public void guardarDatos(ArrayList<Tabletas> listaTablets){
        //System.out.println(cliente + elemento + marca);
        
        Tabletas tablet=new Tabletas(numCliente,cliente, marca, modelo, bateria, defecto);
        
        listaTablets.add(tablet);
    }
    
    public void imprimirTabletas(ArrayList<Tabletas> listaTablets){
        for(Tabletas tablet : listaTablets){
            JOptionPane.showMessageDialog(null,
                    "Numero de Cliente: " + tablet.numCliente + "\n" + 
                    "Cliente: " + tablet.cliente + "\n" + 
                    "Marca: " + tablet.marca + "\n" +
                    "Modelo: " + tablet.modelo + "\n" +
                    "Batería: " + tablet.bateria + "\n" +
                    "Defecto: " + tablet.defecto + "\n" );
            
//            System.out.println("Cliente: " + tablet.cliente + "\n" + 
//                    "Marca: " + tablet.marca + "\n");
        }
            
    }
}
