
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class ArchivarDatos {
    Datos datos;
    
    public ArchivarDatos(Datos datos){
        this.datos=datos;
    }

//    ArchivarDatos() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
    void guardar() {
        try {
            BufferedWriter escribir= new BufferedWriter(new FileWriter("pedidos.txt",true));
            escribir.write(datos.getNombre() + "," +datos.getTelefono() + ","
                    +datos.getDireccion()+ "," +datos.getLocalidad() + "," 
                    +datos.getEntreCalles() + "," +datos.getComentarios());
            escribir.newLine();
            escribir.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
