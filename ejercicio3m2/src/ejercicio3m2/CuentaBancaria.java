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
//    String tipoCuenta="";
//    String saldo="";
    
    public CuentaBancaria(String nombreTitular){
        this.nombreTitular = nombreTitular;
        
    }
    
    public String getNombre(){
     this.nombreTitular=JOptionPane.showInputDialog(null, "Nombre Titular");
     return this.nombreTitular;   
     
     
    }   
    public void setNombre(String nombreTitular){
        this.nombreTitular = nombreTitular;
    }
    

}
