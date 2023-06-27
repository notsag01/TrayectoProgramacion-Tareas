/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9m2encapsulamiento;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Autos {
    
    
    private String marca="";
    private String modelo="";
    private String color="";
    String costo="";
    
    ImageIcon imagen1= new ImageIcon("src/imagenes/auto1.png");
    ImageIcon imagen2= new ImageIcon("src/imagenes/auto2.png");
    
    //CONSTRUCTOR
    public Autos(String marca, String modelo, String color, String costo){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.costo=costo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getCosto() {
        return costo;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
    
    
 }
    
    
    
    
    
    


