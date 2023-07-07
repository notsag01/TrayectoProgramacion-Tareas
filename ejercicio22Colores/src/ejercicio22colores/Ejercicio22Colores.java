
package ejercicio22colores;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Ejercicio22Colores extends JFrame implements ActionListener {
    public JLabel etiqColor1= new JLabel();
    public JTextField inputColor1= new JTextField();
    public JButton btnColor1= new JButton();
    public Container panel;
    Ejercicio22Colores(){
        setLayout(null);
        
        etiqColor1=new JLabel("Elija un color: ");
        etiqColor1.setBounds(0, 100, 150, 40);
        
        inputColor1=new JTextField();
        inputColor1.setBounds(155, 105, 150, 40);
        
        btnColor1=new JButton("Click");
        btnColor1.setBounds(150, 200, 150, 40);
        btnColor1.addActionListener(this);
        
        panel= getContentPane();
        panel.add(etiqColor1);
        panel.add(inputColor1);
        panel.add(btnColor1);
        panel.setBackground(Color.pink);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btnColor1){
           //System.out.println("Hello");
           String colorSelec=inputColor1.getText().toUpperCase();
           cambiarColor(colorSelec);
           
           
       }
    }
    
    
    public static void main(String[] args) {
        Ejercicio22Colores formulario = new Ejercicio22Colores();
        formulario.setBounds(0, 0, 400, 300);
        formulario.setVisible(true);
        formulario.setResizable(true);
        formulario.setTitle("COLORES");
    }

    private void cambiarColor(String colorSelec) {
        Color bgColor;
        switch (colorSelec){
            case "ROJO" : bgColor=Color.RED;
            break;
            case "VERDE" : bgColor=Color.GREEN;
            break;
            case "AZUL" : bgColor=Color.BLUE;
            break;
            default : bgColor = Color.PINK;
            break;
        }
        panel.setBackground(bgColor);
    }

    
}

    
