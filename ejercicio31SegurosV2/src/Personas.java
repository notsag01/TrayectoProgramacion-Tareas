
public class Personas {
    
    String tipoSeguro, cuit, nombre, telefono, mail;
    
    public Personas(String tipoSeguro,String cuit,String nombre,String telefono,String mail){
        this.tipoSeguro=tipoSeguro;
        this.cuit=cuit;
        this.nombre= nombre;
        this.telefono=telefono;
        this.mail=mail;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public String getCuit() {
        return cuit;
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
    
}
