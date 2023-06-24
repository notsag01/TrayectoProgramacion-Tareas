
package ejercicio14m2.polimorfismo;

import javax.swing.JOptionPane;


public abstract class Vehiculos {
     String vehiculo="";
    
    public void elegirVehiculo(){
        int seleccion = JOptionPane.showOptionDialog(null, "Elija un vehiculo: ", "VEHICULOS",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object []{"COCHE", "MOTO", "BUS"}, "COCHE");
        
        //System.out.println(seleccion);
        
    }
    public abstract void estacionar();
}
