
package ejercicio19m2formularios;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio19m2Formularios extends JFrame implements ActionListener {
    
      private JButton btn1,salida;
    private JLabel etiq, etiq1, etiq2;
    private JTextField text1, text2, respuesta;
   
    private Ejercicio19m2Formularios(){
        setLayout(null);
        
        etiq=new JLabel("Calcule el Mayor");
        etiq.setSize(600, 50);
        etiq.setHorizontalAlignment(JLabel.CENTER);
        add(etiq);
       
        etiq1=new JLabel("Ingrese un numero");
        etiq1.setBounds(150, 45, 200, 25);
        add(etiq1);
       
        text1=new JTextField("");
        text1.setBounds(300, 50, 200, 25);
        add(text1);
       
        etiq2=new JLabel("Ingrese un numero");
        etiq2.setBounds(150, 95, 300, 50);
        add(etiq2);
       
        text2=new JTextField("");
        text2.setBounds(300, 100, 200, 25);
        add(text2);
       
        respuesta=new JTextField("");
        respuesta.setBounds(0, 150, 600, 40);
        add(respuesta);
       
        btn1=new JButton("Ok");
        btn1.setBounds(0, 560, 90, 30);
        btn1.addActionListener(this);
        add(btn1);
       
        salida=new JButton("Salir");
        salida.setBounds(300, 560, 90, 30);
        salida.addActionListener(this);
        add(salida);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            int num1=Integer.parseInt(text1.getText());
            int num2=Integer.parseInt(text2.getText());
           
            if(num1>num2){
                respuesta.setText("El número más grande es " + num1);
            }else{
                respuesta.setText("El número más grande es " + num2);          
            }
           
        }else if(e.getSource()==salida){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Ejercicio19m2Formularios formulario = new Ejercicio19m2Formularios();
        formulario.setBounds(0, 0, 600, 300);
        formulario.setVisible(true);
        formulario.setResizable(true);
        formulario.setTitle("Cual es más grande?");
    }
    
}
