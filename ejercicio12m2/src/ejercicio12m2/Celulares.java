/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12m2;

import Funciones.Funciones;
import java.util.ArrayList;


/**
 *
 * @author gas12
 */
public class Celulares extends Funciones {
    
    ArrayList<Celulares> lista=new ArrayList<>();
    
    public Celulares(String cliente, String elemento, String marca){
        this. cliente=cliente;
        this. elemento=elemento;
        this. marca=marca;
    }
    
    public void addLista(){
        Celulares nuevoIngreso= new Celulares(cliente, elemento, marca);
        
        lista.add(nuevoIngreso);
    }
    
    
    
}
