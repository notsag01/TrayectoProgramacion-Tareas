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
public class CuentaBancaria {
    String nombreTitular="";
    int tipoCuenta;
    String saldo="";
    
    public void getDatos(){
        do{
            nombreTitular= (String) JOptionPane.showInputDialog(null, "Ingrese una nombre del titular de la cuenta: ", "DATOS", JOptionPane.QUESTION_MESSAGE, null, null, null);
        }while(nombreTitular == null || nombreTitular.equals("") );
            tipoCuenta = JOptionPane.showOptionDialog(null, "Eligue el tipo de cuenta: ", "El juego del Vaso",
                                     JOptionPane.YES_NO_CANCEL_OPTION,
                                     JOptionPane.INFORMATION_MESSAGE, null,
                                     new Object[]{"Caja de Ahorro", "Cuenta Corriente"}, "Caja de Ahorro");
        do{
            saldo= (String) JOptionPane.showInputDialog(null, "Ingrese el saldo: ", "DATOS", JOptionPane.QUESTION_MESSAGE, null, null, null);
        }while(saldo == null || saldo.equals("") );
    } 
   
    

}
