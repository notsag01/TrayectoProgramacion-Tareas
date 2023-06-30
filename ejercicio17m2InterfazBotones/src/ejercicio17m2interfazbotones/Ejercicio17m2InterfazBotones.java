
package ejercicio17m2interfazbotones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio17m2InterfazBotones extends JFrame implements ActionListener {
    private JButton btn1,btn2,btn3;
    private JLabel etiqueta;
    
    //CONSTRUCTOR
    public Ejercicio17m2InterfazBotones(){
        btn1=new JButton("btn1");
        btn1.setBounds(0, 100, 100, 50);
        btn1.addActionListener(this);
        add(btn1);
        btn2=new JButton("btn2");
        btn2.setBounds(200, 100, 100, 50);
        btn2.addActionListener(this);
        add(btn2);
        btn3=new JButton("btn3");
        btn3.setBounds(300, 100, 100, 50);
        btn3.addActionListener(this);
        add(btn3);
        
        etiqueta=new JLabel("Presiona un boton");
        etiqueta.setBounds(0, 400, 200, 50);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            etiqueta.setText("Ha apretado el botón 1");
        }else if(e.getSource()==btn2){
            etiqueta.setText("Ha apretado el botón 2");
        }else{
            etiqueta.setText("Ha apretado el botón 3");
        }
    }

    public static void main(String[] args) {
        Ejercicio17m2InterfazBotones formulario=new Ejercicio17m2InterfazBotones();
        formulario.setBounds(0, 0, 600, 400);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formulario.setTitle("BOTONES");
    }

    
    
}
