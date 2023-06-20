/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4m3;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Motos {
     
    String marca="";
    String modelo="";
    String color="";
    String costo="";
    int precioVenta=0;
    private ArrayList<Motos> motos=new ArrayList<>();
    
    ImageIcon imagen1= new ImageIcon("src/imagenes/moto2.png");
    
    //CONSTRUCTOT
    public Motos(String marca, String modelo, String color){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
    }
    
    public void nuevaMoto(){
        marca =(String) JOptionPane.showInputDialog(null, "Marca", "marca", JOptionPane.QUESTION_MESSAGE, imagen1, null, null);
        modelo =(String) JOptionPane.showInputDialog(null, "Modelo", "modelo", JOptionPane.QUESTION_MESSAGE, imagen1, null, null);
        color =(String) JOptionPane.showInputDialog(null, "color", "color", JOptionPane.QUESTION_MESSAGE, imagen1, null, null);
        costo =(String) JOptionPane.showInputDialog(null, "costo", "costo", JOptionPane.QUESTION_MESSAGE, imagen1, null, null);
        
        Motos moto=new Motos(marca,modelo,color);
        
        motos.add(moto);
        System.out.println(moto.marca);
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
                "CONFIRMACION ", JOptionPane.QUESTION_MESSAGE, imagen1);
        
    }
}
