
package ejercicio18m2fields;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Ejercicio18m2Fields extends JFrame implements ActionListener {
    
    final private JButton saludar,salida;
    final private JLabel etiqueta, respuesta;
    final private JTextField textBox;
   
    public Ejercicio18m2Fields(){
        setLayout(null);
       
        etiqueta = new JLabel("Ingrese su nombre");
        etiqueta.setBounds(10, 10, 300, 30);
        add(etiqueta);
       
        respuesta = new JLabel("");
        respuesta.setBounds(10, 150, 300, 30);
        add(respuesta);
       
        textBox=new JTextField();
        textBox.setBounds(120, 17, 150, 30);
        add(textBox);
       
        saludar=new JButton("Saludar");
        saludar.setBounds(10, 100, 90, 30);
        saludar.addActionListener(this);
        add(saludar);
       
        salida=new JButton("Salida");
        salida.setBounds(210, 200, 90, 30);
        salida.addActionListener(this);
        add(salida);                        
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==saludar){
            respuesta.setText("Hola " +textBox.getText());
        }else if(e.getSource()==salida){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
      Ejercicio18m2Fields formulario = new Ejercicio18m2Fields();
        formulario.setBounds(0, 0, 350, 300);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setTitle("Saludar");   
    }
    
}
