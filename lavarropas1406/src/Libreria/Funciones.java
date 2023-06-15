
package Libreria;

import java.util.Timer;
import java.util.TimerTask;

public class Funciones {
    Timer timer = new Timer();
    private int kilos =0 , llenadoCompleto= 0,tipoDeRopaOk=0, ropaColor = 0,LavadoCompleto = 0,SecadoCompleto =0;
    private String tipoLavado="";
   
    //contrustor 
    public Funciones (int kilos,int ropaColor, String tipoLavado){
        this.kilos = kilos;
        this.ropaColor = ropaColor;
        this.tipoLavado = tipoLavado;
    }
    
    //metodos
    private void llenado(){                
        if(kilos <= 12 ){
            llenadoCompleto = 1;
            System.out.println("Llenado......");
            System.out.println("Llenado Completo");                             
        } else {
            System.out.println("La carga para este modelo es mucha, saque ropa por favor");
        }        
    }
    private void tipoDeRopa(){
        llenado();
        if(llenadoCompleto==1){
            switch(tipoLavado){
                case "LANA" : System.out.println("LANA");
                break;
                case "ROPA SUCIA" : System.out.println("ROPA SUCIA");
                break;
                case "ECONOMICO" : System.out.println("ECONOMICO");
                break;
                case "BEBE" : System.out.println("BEBE");
                break;
            }
        }
        tipoDeRopaOk=1;
    }
    private void lavado(){
        tipoDeRopa();
            if (tipoDeRopaOk == 1){
                if(ropaColor == 0){
                    System.out.println("Ropa Blanca - Lavado SUAVE ");
                    System.out.println("Lavando.....");
                    LavadoCompleto = 1;
                } else if (ropaColor == 1 ) {
                    System.out.println("Ropa Color - Lavado Intenso ");
                    System.out.println("Lavando....");
                    LavadoCompleto = 1;
                }
        }
    }
        
    private void secado(){
        lavado();
        if (LavadoCompleto == 1){
            System.out.println("Secando.....");
            System.out.println("SECO");
            SecadoCompleto = 1;       
        }
        
    
    }
    public void ciclofinalizado(){
        secado();
        if (SecadoCompleto ==1) {
            TimerTask faseFinal =  new TimerTask(){
                @Override
                public void run(){
                    System.out.println("Tu ropa esta lista para usar");
                    timer.cancel();
                }
            };
            timer.schedule(faseFinal, 4000);
        }
              
    
    }
    
    
    
}
