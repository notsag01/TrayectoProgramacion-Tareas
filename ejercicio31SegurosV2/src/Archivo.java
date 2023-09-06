
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Archivo {
    
    
    public void crearArchivo(){
    
    }
    
    public void escribirArchivo(Personas persona){
        try {
            BufferedWriter escribir = new BufferedWriter(new FileWriter("seguros.txt",true));
            escribir.write(persona.getTipoSeguro() + "," +
                            persona.getCuit() + "," +
                            persona.getNombre() + "," +
                            persona.getTelefono() + "," +
                            persona.getMail());
                            
            escribir.newLine();
            escribir.close();
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }   
    
}
