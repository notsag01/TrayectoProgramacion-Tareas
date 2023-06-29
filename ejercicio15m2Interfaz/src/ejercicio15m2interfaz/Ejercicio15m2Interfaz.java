
package ejercicio15m2interfaz;


import javax.swing.JFrame;
import javax.swing.JLabel;


public class Ejercicio15m2Interfaz extends JFrame {
     private final JLabel etiq;
    
    //CONSTRUCTOR DE LA CLASE
    public Ejercicio15m2Interfaz(){
        //COORDENADAS DE UBICACION DEL FORMULARIO
        setLayout(null);
        
        //Creamos la etiqueta
        // Crea una etiqueta con el texto "X"
        etiq =new JLabel("Hello, World");
        //Establece la posición (x, y) y las dimensiones (ancho, alto) de la etiqueta
        etiq.setBounds(0, 0, 500, 300);
        // Establece la alineación horizontal del texto en el centro
        etiq.setHorizontalAlignment(JLabel.CENTER);
        // Agrega la etiqueta al formulario
        add(etiq);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        Ejercicio15m2Interfaz formulario = new Ejercicio15m2Interfaz();
        
        formulario.setBounds(0, 0, 500, 300);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
        formulario.setResizable(false);
        formulario.setTitle("Mi primer Formulario");
        
    }
    
}
