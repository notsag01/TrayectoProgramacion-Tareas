
package Libreria;

import java.util.Timer;
import java.util.TimerTask;

public class Funciones {
    Timer timer = new Timer();
    private int kilos =0 , llenadoCompleto= 0,ropaColor = 0,LavadoCompleto = 0,SecadoCompleto =0;
   
    //contrustor 
    public Funciones (int kilos,int ropaColor){
        this.kilos = kilos;
        this.ropaColor = ropaColor;
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
    private void lavado(){
        llenado();
            if (llenadoCompleto == 1){
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
            TimerTask task =  new TimerTask(){
                @Override
                public void run(){
                    System.out.println("Tu ropa esta lista para usar");
                    timer.cancel();
                }
            };
            timer.schedule(task, 4000);
        }
              
    
    }
    
    
    
}
