
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SeguroAutomotor {
    String tipoSeguro, id,nombre,telefono,mail,dominio,marcaSelec,modeloSelec,anio;
    ArrayList <String> coberturaVehiculo = new ArrayList<>();
    
    public SeguroAutomotor( String tipoSeguro,
                            String id,
                            String nombre,
                            String telefono,
                            String mail,
                            String dominio,
                            String marcaSelec,
                            String modeloSelec,
                            String anio,
                            ArrayList coberturaVehiculo){
        this.tipoSeguro=tipoSeguro;
        this.id=id;
        this.nombre=nombre;
        this.telefono=telefono;
        this.mail=mail;
        this.dominio=dominio;
        this.marcaSelec=marcaSelec;
        this.modeloSelec=modeloSelec;
        this.anio=anio;
        this.coberturaVehiculo=coberturaVehiculo;
    }
    public String getTipoSeguor(){
        return tipoSeguro;
    }
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    public String getDominio() {
        return dominio;
    }

    public String getMarcaSelec() {
        return marcaSelec;
    }

    public String getModeloSelec() {
        return modeloSelec;
    }

    public String getAnio() {
        return anio;
    }

    public ArrayList<String> getCoberturaVehiculo() {
        return coberturaVehiculo;
    }
    public void guardar(){
        try {
            //System.out.println(nombre);
            BufferedWriter escribir = new BufferedWriter(new FileWriter("seguroAutomotor.txt",true));
            StringBuilder sb = new StringBuilder();
            sb.append(this.tipoSeguro).append(",")
                    .append(this.id).append(",")
                    .append(this.nombre).append(",")
                    .append(this.telefono).append(",")
                    .append(this.mail).append(",")
                    .append(this.marcaSelec).append(",")
                    .append(this.modeloSelec).append(",")
                    .append(this.anio).append(",");
            for(String item : coberturaVehiculo){
                sb.append(item).append(",");
                //System.out.println(item);
            }
            escribir.write(sb.toString());
            escribir.newLine();
            escribir.close();
                    
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
