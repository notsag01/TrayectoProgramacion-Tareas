
package informacion.jop;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class InformacionJOP {

    
    public static void main(String[] args) {
        String nombre="";
        String apellido="";
        String direccion="";
        String telefono="";
        ImageIcon imagen1= new ImageIcon("C:\\Users\\gas12\\Desktop\\DESCARTAR\\TrayectoProgramacion-Tareas\\informacion-JOP\\src\\imagenes\\imagenDos.png");
        
        JOptionPane.showMessageDialog(null,"BIENVENIDO","Saludo", JOptionPane.INFORMATION_MESSAGE);
        nombre=JOptionPane.showInputDialog(null,"Ingrese su nombre","DATOS", JOptionPane.INFORMATION_MESSAGE);
        apellido=JOptionPane.showInputDialog(null,"Ingrese su apellido","DATOS", JOptionPane.INFORMATION_MESSAGE);
        direccion=JOptionPane.showInputDialog(null,"Ingrese su direccion","DATOS", JOptionPane.INFORMATION_MESSAGE);
        telefono=JOptionPane.showInputDialog(null,"Ingrese su telefono","DATOS", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null,"BIENVENIDO " + nombre +" " + apellido + ". \n Su direccione es " + direccion + "\n y su telefono " + telefono,"Saludo", JOptionPane.INFORMATION_MESSAGE,imagen1);
        
    }
    
}
