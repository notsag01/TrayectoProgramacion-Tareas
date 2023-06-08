/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

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
        
        int seleccion = JOptionPane.showOptionDialog(null, "Qué desea cargar?", "Nueva Cargar?",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"AUTOS", "MOTOS"}, "AUTOS");
        
        switch(seleccion){
            case 0: Autos nuevoAuto= new Autos();
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
        
        
        
        
        
        
        
        
        
    }
    
}
