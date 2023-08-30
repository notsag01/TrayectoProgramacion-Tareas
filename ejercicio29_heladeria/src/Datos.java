
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Datos {
    public String nombre;
    public String telefono;
    public String direccion;
    public String localidad;
    public String entreCalles;
    public String comentarios;
    
    public Datos(String nombre, String telefono,String direccion, String localidad, String entreCalles, String comentarios){
        this.nombre=nombre;
        this.telefono=telefono;
        this.direccion=direccion;
        this.localidad=localidad;
        this.entreCalles=entreCalles;
        this.comentarios=comentarios;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getEntreCalles() {
        return entreCalles;
    }

    public String getComentarios() {
        return comentarios;
    }
    


//    void guardar(String nombre, String telefono, String direccion, String localidad, String entreCalles, String comentarios) {
//        try {
//            BufferedWriter escribir= new BufferedWriter(new FileWriter("pedidos.txt",true));
//            escribir.write(this.nombre + "," +this.telefono + "," +this.direccion + "," +this.localidad + "," +this.entreCalles + "," +this.comentarios);
//            escribir.newLine();
//            escribir.close();
//        } catch (IOException ex) {
//            System.out.println(ex);
//        }
//    }
    
}
