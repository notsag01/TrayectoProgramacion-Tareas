
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
        


        // IMAGENES  *******************************************************
        ImageIcon Fiat= new ImageIcon("src/imagen/fiat.png");
        ImageIcon Nissan= new ImageIcon("src/imagen/nissan.png");
        ImageIcon Renault= new ImageIcon("src/imagen/renault.png");
        ImageIcon Chevrolet= new ImageIcon("src/imagen/chevrolet.png");
        ImageIcon Toyota= new ImageIcon("src/imagen/toyota.png");
        ImageIcon Ford= new ImageIcon("src/imagen/ford.png");
        ImageIcon Peugeot= new ImageIcon("src/imagen/peugeot.png");
        ImageIcon portada = new ImageIcon ("src/imagen/portada.png");
        ImageIcon data = new ImageIcon ("src/imagen/agenda.png");
        ImageIcon eleccion = new ImageIcon ("src/imagen/eleccion.png");

        //Variables a usar en JOption
        String nombre = "";
        String tel = "";
        String mail = "";
        String dominio = "";
        int antiguedad = 0;    
              
        int cargoantiguedad =0;
        String antiguedadIngresada ="";
        
        JOptionPane.showMessageDialog(null,
                "BIENVENIDO!",
                "ASEGURADORA PARQUE PATRICIOS",
                JOptionPane.INFORMATION_MESSAGE,
                portada);
              
        //Pido los datos 
        nombre = (String) JOptionPane.showInputDialog(null,
                "Ingresa tu Nombre y apellido: ",
                "CARGA DE DATOS",
                JOptionPane.QUESTION_MESSAGE,
                data,
                null,
                "");
        tel = (String) JOptionPane.showInputDialog(null,
                "Ingresa tu telefono: ",
                "CARGA DE DATOS",
                JOptionPane.QUESTION_MESSAGE,
                        data,
                null,
                "");
        mail = (String) JOptionPane.showInputDialog(null,
                "Ingresa tu E-Mail: ",
                "CARGA DE DATOS",
                JOptionPane.QUESTION_MESSAGE,
                data,
                null,
                "");
        
        Object listaMarcas []= {"FIAT", "NISSAN", "RENAULT", "CHEVROLET", "TOYOTA", "FORD", "PEUGEOT"};
        Object marca=JOptionPane.showInputDialog(null, "Seleccione una MARCA", "MARCAS", JOptionPane.QUESTION_MESSAGE, eleccion, listaMarcas, listaMarcas[0]);
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
                Object modelo =JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, Nissan, modelosNissan, modelosNissan[0]);
        }else if(marca.equals("RENAULT")){
                Object modelo =JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, Renault, modelosRenault, modelosRenault[0]);
        }else if(marca.equals("CHEVROLET")){
                Object modelo =JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, Chevrolet, modelosChevrolet, modelosChevrolet[0]);    
        }else if(marca.equals("TOYOTA")){
                Object modelo =JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, Toyota, modelosToyota, modelosToyota[0]);        
        }else if(marca.equals("FORD")){
                Object modelo =JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, Ford, modelosFord, modelosFord[0]);    
        }else if(marca.equals("PEUGEOT")){
                Object modelo =JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, Peugeot, modelosPeugeot, modelosPeugeot[0]);        
        }

         dominio = (String) JOptionPane.showInputDialog(null,
                "Ingresa tu DOMINIO",
                "DOMINIO",
                JOptionPane.QUESTION_MESSAGE,
                data,
                null,
                "");

           antiguedadIngresada = (String) JOptionPane.showInputDialog(null, //uso int para que podamos correr bien la logica 
           "Ingrese ANTIGÜEDAD del Vehiculo \n Por favor ingrese solo números",
           "ANTIGÜEDAD",
           JOptionPane.QUESTION_MESSAGE,
           null,
           null,
           "");
        
        System.out.println(marca  + nombre + dominio + antiguedad); // esto se  deberia eliminar 

 
    
     antiguedad = Integer.parseInt(antiguedadIngresada);

    if (antiguedad <= 5 ){
            cargoantiguedad = 500;
    }else if (antiguedad < 10){
            cargoantiguedad =1000;    
     }else if (antiguedad <= 15){
            cargoantiguedad = 1500;
    }else if (antiguedad <= 20){
            cargoantiguedad = 2000;}
    else {
            JOptionPane.showMessageDialog(null, "Lamentamos informar que no podremos asegurar su vehículo", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    JOptionPane.showMessageDialog(null,
                cargoantiguedad + "$$ ",
                "CARGA DE DATOS",
                JOptionPane.QUESTION_MESSAGE);
        
    
    Object coberturas [] = {"Tercero completo","Todo riesgo","Responsabilidad civil"};
    
    String coberturaElegida;
        coberturaElegida = (String) JOptionPane.showInputDialog(null,
                "Selecciona una opcion",
                "Tipos de cobertura disponibles",
                JOptionPane.QUESTION_MESSAGE,
                null,
                coberturas,
                coberturas [0]);
        
        
        
    Object adicionales[] = {"Granizo", "Llantas deportivas", "Asistencia mecanica", "Localizador GPS", "Ninguna"};
    Object adicionalElegido[] = new String[adicionales.length];
    int contador = 0;
    int cargoAdicionales = 0;

                for (int i = 0; i < adicionales.length; i++) {
                        if (contador % 2 == 0) {
                            cargoAdicionales += 300;}

                    adicionalElegido[i] = (String) JOptionPane.showInputDialog(null,
                                "Seleccionar adicionales",
                                "ADICIONALES",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                adicionales,
                                adicionales[0]);

                                        if (adicionalElegido[i].equals("Ninguna")) {
                                          break;}

    contador++;
}










    }
    
}
