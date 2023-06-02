
package seguro.automotor;

import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;

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
        ImageIcon portadaGrande = new ImageIcon("src/imagen/portadagrande.png");
        ImageIcon costado = new ImageIcon("src/imagen/costado.png");
        ImageIcon pregunta = new ImageIcon("src/imagen/pregunta.png");
        ImageIcon error = new ImageIcon("src/imagen/error.png");
        
                //Creamos un random para el numero de poliza 
        Random random = new Random ();
        int poliza = random.nextInt(9999);
              
               //Variables a usar en JOption
        String nombre = "";
        String tel = "";
        String mail = "";
        String dominio = "";
        int checkNombre= 0;
        int checkTel = 0;
        int checkMail= 0;
        int checkDominio=0;
        int checkAntiguedad=0;
        String modelo="";
        
                //Variables para los calculos
        int antiguedad = 0;                  
        int cargoantiguedad =0;
        String antiguedadIngresada ="";
        String coberturaElegida="";
        int totalPoliza=0;
        
                //VARIALES DE LOS ADICIONALES
        int cantidadAdicionales = 0;
        int cargoAdicionales = 0;
        boolean nuevoAdicional= true;
        
        JOptionPane.showMessageDialog(null,
                "BIENVENIDO!",
                "ASEGURADORA PARQUE PATRICIOS",
                JOptionPane.INFORMATION_MESSAGE,
                portada);
              
        //Pido los datos 
        do{
            nombre = (String) JOptionPane.showInputDialog(null,
                    "Ingresa tu nombre y apellido: ",
                    "CARGA DE DATOS",
                    JOptionPane.QUESTION_MESSAGE,
                    data,
                    null,
                    "");
                if(nombre.equals("")){
                    JOptionPane.showMessageDialog(null, "El nombre es obligatorio", "ERROR", JOptionPane.ERROR_MESSAGE, error);
                }else{
                    checkNombre = 1;
                }
        }while(checkNombre == 0);//Si no ingresan un dato, el bucle vuelve a comenzar
        
        do{
            tel = (String) JOptionPane.showInputDialog(null,
                    "Ingresa tu teléfono: ",
                    "CARGA DE DATOS",
                    JOptionPane.QUESTION_MESSAGE,
                    data,
                    null,
                    "");
            if(tel.equals("")){
                    JOptionPane.showMessageDialog(null, "El telefono es obligatorio", "ERROR", JOptionPane.ERROR_MESSAGE,error);
                }else{
                    checkTel = 1;
                }
        }while(checkTel == 0);
        
        while(checkMail == 0){
            mail = (String) JOptionPane.showInputDialog(null,
                    "Ingresa tu E-Mail: ",
                    "CARGA DE DATOS",
                    JOptionPane.QUESTION_MESSAGE,
                    data,
                    null,
                    "");
            if(mail.equals("")){
                JOptionPane.showMessageDialog(null, "El E-Mail es obligatorio", "ERROR", JOptionPane.ERROR_MESSAGE, error);
            }else{
                checkMail = 1;
            }
        }
        //Mediante vectores cargamos las marcas y modelos de autos 
        String listaMarcas []= {"FIAT", "NISSAN", "RENAULT", "CHEVROLET", "TOYOTA", "FORD", "PEUGEOT"};
        Object marca=JOptionPane.showInputDialog(null, "Seleccione una MARCA", "MARCAS", JOptionPane.QUESTION_MESSAGE, eleccion, listaMarcas, listaMarcas[0]);
        
        String modelosFiat []= {"PULSE", "CRONOS", "TORO", "UNO", "500", "STRADA", "FIORINO"};
        String modelosNissan []= {"KICKS", "VERSA", "MARCH", "NOTE", "MURANO", "X-TRAIL", "LEAF"};
        String modelosRenault []= {"SANDERO", "LOGAN", "KANGOO", "KWID", "STEPWEY", "ALASKAN", "DUSTER"};
        String modelosChevrolet []= {"CRUEZE", "ONIX", "TRACKER", "S10", "SPIN", "PRISMA", "COBALT"};
        String modelosToyota []= {"HILUX", "COROLLA", "COROLLA CROSS", "ETIOS", "SW4", "PRIUS", "INNOVA"};
        String modelosFord []= {"RANGER", "ECOSPORT", "KA", "FIESTA", "FOCUS", "MONDEO", "MUSTANG"};
        String modelosPeugeot []= {"208", "207", "308", "408", "PARTNER", "PATAGONIC", "EXPERT"};

        
        //Con IF mostramos un combobox con los modelos disponibles de cada marca 
        if (marca.equals("FIAT")){
                 modelo =(String) JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, Fiat, modelosFiat, modelosFiat[0]);
        }else if(marca.equals("NISSAN")){
                 modelo = (String) JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, Nissan, modelosNissan, modelosNissan[0]);
        }else if(marca.equals("RENAULT")){
                  modelo = (String) JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, Renault, modelosRenault, modelosRenault[0]);
        }else if(marca.equals("CHEVROLET")){
                  modelo = (String) JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, Chevrolet, modelosChevrolet, modelosChevrolet[0]);    
        }else if(marca.equals("TOYOTA")){
                  modelo = (String) JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, Toyota, modelosToyota, modelosToyota[0]);        
        }else if(marca.equals("FORD")){
                  modelo = (String) JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, Ford, modelosFord, modelosFord[0]);    
        }else if(marca.equals("PEUGEOT")){
                  modelo = (String) JOptionPane.showInputDialog(null, "Seleccione un MODELO", "MODELO", JOptionPane.QUESTION_MESSAGE, Peugeot, modelosPeugeot, modelosPeugeot[0]);   }     
        
                  
        do{
         dominio = (String) JOptionPane.showInputDialog(null,
                "Ingresa tu DOMINIO",
                "DOMINIO",
                JOptionPane.QUESTION_MESSAGE,
                data,
                null,
                "");
            if(dominio.equals("")){
                JOptionPane.showMessageDialog(null, "El Dominio es obligatorio", "ERROR", JOptionPane.ERROR_MESSAGE,error);
            }else{
                checkDominio=1;
            }            
        }while(checkDominio == 0);
        
        
        antiguedadIngresada = (String) JOptionPane.showInputDialog(null,
        "Ingrese ANTIGÜEDAD del Vehiculo \n Por favor ingrese solo números",
        "ANTIGÜEDAD",
        JOptionPane.QUESTION_MESSAGE,
        pregunta,
        null,
        "");

        System.out.println(marca  + nombre + dominio + antiguedad); // testigo******************************************
        //como la antigüedad ingresada es del tipo String, debemos convertirlo a int para poder hacer correr la logica
        antiguedad = Integer.parseInt(antiguedadIngresada);
        
       if(antiguedad > 20){
            JOptionPane.showMessageDialog(null,
        "Lamentamos informar que no podremos asegurar su vehículo\n" +
        "\nNombre y Apellido: " + nombre + "\n" +
        "Teléfono: " + tel + "\n" +
        "Mail: " + mail + "\n\n" +
        "Verifique que los datos son correctos \ny lo llamaremos cuando tengamos una propuesta para usted.\n\n" +
        "Gracias por confiar en nosotros!",
        "Error",
        JOptionPane.ERROR_MESSAGE,
        error);
       }else{
           //Con la variante TOTALPOLIZA ahorramos tener tantas variantes 
            if  (antiguedad <= 5 ){
                    totalPoliza = 500;
                    System.out.println(totalPoliza);//TESTIGO ******************************
            }else if (antiguedad < 10){
                    totalPoliza =1000;    
             }else if (antiguedad <= 15){
                    totalPoliza = 1500;
            }else if (antiguedad <= 20){
                    totalPoliza = 2000;}

            //TIPO DE COBERTURA ***
           Object coberturas [] = {"Tercero completo","Todo riesgo","Responsabilidad civil"};
           
           JOptionPane.showMessageDialog(null, "Tercero completo: $2000 \n Todo riesgo : $3000\n Responsabilidad civil : $1000",
                   "PRECIOS COBERTURAS", JOptionPane.INFORMATION_MESSAGE, eleccion);
           coberturaElegida = (String) JOptionPane.showInputDialog(null,
                        "Selecciona una opcion",
                        "Tipos de cobertura disponibles",
                        JOptionPane.QUESTION_MESSAGE,
                        pregunta,
                        coberturas,
                        coberturas [0]);
           
           if(coberturaElegida.equals("Tercero completo")){
               totalPoliza += 2000;
           }else if(coberturaElegida.equals("Todo riesgo")){
               totalPoliza += 3000;
           }else if(coberturaElegida.equals("Responsabilidad civil")){
               totalPoliza += 1000;               
           }
           
           // ADICIONALES ***
            String adicionales[] = {"Granizo", "Llantas deportivas", "Asistencia mecanica", "Localizador GPS", "Ninguna"};
            //Usamos un arreglo dinámico, es una estructura de datos que permite cambiar su tamaño durante la ejecución del programa.
              ArrayList<String> adicionalElegido = new ArrayList<String>();   
              
            JOptionPane.showMessageDialog(null, " • Granizo \n • Llantas Deportivas \n • Asistencia Mecánica \n • Localizador GPS ",
                   "SERVICIOS ADICIONALES", JOptionPane.INFORMATION_MESSAGE, data);  
            JOptionPane.showMessageDialog(null, " *Cada adicional cuesta $300, \n pero si elige 2, \n el segundo ES GRATIS!",
                   "SERVICIOS ADICIONALES", JOptionPane.INFORMATION_MESSAGE, data);  
            
            while(nuevoAdicional== true){    
                String adicional= (String) JOptionPane.showInputDialog(null,
                               "Seleccionar adicionales",
                               "ADICIONALES",
                               JOptionPane.QUESTION_MESSAGE,
                               eleccion,
                               adicionales,
                               adicionales[0]);
                //para agregar elementos a ArrayList, se usa el método add 
                adicionalElegido.add(adicional);
               System.out.println(adicionalElegido);//TESTIGO**************************
               
               int agregarServicio = JOptionPane.showOptionDialog(null, "Quiere otro adicional?", 
                                    "ADICIONALES",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.INFORMATION_MESSAGE, eleccion,
                                    new Object[]{"AGREGAR", "NO, GRACIAS"}, "AGREGAR");                
               if(agregarServicio == 1){
                    nuevoAdicional=false;
               }                    
            }  //para contar la cantidad ACTUAL de elementos, se usa el metodo size  
            for(int i=0;i<adicionalElegido.size();i++){
                //para traer el contenido de cada elemento, se uda el metodo get
                System.out.println(adicionalElegido.get(i));//TESTIGO************************
                totalPoliza +=300;
                cantidadAdicionales +=1;
            }
                if( cantidadAdicionales % 2 == 0 && cantidadAdicionales % 4 == 0){
                    totalPoliza-=600;
                }else if(cantidadAdicionales % 2 == 0){
                    totalPoliza-=300;
                }
            System.out.println(totalPoliza); ///TESTIGO ********************************************
                    
            
            
            ///////
            //portada
              JOptionPane.showMessageDialog(null,
                "", "FELICIDADES",
                JOptionPane.INFORMATION_MESSAGE,
                portadaGrande);
         //creamos una variable que va a contener todo lo que mostraría la ventana     
        String mensaje = "DATOS DEL CLIENTE"
        + "\nNombre y Apellido: " + nombre
        + "\nTelefono: " + tel
        + "\nMail: " + mail
        + "\n"
        + "\nDATOS DEL VEHICULO"
        + "\nMarca: " + marca
        + "\nModelo: " +modelo
        + "\nDominio: " + dominio
        + "\nAntigüedad: " + antiguedad + " años"
        + "\n"
        + "\nCOBERTURA ELEGIDA: " + coberturaElegida
        + "\n"
        + "\nADICIONALES DE LA COBERTURA: \n";
              for (int i = 0; i < adicionalElegido.size(); i++) {
                  mensaje += adicionalElegido.get(i) + "\n";
              }
            //con mensaje+= podemos ir agregando mas informacion sin modificar  los datos ya cargados en la variante
               mensaje += "\nVALOR TOTAL DE LA PRIMA: $" + totalPoliza + "\nN° de Póliza: " +poliza;

   JOptionPane.showMessageDialog(null,
        mensaje,
        "Detalles de la póliza", 
        JOptionPane.INFORMATION_MESSAGE,
        costado);
            
            
       }/*
            No pude solucionar el tema de ingresar letras en la antigüedad,
       en realidad si encontre la forma pero con cosas que ni vimos y no daba meter mas cosas 
       que el resto de la clase no entienda
       
            meti icono a absolutamente todo, si tenes alguna sugerencia para cambiar avisame
            
            termine eliminando todos los objects de los modelos porque tiraba error en el final 
       
            meti machetazos explicando casi todo el codigo
       
            no colguemms en eliminar los testigos 
       
            cualquier cosa al celu, para mi ya quedó piola, faltaria el ultimo retoque del tema antigüedad 
       
           no se si tenias la misma idea para mostrar la poliza final, para mi asi quedo gracioso y equilibra bastante 
            
       */
       
        


    }
    
    }
