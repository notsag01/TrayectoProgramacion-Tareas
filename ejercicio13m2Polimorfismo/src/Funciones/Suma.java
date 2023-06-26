
package Funciones;

public class Suma extends Funciones {

    @Override
    public void operar() {
        resultado =  num1 + num2;
    }

    @Override
    public void imprimir() {
        System.out.println("El resultado de la suma es: " + resultado);
    }

}
