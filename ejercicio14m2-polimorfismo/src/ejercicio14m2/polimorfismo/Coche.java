
package ejercicio14m2.polimorfismo;


public class Coche extends Vehiculos {

    @Override
    public void estacionar() {
        //System.out.println("Say hello");
        System.out.println("**** INSTRUCCIONES PARA ESTACIONAR UN AUTO ****");
        System.out.println("**** Encuentre un espacio de estacionanamient adecuado");
        System.out.println("**** Señalice su intencion   ******************************");
        System.out.println("**** Detén el auto en paralelo del auto que esté delante del espacio de estacionamiento.");
        System.out.println("**** Gira el volante completamente hacia el lado derencho.");
        System.out.println("**** Retrocede lentamente.");
        System.out.println("**** Endereza el volante cuando el espejo lateral derencho esté alineado con el extrmo trasero del auto adelante.");
        System.out.println("**** Gira el volante completamente hacia la izquierda.");
        System.out.println("**** Continua retrocediendo.");
        System.out.println("**** Deten el auto.");
    }
    
}
