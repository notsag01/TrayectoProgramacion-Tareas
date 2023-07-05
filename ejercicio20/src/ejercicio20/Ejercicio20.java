
package ejercicio20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Ejercicio20 extends JFrame implements ActionListener {
    public JLabel etiq1,etiq2,etiq3;
    public JButton btn1;
    public JTextField input1, input2,input3, respuesta;
    
    private Ejercicio20(){
        setLayout(null);
        
        etiq1=new JLabel("Inserte la nota numero 1: ");
        etiq1.setBounds(50, 100, 200, 40);
        add(etiq1);
        
        etiq2=new JLabel("Inserte la nota numero 2: ");
        etiq2.setBounds(50, 150, 200, 20);
        add(etiq2);
        
        etiq3=new JLabel("Inserte la nota numero 3: ");
        etiq3.setBounds(50, 200, 200, 20);
        add(etiq3);
        
        input1=new JTextField();
        input1.setBounds(210, 110, 150, 20);
        add(input1);
        
        input2=new JTextField();
        input2.setBounds(210, 160, 150, 20);
        add(input2);
        
        input3=new JTextField();
        input3.setBounds(210, 205, 150, 20);
        add(input3);
        
        btn1= new JButton("Calcular");
        btn1.setBounds(210, 250, 150, 45);
        btn1.addActionListener(this);
        add(btn1);
        
        respuesta=new JTextField();
        respuesta.setBounds(50, 320,400, 40);
        respuesta.setHorizontalAlignment(JTextField.CENTER);
        add(respuesta);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            //System.out.println("Its work");
            DecimalFormat formato = new DecimalFormat("#.##");
            double nota1=Integer.parseInt(input1.getText());
            double nota2=Integer.parseInt(input2.getText());
            double nota3=Integer.parseInt(input3.getText());
            double promedio=(nota1 + nota2 + nota3) /3;
            
            respuesta.setText(String.valueOf(formato.format(promedio)));
            
            
        }
    }
    public static void main(String[] args) {
        Ejercicio20 formulario = new Ejercicio20();
        formulario.setVisible(true);
        formulario.setBounds(0, 0, 500, 500);
        formulario.setResizable(true);
        formulario.setTitle("PROMEDIOS");
        
        
    }

    
}
