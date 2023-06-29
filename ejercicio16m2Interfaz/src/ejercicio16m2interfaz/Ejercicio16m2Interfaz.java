
package ejercicio16m2interfaz;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Ejercicio16m2Interfaz extends JFrame {
    private JLabel etiqueta;
    
    //CONSTRUCTRO
    public Ejercicio16m2Interfaz(){
        setLayout(null);
        
        
    }


    public static void main(String[] args) {
        Ejercicio16m2Interfaz formulario= new Ejercicio16m2Interfaz();
        formulario.setBounds(0, 0, 600, 400);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(false);
        formulario.setTitle("Datos");
    }
    
}
