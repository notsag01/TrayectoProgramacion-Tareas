package ejercicio3m2;

import javax.swing.JOptionPane;


public class Ejercicio3m2 {


    public static void main(String[] args) {
        String usuario ="";
        int tipoCuenta;
        
        //INGRESAR NOMBRE DE USUARIO
        do{
             usuario=(String) JOptionPane.showInputDialog(null, "Ingrese su nombre", "DATOS", JOptionPane.QUESTION_MESSAGE);
        }while(usuario == null || usuario.equals("") );
        
        tipoCuenta=JOptionPane.showOptionDialog(null,
                "Tipo de cuenta?",
                "DATOS",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object [] {"CUENTA CORRIENTE", "CAJA DE AHORRO"},
                "CUENTA CORRIETE");
        System.out.println(tipoCuenta);
        
        
        
        
        
    }
    
}
