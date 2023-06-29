
package ejercicio16m2interfaz;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Ejercicio16m2Interfaz extends JFrame {
    private JLabel etiqueta;
    
    //CONSTRUCTRO
    public Ejercicio16m2Interfaz(){
        setLayout(null);
        
        etiqueta=new JLabel("Nombre y Apellidio: Cordoba Gastón H.");
        etiqueta.setBounds(0, 0, 600, 100);
        add(etiqueta);
        
        etiqueta=new JLabel("Teléfono: 15-1234-5678");
        etiqueta.setBounds(0, 20, 600, 100);
        add(etiqueta);
        
        etiqueta=new JLabel("Mail: gcordoba1981@gmail.com");
        etiqueta.setBounds(0, 40, 600, 100);
        add(etiqueta);
        
        etiqueta=new JLabel("Dni: 29.111.111");
        etiqueta.setBounds(0, 60, 600, 100);
        add(etiqueta);
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
