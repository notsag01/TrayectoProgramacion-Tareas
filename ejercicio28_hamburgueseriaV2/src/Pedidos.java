
import java.util.ArrayList;


public class Pedidos {
    public String nombre;
    public String telefono;
    public String hamburguesa;
    public String papas, gaseosa;
    public ArrayList<String> condimentos;
    
    public Pedidos(String nombre, String telefono, String hamburguesa, String papas,String gaseosa, ArrayList<String> condimentos){
        this.nombre=nombre;
        this.telefono=telefono;
        this.hamburguesa= hamburguesa;
        this.papas= papas;
        this.gaseosa=gaseosa;
        this.condimentos=condimentos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getHamburguesa() {
        return hamburguesa;
    }

    public String getPapas() {
        return papas;
    }

    public String getGaseosa() {
        return gaseosa;
    }

    public ArrayList<String> getCondimentos() {
        return condimentos;
    }
    
    public void imprimir(){
        System.out.println(this.nombre + " " + this.telefono);
    }
    
    
    

}
