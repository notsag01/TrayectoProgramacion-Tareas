/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Autos {
    
    
    String marca="";
    String modelo="";
    String color="";
    String costo="";
    int precioVenta=0;
    
    ImageIcon imagen1= new ImageIcon("src/imagenes/auto1.png");
    ImageIcon imagen2= new ImageIcon("src/imagenes/auto2.png");
    
    //CONSTRUCTOR
    public Autos(String marca, String modelo, String color, String costo){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.costo=costo;
    }
    
    public void nuevoAuto(){
              

    }
    public void calcularPV(){
        int costoN= Integer.parseInt(costo);
        //System.out.println(costoN);
        
        precioVenta = (int) (costoN * 1.5);
        System.out.println(precioVenta);
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null,
                "Marca: " + marca +"\n" +
                "Modelo: " + modelo + "\n" +
                "Color: " + color + "\n" +
                "Costo: " + costo + "\n" +
                "Precio al público: " + precioVenta,
                "CONFIRMACION ", JOptionPane.QUESTION_MESSAGE, imagen2);
        
    }
    
    
    
    
    
    
    
}
