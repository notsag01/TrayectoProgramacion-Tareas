
package ejercicio14m2.polimorfismo;

import javax.swing.JOptionPane;


public abstract class Vehiculos {
    
    public int elegirVehiculo(){
        int vehiculo = JOptionPane.showOptionDialog(null, "Elija un vehiculo: ", "VEHICULOS",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object []{"COCHE", "MOTO", "BUS"}, "COCHE");
        
        //System.out.println(seleccion);
        return vehiculo;
    }

    public abstract void estacionar();
}
