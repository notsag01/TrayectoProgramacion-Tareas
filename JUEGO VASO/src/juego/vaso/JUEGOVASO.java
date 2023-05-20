
package juego.vaso;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class JUEGOVASO {

   
    public static void main(String[] args) {
        
        //VARIABLES ***
        Random RD= new Random();
        int pelotita=RD.nextInt(3);
        
        ImageIcon Icono= new ImageIcon("src/imagenes/juego.png");
        ImageIcon Bien= new ImageIcon("src/imagenes/bien.png");
        ImageIcon Mal= new ImageIcon("src/imagenes/mal.png");
        
        int seleccion=JOptionPane.showOptionDialog(null,
                "Encuentra la pelotita en los vasos!",
                "Juego del Vaso",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,Icono,
                new Object[]{"VASO 1", "VASO 2","VASO 3"}, "VASO1");
        
        if(pelotita == seleccion){
             JOptionPane.showMessageDialog(null,"MUY BIEN","Juego del Vaso",JOptionPane.INFORMATION_MESSAGE,Bien);
        }else{
             JOptionPane.showMessageDialog(null,"MUY MAL","Juego del Vaso",JOptionPane.INFORMATION_MESSAGE,Mal);        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
