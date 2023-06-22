/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import Funciones.Funciones;
import Funciones.Celulares;
import java.util.ArrayList;


/**
 *
 * @author gas12
 */
public class Celulares extends Funciones {
    
    ArrayList<Celulares> listaCelulares=new ArrayList<>();
    
    public Celulares(String cliente, String elemento, String marca){
        this.cliente=cliente;
        this.elemento=elemento;
        this.marca=marca;
    }
    
    public void guardarDatos(){
        System.out.println(cliente + elemento + marca);
        
        Celulares celular=new Celulares(cliente, elemento, marca);
        
        listaCelulares.add(celular);
    }
    
    
    
    
}
