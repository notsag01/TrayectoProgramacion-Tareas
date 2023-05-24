
package seguro.automotor;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class SeguroAutomotor {


    public static void main(String[] args) {
//        CFP ASEGURA TU AUTO
//Se necesita un programa que permita la emisión de una póliza de seguro para un vehículo. Con las siguientes características:
//1) En la primera parte debe mostrar una JOption con el logo de la compañía
//2) Solicitar datos del cliente:
//a. Nombre y Apellido
//b. Teléfono
//c. EMAIL
//En este caso podemos utilizar variables para cada uno de los puntos y solicitarlo por JOPTION
//
//3) Datos del vehículo
//a. Marca, utilizar un JOption combobox a un vector
//b. Modelo , JOPtion input
//c. Dominio, JOPtion input
//d. Años de antigüedad, JOPtion input
//Luego que se solicita la antigüedad del automóvil se debe realizar el calculo para calcular la cuota. Este calculo se realiza de la siguiente manera:
//Si el vehículo es menor igual a 5 años pagara u extra de 500
//Si el vehículo es mayor a 5 años pero menor a 10 paga un extra de 1000
//Si el vehículo tiene una edad mayor igual a 10 pero menor a 15 paga 1500
//Si el vehículo tiene mas de 15 años y menor 20 paga 2000
//Si el vehículo es mayor a 20 años no se asegura (mostrar cartel antes de seguir avanzando)
//
//4) Tipo de Cobertura
//Utilizar un Joption combo con las opciones Terceros Completos, Todo Riesgo y Responsabilidad Civil
//
//Los valores de cada cobertura son:
//RC :1000
//TC:2000
//TR: 3000
//
//5) Adicionales de la cobertura
//Utilizar un Joption combo con las opciones:
//a. Granizo
//b. Llantas deportivas
//c. Asistencia Mecánica
//d. Localizador GPS
//
//Puede seleccionar mas de un adicional. Por cada dos que selecciona se cobra uno el valor de cada adicional es 300
//
//Cálculos del seguro: El cálculo de lo que el cliente va a abonar se calcula con:
//Valor de la cuota = Tipo de cobertura (valor) + Adicionales (valor)+ antigüedad del vehículo
//
//6) Impresión de póliza (opcional función)
//Mostrar en un joption o en consola como lo prefieran, los datos que deben mostrarse son:
//a. Datos del Usuario (datos cargados)
//b. Datos del Vehículo (datos cargados)
//c. Tipo de cobertura (detalle seleccionado)
//d. Adicionales de la cobertura (detalles seleccionado)
//e. Valor de la prima total


    

    ImageIcon Fiat= new ImageIcon("src/imagen/fiat.png");

    Object listaMarcas []= {"FIAT", "NISSAN", "RENAULT", "CHEVROLET", "TOYOTA", "FORD", "PEUGEOT"};
    Object marca=JOptionPane.showInputDialog(null, "Seleccione una MARCA", "MARCAS", JOptionPane.QUESTION_MESSAGE, null, listaMarcas, listaMarcas[0]);
    System.out.print(marca);
    Object modelosFiat []= {"PULSE", "CRONOS", "TORO", "UNO", "500", "STRADA", "FIORINO"};
    Object modelosNissan []= {"KICKS", "VERSA", "MARCH", "NOTE", "MURANO", "X-TRAIL", "LEAF"};
    Object modelosRenault []= {"SANDERO", "LOGAN", "KANGOO", "KWID", "STEPWEY", "ALASKAN", "DUSTER"};
    Object modelosChevrolet []= {"CRUEZE", "ONIX", "TRACKER", "S10", "SPIN", "PRISMA", "COBALT"};
    Object modelosToyota []= {"HILUX", "COROLLA", "COROLLA CROSS", "ETIOS", "SW4", "PRIUS", "INNOVA"};
    Object modelosFord []= {"RANGER", "ECOSPORT", "KA", "FIESTA", "FOCUS", "MONDEO", "MUSTANG"};
    Object modelosPeugeot []= {"208", "207", "308", "408", "PARTNER", "PATAGONIC", "EXPERT"};
    
    if (marca.equals("FIAT")){
            Object modelo =JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, Fiat, modelosFiat, modelosFiat[0]);
    }else if(marca.equals("NISSAN")){
            Object modelo =JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, null, modelosNissan, modelosNissan[0]);
    }else if(marca.equals("RENAULT")){
            Object modelo =JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, null, modelosRenault, modelosRenault[0]);
    }else if(marca.equals("CHEVROLET")){
            Object modelo =JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, null, modelosChevrolet, modelosChevrolet[0]);
    
    }else if(marca.equals("TOYOTA")){
            Object modelo =JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, null, modelosToyota, modelosToyota[0]);
        
    }else if(marca.equals("FORD")){
            Object modelo =JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, null, modelosFord, modelosFord[0]);
    
    }else if(marca.equals("PEUGEOT")){
            Object modelo =JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, null, modelosPeugeot, modelosPeugeot[0]);
        
    }














    }
    
}
