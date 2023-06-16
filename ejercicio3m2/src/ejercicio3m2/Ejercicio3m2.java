package ejercicio3m2;

import javax.swing.JOptionPane;


public class Ejercicio3m2 {


    public static void main(String[] args) {
        String usuario ="";
        
        //INGRESAR NOMBRE DE USUARIO
        do{
             usuario=(String) JOptionPane.showInputDialog(null, "Ingrese su nombre", "DATOS", JOptionPane.QUESTION_MESSAGE).toUpperCase();
        }while(usuario == null || usuario.equals("") );
        
        int tipoCuenta=JOptionPane.showOptionDialog(null,
                "Tipo de cuenta?",
                "DATOS",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object [] {"CUENTA CORRIENTE", "CAJA DE AHORRO"},
                "CUENTA CORRIETE");
        
        if(tipoCuenta == 0){
            cuentaCorriente tipito1 = new cuentaCorriente(usuario);
            tipito1.saludar();
            tipito1.informarSaldo();
            tipito1.solicitarAccion();
        }else{
            CajaAhorro tipito1 = new CajaAhorro(usuario);
            tipito1.saludar();
            tipito1.informarSaldo();
            tipito1.solicitarAccion();
        }
        
        
        
        
    }
    
}
