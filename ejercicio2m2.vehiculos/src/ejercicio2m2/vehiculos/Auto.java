
package ejercicio2m2.vehiculos;

import javax.swing.JOptionPane;

public class Auto {
    String marca="";
    String modelo="";
    String kilometraje="";
    
    public void getData(){
        marca= (String) JOptionPane.showInputDialog(null, "Ingrese una Marca: ", "Marca", JOptionPane.QUESTION_MESSAGE, null, null, null);
        modelo= (String) JOptionPane.showInputDialog(null, "Ingrese una Modelo: ", "Modelo", JOptionPane.QUESTION_MESSAGE, null, null, null);
        kilometraje= (String) JOptionPane.showInputDialog(null, "Ingrese una Kilometraje: ", "Kilometraje", JOptionPane.QUESTION_MESSAGE, null, null, null);
    }
}
