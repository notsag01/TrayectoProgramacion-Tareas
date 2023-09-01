
import java.util.ArrayList;


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
    
}
