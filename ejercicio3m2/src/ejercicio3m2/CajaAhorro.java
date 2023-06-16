/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3m2;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class CajaAhorro {
    private String usuarios;
    private int saldo = 0;
    
        //contrustor 
    public CajaAhorro (String usuarios){
        this.usuarios = usuarios;
    }
    public void finalizar(){
        System.exit(0);
    }
    public void nuevaOperacion(){
        int opciones = JOptionPane.showOptionDialog(null,
                "DESEA REALIZAR OTRA OPERACION?",
                "CONSULTA",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object []{"DEPOSITAR", "DEBITAR", "SALIR"}, "DEPOSITAR");
        
        if(opciones == 0){
            acreditar();
        }else if(opciones == 1){
            debitar();
        }else{
            finalizar();
        }
    }
    public void saludar(){
        JOptionPane.showMessageDialog(null, "Bienvenido, " + usuarios, "SALUDO", JOptionPane.INFORMATION_MESSAGE);
    }
    public void informarSaldo(){
        JOptionPane.showMessageDialog(null, "Su saldo es de $" + saldo, "SALDO", JOptionPane.INFORMATION_MESSAGE);   
        nuevaOperacion();
    }
    public void solicitarAccion(){
        int accion = JOptionPane.showOptionDialog(null,
                "Como desea continuar?",
                "?",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new Object []{"DEPOSITAR", "EXTRACCION"}, "DEPOSITAR");
        
        if(accion == 0){
            acreditar();
        }else{
            debitar();
        }
    }
    public void acreditar (){
        String addSaldo = (String) JOptionPane.showInputDialog(null, "Cual es el monto a depositar?", "DEPOSITO", JOptionPane.QUESTION_MESSAGE);
        int acrSaldo= Integer.parseInt(addSaldo);
        saldo += acrSaldo;
        informarSaldo();
    }
    public void debitar (){
        if(saldo <= 0){
            JOptionPane.showMessageDialog(null, "Ustes no dispone de sufieiciente dinero en este momento", "INFORMACION", JOptionPane.INFORMATION_MESSAGE, null);
            nuevaOperacion();
        }else{
            String sustraerSaldo = (String) JOptionPane.showInputDialog(null, "Cual es el monto a depositar?", "DEPOSITO", JOptionPane.QUESTION_MESSAGE);
            int debSaldo= Integer.parseInt(sustraerSaldo);
            if(saldo >= debSaldo){
                saldo -= debSaldo;
                informarSaldo();                    
            }else{            
                JOptionPane.showMessageDialog(null, "Ustes no dispone de sufieiciente dinero en este momento", "INFORMACION", JOptionPane.INFORMATION_MESSAGE, null);
                nuevaOperacion();
            }
        }
    }
}
