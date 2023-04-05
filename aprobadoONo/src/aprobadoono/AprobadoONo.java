
package aprobadoono;


public class AprobadoONo {

    
    public static void main(String[] args) {
       //VARIABLES
       String nombre = "Gastón";
       String apellido = "Córdoba";
       int nota = 4;
       
       if(nota >=6){
           System.out.println("Felicitaciones " + nombre + apellido + " tu nota es de "
           + nota + ". Has aprobado");
       }else{
           System.out.println("Lo lamento," + nombre + apellido + ". Tu nota fue de "
           + nota + ". No has aprobado ");
       }
    }
    
}
