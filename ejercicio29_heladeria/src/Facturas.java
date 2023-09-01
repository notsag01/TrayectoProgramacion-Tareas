
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Facturas {
    String fecha, nombre,mail,tamaño;
    ArrayList<String> gustos;
    
    public Facturas(String fecha,
                    String nombre,
                    String mail,
                    String tamaño,
                    ArrayList<String> gustos){
        
        this.fecha=fecha;
        this.nombre= nombre;
        this.mail=mail;
        this.tamaño=tamaño;
        this.gustos=gustos;
    
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMail() {
        return mail;
    }

    public String getTamaño() {
        return tamaño;
    }

    public ArrayList<String> getGustos(){
        return gustos;
    }
    
    public void mostrarFactura(){
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Fecha: ").append(this.fecha).append("\n");
        mensaje.append("Nombre: ").append(this.nombre).append("\n");
        mensaje.append("Mail: ").append(this.mail).append("\n");
        mensaje.append("Tamaño: ").append(this.tamaño).append("\n");
        for(String gusto : gustos){
            mensaje.append("*").append(gusto).append("\n")
        }
        
        //JOptionPane.showMessageDialog(null, fecha, mail, 0, icon);
    }
    
}