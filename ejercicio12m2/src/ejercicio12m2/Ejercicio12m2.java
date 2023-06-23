/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12m2;

import Funciones.Funciones;
import Funciones.Celulares;
import Funciones.Tabletas;
import Funciones.Notebooks;
import java.util.ArrayList;


import javax.swing.JOptionPane;

/**
 *
 * @author gas12
 */
public class Ejercicio12m2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LISTA DE ELEMENTOS DONDE LOS VAMOS A ALMACENAR
          ArrayList<Celulares> listaCelulares=new ArrayList<>();
          ArrayList<Tabletas> listaTabletas=new ArrayList<>();
          ArrayList<Notebooks> listaNotebooks=new ArrayList<>();
          Funciones funcion=new Funciones();
          
          funcion.Presentacion();
        
        int nuevaEntrada=0;
        do{    
            
              String elemento = funcion.seleccionarElemento();
              
            switch(elemento){
                case "CELULARES":   Celulares nuevoCelular=new Celulares("","","","","", "");        
                                    nuevoCelular.getDatos();      
                                    nuevoCelular.guardarDatos(listaCelulares);
                                    int imprimirListados=nuevoCelular.imprimir();
                                    switch(imprimirListados){
                                        case 0: nuevoCelular.imprimirListado(listaCelulares);
                                        break;
                                    }
                break;
                case "TABLETS":     Tabletas nuevaTablet=new Tabletas("","","","","", "");        
                                    nuevaTablet.getDatos();      
                                    nuevaTablet.guardarDatos(listaTabletas);
                                    int imprimirTabletas=nuevaTablet.imprimir();
                                    switch(imprimirTabletas){
                                        case 0: nuevaTablet.imprimirTabletas(listaTabletas);
                                        break;
                                    }                                      
                case "NOTEBOOKS":   Notebooks nuevaNotebook=new Notebooks("","","","","", "");        
                                    nuevaNotebook.getDatos();      
                                    nuevaNotebook.guardarDatos(listaNotebooks);
                                    int imprimirNotebooks=nuevaNotebook.imprimir();
                                    switch(imprimirNotebooks){
                                        case 0: nuevaNotebook.imprimirNotebooks(listaNotebooks);
                                        break;
                                    }                                      

                                    
            }  
            
            
            
            nuevaEntrada=funcion.recargar();
        }while(nuevaEntrada==0);
        
        
       
    }
    
}
