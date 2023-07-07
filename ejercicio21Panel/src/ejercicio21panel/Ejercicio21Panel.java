
package ejercicio21panel;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class Ejercicio21Panel extends JFrame implements ActionListener {
        public JLabel etiqNombre,etiqApellido,etiqGrado,etiqDivision, etiq1,etiq2,etiq3;
    public JButton btn1;
    public JTextField inputNombre, inputApellido, inputGrado,inputDivision, input1, input2,input3, respuesta;
    
    private Ejercicio21Panel(){
        etiqNombre=new JLabel("Ingrese en Nombre");
        etiqNombre.setBounds(50, 50, 350, 40);
        
        etiqApellido=new JLabel("Ingrese en Apellido");
        etiqApellido.setBounds(400, 50, 350, 40);
        
        etiqGrado=new JLabel("Ingrese en Grado");
        etiqGrado.setBounds(50, 100, 350, 40);        
        
        etiqDivision=new JLabel("Ingrese en Division");
        etiqDivision.setBounds(300, 100, 350, 40);        
        
        etiq1=new JLabel("Inserte la nota numero 1: ");
        etiq1.setBounds(50, 150, 200, 40);
        
        etiq2=new JLabel("Inserte la nota numero 2: ");
        etiq2.setBounds(50, 200, 200, 20);
        
        etiq3=new JLabel("Inserte la nota numero 3: ");
        etiq3.setBounds(50, 250, 200, 20);
        
        inputNombre=new JTextField();
        inputNombre.setBounds(210, 55, 150, 20);
        
        inputApellido=new JTextField();
        inputApellido.setBounds(510, 55, 150, 20);
        
        inputGrado=new JTextField();
        inputGrado.setBounds(210, 105, 50, 20);
        
        inputDivision=new JTextField();
        inputDivision.setBounds(410, 110, 50, 20);
        
        input1=new JTextField();
        input1.setBounds(210, 160, 150, 20);
        
        input2=new JTextField();
        input2.setBounds(210, 210, 150, 20);
        
        input3=new JTextField();
        input3.setBounds(210, 255, 150, 20);
        
        btn1= new JButton("Calcular");
        btn1.setBounds(210, 300, 150, 45);
        btn1.addActionListener(this);
        
        respuesta=new JTextField();
        respuesta.setBounds(50, 370,400, 40);
        respuesta.setHorizontalAlignment(JTextField.CENTER);
        respuesta.setEditable(false);
        
        Container panel = getContentPane();
        panel.setLayout(null);
        panel.add(etiqNombre);
        panel.add(etiqApellido);
        panel.add(etiqGrado);
        panel.add(etiqDivision);
        panel.add(etiq1);
        panel.add(etiq2);
        panel.add(etiq3);
        panel.add(inputNombre);
        panel.add(inputApellido);
        panel.add(inputGrado);
        panel.add(inputDivision);
        panel.add(input1);
        panel.add(input2);
        panel.add(input3);
        panel.add(btn1);
        panel.add(respuesta);
        panel.setBackground(Color.pink);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            //System.out.println("Its work");
            DecimalFormat formato = new DecimalFormat("#.##");
            String nombre=inputNombre.getText();
            String apellido=inputApellido.getText();
            String grado=inputGrado.getText();
            String division=inputDivision.getText();
            double nota1=Integer.parseInt(input1.getText());
            double nota2=Integer.parseInt(input2.getText());
            double nota3=Integer.parseInt(input3.getText());
            double promedio=(nota1 + nota2 + nota3) /3;
            
            if(promedio>=6){
                respuesta.setText("Aprobado " + String.valueOf(formato.format(promedio)));
            }else{
                respuesta.setText("Desaprobado " + String.valueOf(formato.format(promedio)));
            }                                    
            mostrarInfo();
        }
    }

    public static void main(String[] args) {
        Ejercicio21Panel formulario = new Ejercicio21Panel();
        formulario.setVisible(true);
        formulario.setBounds(0, 0, 700, 500);
        formulario.setResizable(true);
        formulario.setTitle("PROMEDIOS");
    }

    private void mostrarInfo() {
        JOptionPane.showMessageDialog(null, 
                "Nombre: " + inputNombre.getText() + "\n" +
                "Apellido: " + inputApellido.getText() + "\n" +
                "Grado: " + inputGrado.getText() + "\n" +
                "Division: " + inputDivision.getText() + "\n" +
                "Respuesta: " + respuesta.getText(),
                "Calificacion",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
