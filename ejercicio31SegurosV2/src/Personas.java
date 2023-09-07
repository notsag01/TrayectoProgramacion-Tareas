
public class Personas {
    
    String tipoSeguro, cuit, nombre, telefono, mail,
            incendio,robo,inundacion,
            heladera,lavarropas,cocina,notebook,notebookCantidad,consola,televisor,televisorCantidad;
    String muerte, muerteAccidental,internacion,internacionDias,paralisis;
    
    public Personas(String tipoSeguro,
            String cuit,
            String nombre,
            String telefono,
            String mail,
            String incendio, 
            String robo, 
            String inundacion, 
            String heladera, 
            String lavarropas,
            String cocina,
            String notebook,
            String notebookCantidad,
            String consola,
            String televisor,
            String televisorCantidad
    
    ){
        
        this.tipoSeguro=tipoSeguro;
        this.cuit=cuit;
        this.nombre= nombre;
        this.telefono=telefono;
        this.mail=mail;
        this.incendio=incendio;
        this.robo=robo;
        this.inundacion=inundacion;
        this.heladera=heladera;
        this.lavarropas=lavarropas;
        this.cocina=cocina;
        this.notebook=notebook;
        this.notebookCantidad=notebookCantidad;
        this.consola=consola;
        this.televisor=televisor;
        this.televisorCantidad=televisorCantidad;
    }
    
    public Personas(String tipoSeguro,
            String cuit,
            String nombre,
            String telefono,
            String mail,
            String muerte, 
            String muerteAccidental, 
            String internacion, 
            String internacionDias, String paralisis){
        
        this.tipoSeguro=tipoSeguro;
        this.cuit=cuit;
        this.nombre=nombre;
        this.telefono=telefono;
        this.mail=mail;
        this.muerte=muerte;
        this.muerteAccidental=muerteAccidental;
        this.internacion=internacion;
        this.internacionDias=internacionDias;
        this.paralisis=paralisis;
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

    public String getHeladera() {
        return heladera;
    }

    public String getLavarropas() {
        return lavarropas;
    }

    public String getCocina() {
        return cocina;
    }

    public String getNotebook() {
        return notebook;
    }

    public String getNotebookCantidad() {
        return notebookCantidad;
    }

    public String getConsola() {
        return consola;
    }

    public String getTelevisor() {
        return televisor;
    }

    public String getTelevisorCantidad() {
        return televisorCantidad;
    }

    public String getMuerte() {
        return muerte;
    }

    public String getMuerteAccidental() {
        return muerteAccidental;
    }

    public String getInternacion() {
        return internacion;
    }

    public String getInternacionDias() {
        return internacionDias;
    }

    public String getParalisis() {
        return paralisis;
    }
    
}
