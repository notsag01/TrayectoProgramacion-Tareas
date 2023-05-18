
package credenciales;

import javax.swing.JOptionPane;

public class CREDENCIALES {


    public static void main(String[] args) {
        final String usuario="GASTON";
        final String id="123A";
        String usuarioVerificar="";
        String idVerificar="";
        int contador=0;
        
        while( contador <= 3){
            usuarioVerificar= JOptionPane.showInputDialog(null,"Ingrese su nombre ","INPUT",JOptionPane.QUESTION_MESSAGE).toUpperCase();        
            System.out.println(usuarioVerificar);
            idVerificar = JOptionPane.showInputDialog(null,"Ingrese su nombre ","INPUT",JOptionPane.QUESTION_MESSAGE).toUpperCase();        
            System.out.println(idVerificar);

            if(usuario.equals(usuarioVerificar) && id.equals(idVerificar) ){
                JOptionPane.showMessageDialog(null,"ACCESO ","Mensaje de Informacion",JOptionPane.INFORMATION_MESSAGE);
                break;
            }else if(usuario.equals(usuarioVerificar)  && !id.equals(idVerificar)){
                JOptionPane.showMessageDialog(null,"ACCESO DENEGADO \n El ID es incorrecto" ,"Mensaje de Informacion",JOptionPane.INFORMATION_MESSAGE);                    
                contador++;
                System.out.println(contador);
            }else if(!usuario.equals(usuarioVerificar)  && id.equals(idVerificar)){
                JOptionPane.showMessageDialog(null,"ACCESO DENEGADO \n El Usuario es incorrecto" ,"Mensaje de Informacion",JOptionPane.INFORMATION_MESSAGE);            
                contador++;
                System.out.println(contador);
            }else{
                JOptionPane.showMessageDialog(null,"ACCESO DENEGADO \n Verifique sus credenciales" ,"Mensaje de Informacion",JOptionPane.INFORMATION_MESSAGE);                        
                contador++;
                System.out.println(contador);
            }
        }
        
        
        
        
        
        
        
    }
    
}
