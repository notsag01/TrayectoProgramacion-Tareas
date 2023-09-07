
public class Personas {
    
    String tipoSeguro, cuit, nombre, telefono, mail,incendio,robo,inundacion;
    
    public Personas(String tipoSeguro,
            String cuit,
            String nombre,
            String telefono,
            String mail,
            String incendio,
            String robo,
            String inundacion){
        this.tipoSeguro=tipoSeguro;
        this.cuit=cuit;
        this.nombre= nombre;
        this.telefono=telefono;
        this.mail=mail;
        this.incendio=incendio;
        this.robo=robo;
        this.inundacion=inundacion;
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

    public String getIncendio() {
        return incendio;
    }

    public String getRobo() {
        return robo;
    }

    public String getInundacion() {
        return inundacion;
    }
    
}
