
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Enviar {
    private Pedidos pedido;
    
    public Enviar(Pedidos pedido){
        this.pedido = pedido;
    }
    

        public void guardar(){
            
        try {
            BufferedWriter escribir = new BufferedWriter(new FileWriter("Archivo.txt",true));
            escribir.write(pedido.getNombre() + "," 
                        + pedido.getTelefono() + "," 
                        + pedido.getHamburguesa() + "," 
                        + pedido.getPapas() + "," 
                        + pedido.getGaseosa() + "," 
                        + pedido.getCondimentos() );
            escribir.newLine();
            escribir.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        }
}
