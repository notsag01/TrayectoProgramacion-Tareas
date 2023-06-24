
package ejercicio14m2.polimorfismo;


public class Ejercicio14m2Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculos vehiculo=new Coche();
        int vehiculoSeleccionado = vehiculo.elegirVehiculo();
        
        switch (vehiculoSeleccionado){
            case 0 : vehiculo.estacionar();
            break;
            case 1: vehiculo.estacionar();
        }
        
        
        
        
    }
    
}
