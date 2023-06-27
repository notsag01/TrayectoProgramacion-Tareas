/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9m2encapsulamiento;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ejercicio9m2Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ImageIcon imagen1= new ImageIcon("src/imagenes/auto1.png");
        ImageIcon imagen2= new ImageIcon("src/imagenes/auto2.png");
        ImageIcon imagen3= new ImageIcon("src/imagenes/moto2.png");
        
    
        
        int nuevo=0;
        while(nuevo == 0){
            int seleccion = JOptionPane.showOptionDialog(null, "Qué desea cargar?", "Nueva Cargar?",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"AUTOS", "MOTOS"}, "AUTOS");

            switch(seleccion){
                case 0: Autos nuevoAuto = new Autos("", "", "", "");      
                        String marca =(String) JOptionPane.showInputDialog(null, "Marca", "marca", JOptionPane.QUESTION_MESSAGE, imagen1, null, null);
                        nuevoAuto.setMarca(marca);
                        String modelo =(String) JOptionPane.showInputDialog(null, "Modelo", "modelo", JOptionPane.QUESTION_MESSAGE, imagen1, null, null);
                        nuevoAuto.setModelo(modelo);
                        String color =(String) JOptionPane.showInputDialog(null, "color", "color", JOptionPane.QUESTION_MESSAGE, imagen1, null, null);
                        nuevoAuto.setColor(color);
                        String costo =(String) JOptionPane.showInputDialog(null, "costo", "costo", JOptionPane.QUESTION_MESSAGE, imagen1, null, null); 
                        nuevoAuto.setCosto(costo);
                        System.out.println("Marca: " + nuevoAuto.getMarca() + "\n" + 
                                            "Modelo: " + nuevoAuto.getModelo() + "\n" + 
                                            "Color: " + nuevoAuto.getColor() + "\n" + 
                                            "Costo: " + nuevoAuto.getCosto() + "\n");
                break;
                case 1: Motos nuevaMoto= new Motos("", "", "", "");
                        marca =(String) JOptionPane.showInputDialog(null, "Marca", "marca", JOptionPane.QUESTION_MESSAGE, imagen3, null, null);
                        nuevaMoto.setMarca(marca);
                        modelo =(String) JOptionPane.showInputDialog(null, "Modelo", "modelo", JOptionPane.QUESTION_MESSAGE, imagen3, null, null);
                        nuevaMoto.setModelo(modelo);
                        color =(String) JOptionPane.showInputDialog(null, "color", "color", JOptionPane.QUESTION_MESSAGE, imagen3, null, null);
                        nuevaMoto.setColor(color);
                        costo =(String) JOptionPane.showInputDialog(null, "costo", "costo", JOptionPane.QUESTION_MESSAGE, imagen3, null, null);                
                        nuevaMoto.setCosto(costo);
                        System.out.println("Marca: " + nuevaMoto.getMarca() + "\n" + 
                                            "Modelo: " + nuevaMoto.getModelo() + "\n" + 
                                            "Color: " + nuevaMoto.getColor() + "\n" + 
                                            "Costo: " + nuevaMoto.getCosto() + "\n");
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
