
package Funciones;

import javax.swing.JOptionPane;

public abstract class Funciones {
    protected float num1, num2, resultado;
    
    public int presOpciones(){
        int seleccion = JOptionPane.showOptionDialog(null, 
                "Selecciona una opción: ", "Seleccion",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object []{"SUMAR","RESTAR", "SALIR"}, "SUMAR");
        
        return seleccion;
    }
    
    public void obtenerDatos(){
        String valor1 = JOptionPane.showInputDialog(null, "Ingrese el primer número: " + "DATOS", JOptionPane.QUESTION_MESSAGE);
        String valor2 = JOptionPane.showInputDialog(null, "Ingrese el segundo número: " + "DATOS", JOptionPane.QUESTION_MESSAGE);
        
        num1= Float.parseFloat(valor1);
        num2= Float.parseFloat(valor2);
    }
    
    public void imprimir(){
        System.out.println("El resultado es: " + resultado);
    }

}
