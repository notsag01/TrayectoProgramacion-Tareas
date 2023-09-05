
import java.util.ArrayList;


public class SeguroAutomotor {
    String id,nombre,telefono,mail,dominio,marcaSelec,modeloSelec,anio;
    ArrayList <String> coberturaVehiculo = new ArrayList<>();
    
    public SeguroAutomotor(String id,
                            String nombre,
                            String telefono,
                            String mail,
                            String dominio,
                            String marcaSelec,
                            String modeloSelec,
                            String anio){
        this.id=id;
        this.nombre=nombre;
        this.telefono=telefono;
        this.mail=mail;
        this.dominio=dominio;
        this.marcaSelec=marcaSelec;
        this.modeloSelec=modeloSelec;
        this.anio=anio;
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
        System.out.println(nombre);
    }
}
