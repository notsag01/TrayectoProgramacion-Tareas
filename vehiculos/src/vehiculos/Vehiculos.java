/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            ImageIcon imagen1= new ImageIcon("src/imagenes/auto1.png");
    ImageIcon imagen2= new ImageIcon("src/imagenes/auto2.png");
        
        int nuevo=0;
        while(nuevo == 0){
            int seleccion = JOptionPane.showOptionDialog(null, "Qué desea cargar?", "Nueva Cargar?",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"AUTOS", "MOTOS"}, "AUTOS");

            switch(seleccion){
                case 0: String marca =(String) JOptionPane.showInputDialog(null, "Marca", "marca", JOptionPane.QUESTION_MESSAGE, imagen1, null, null);
                        String modelo =(String) JOptionPane.showInputDialog(null, "Modelo", "modelo", JOptionPane.QUESTION_MESSAGE, imagen1, null, null);
                        String color =(String) JOptionPane.showInputDialog(null, "color", "color", JOptionPane.QUESTION_MESSAGE, imagen1, null, null);
                        String costo =(String) JOptionPane.showInputDialog(null, "costo", "costo", JOptionPane.QUESTION_MESSAGE, imagen1, null, null);  
                        Autos nuevoAuto = new Autos(marca, modelo,color, costo);      
                        nuevoAuto.nuevoAuto();
                        nuevoAuto.calcularPV();
                        nuevoAuto.imprimir();
                break;
                case 1: Motos nuevaMoto= new Motos();
                        nuevaMoto.nuevaMoto();
                        nuevaMoto.calcularPV();
                        nuevaMoto.imprimir();
                break;        
            }
            
            int nuevaConsulta = JOptionPane.showOptionDialog(null, "Desea realizar una nueva carga?", "Nueva Cargar?",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"SI", "NO"}, "SI");
            
            switch(nuevaConsulta){
                case 0: nuevo = 0;
                break;
                case 1: nuevo = 1;
            }
            
        }
        
        
        
        
        
        
        
        
    }
    
}
