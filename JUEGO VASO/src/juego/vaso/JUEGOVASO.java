
package juego.vaso;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class JUEGOVASO {

   
    public static void main(String[] args) {
        
//        //VARIABLES ***
//        Random RD= new Random();
//        int pelotita=RD.nextInt(3);
//        
//        ImageIcon Icono= new ImageIcon("src/imagenes/juego.png");
//        ImageIcon Bien= new ImageIcon("src/imagenes/bien.png");
//        ImageIcon Mal= new ImageIcon("src/imagenes/mal.png");
//        
//        int seleccion=JOptionPane.showOptionDialog(null,
//                "Encuentra la pelotita en los vasos!",
//                "Juego del Vaso",
//                JOptionPane.YES_NO_CANCEL_OPTION,
//                JOptionPane.INFORMATION_MESSAGE,Icono,
//                new Object[]{"VASO 1", "VASO 2","VASO 3"}, "VASO1");
//        
//        if(pelotita == seleccion){
//             JOptionPane.showMessageDialog(null,"MUY BIEN","Juego del Vaso",JOptionPane.INFORMATION_MESSAGE,Bien);
//        }else{
//             JOptionPane.showMessageDialog(null,"MUY MAL","Juego del Vaso",JOptionPane.INFORMATION_MESSAGE,Mal);        
//        }
        
        
        
        //VARIABLES ***
        Random RD = new Random();
        int pelotita = RD.nextInt(3);
        String jugadores[]= new String[2];
        int jugadasJugador1[]= new int[3];        
        int jugadasJugador2[]= new int[3];        
        int contadorVueltas=3;
        int contadorPuntosJ1=0;
        int contadorPuntosJ2=0;

        ImageIcon Icono = new ImageIcon("src/imagenes/juego.png");
        ImageIcon Bien = new ImageIcon("src/imagenes/bien.png");
        ImageIcon Mal = new ImageIcon("src/imagenes/mal.png");
        
        JOptionPane.showMessageDialog(null, "Bienvenidos al JUEGO DEL VASO", "BIENVENIDA", JOptionPane.INFORMATION_MESSAGE , Icono);
        int modo = JOptionPane.showOptionDialog(null, "Eligue una opcione", "El juego del Vaso",
                                     JOptionPane.YES_NO_CANCEL_OPTION,
                                     JOptionPane.INFORMATION_MESSAGE, Icono,
                                     new Object[]{"COMPUTADORA", "MULTIJUGADOR"}, "COMPUTADORA");
        
        if(modo == 0){
            jugadores[0]= JOptionPane.showInputDialog(null,"JUGADOR Nª1","Juego del Vaso",JOptionPane.QUESTION_MESSAGE).toUpperCase();
            
            for(int i=0; i<contadorVueltas; i++ ){
                   //JUGAS DEL JUGADOR 1 ----------------------------------
                int seleccionJ1 = JOptionPane.showOptionDialog(null,
                        jugadores[0] + ", \n encuentra la pelotita en los vasos!",
                        "JUGADOR 1",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE, Icono,
                        new Object[]{"VASO 1", "VASO 2", "VASO 3"}, "VASO1");                
                    jugadasJugador1[i]=seleccionJ1;            

                    //ACIERTOS JUGADOR 1
                    if(pelotita == seleccionJ1){
                        JOptionPane.showMessageDialog(null, "Excelente!\n Punto para vos!", "Juego del Vaso", JOptionPane.INFORMATION_MESSAGE, Bien);
                        contadorPuntosJ1++;
                    }else{
                        JOptionPane.showMessageDialog(null, "Mal!", "Juego del Vaso", JOptionPane.INFORMATION_MESSAGE, Mal);              
                    }
                    
                    //MOSTRAMOS LOS PUNTOS
            }
                    JOptionPane.showMessageDialog(null, "REUSLTADO FINAL \n"
                        + jugadores[0] + ": " + contadorPuntosJ1 + "\n" 
                        , "Juego del Vaso", JOptionPane.INFORMATION_MESSAGE, Icono);    
                    
                    switch(contadorPuntosJ1){
                        case 0: JOptionPane.showMessageDialog(null, "Un desastre! Dedicate a otra cosa.", "Has sido Humillado", pelotita, Icono);
                        break;
                        case 1: JOptionPane.showMessageDialog(null, "Todavía te falta mucha sopa.", "Has Perdido", pelotita, Icono);
                        break;
                        case 2: JOptionPane.showMessageDialog(null, "Casi Casi.", "Te mereces la revancha", pelotita, Icono);
                        break;
                        case 3: JOptionPane.showMessageDialog(null, "He sido derrotado ante el mejor.", "Eres el messio del Juego del Vaso", pelotita, Icono);
                        break;
                    }
           
        }else{        
            
            //*******************   MODO MULTIJUGADOR  ****************************************************************************************************************
            
            jugadores[0]= JOptionPane.showInputDialog(null,"JUGADOR Nª1","Juego del Vaso",JOptionPane.QUESTION_MESSAGE).toUpperCase();
            jugadores[1]= JOptionPane.showInputDialog(null,"JUGADOR Nª2","Juego del Vaso",JOptionPane.QUESTION_MESSAGE).toUpperCase();

            JOptionPane.showMessageDialog(null, "JUGUEMOS!", "Juego del Vaso", JOptionPane.INFORMATION_MESSAGE, Icono);

            for(int i=0; i<contadorVueltas; i++ ){

                //JUGAS DEL JUGADOR 1 ----------------------------------
            int seleccionJ1 = JOptionPane.showOptionDialog(null,
                    jugadores[0] + ", \n encuentra la pelotita en los vasos!",
                    "JUGADOR 1",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, Icono,
                    new Object[]{"VASO 1", "VASO 2", "VASO 3"}, "VASO1");                
                jugadasJugador1[i]=seleccionJ1;            

                //ACIERTOS JUGADOR 1
                if(pelotita == seleccionJ1){
                    contadorPuntosJ1++;
                }

                //JUGAS DEL JUGADOR 2 --------------------------------------
            int seleccionJ2 = JOptionPane.showOptionDialog(null,
                    jugadores[1] + ", \n encuentra la pelotita en los vasos!",
                    "JUGADOR 2",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, Icono,
                    new Object[]{"VASO 1", "VASO 2", "VASO 3"}, "VASO1");                
                jugadasJugador2[i]=seleccionJ2;   

                //ACIERTOS JUGADOR 2
                if(pelotita == seleccionJ2){
                    contadorPuntosJ2++;
                }

                //NOS FIJAMOS QUIÉN ACERTÓ Y LO MOSTRAMOS POR PANTALLA
                if(pelotita== seleccionJ1 && pelotita==seleccionJ2){
                    JOptionPane.showMessageDialog(null, "Felicitaciones! \n Ambos han Acertado! \n Punto para los dos", "Juego del Vaso",
                            JOptionPane.INFORMATION_MESSAGE, Bien);
                }else if(pelotita== seleccionJ1 && (pelotita <seleccionJ2|| pelotita>seleccionJ2)){
                    JOptionPane.showMessageDialog(null, "Felicitaciones!" + jugadores[0] +  "\n Has Acertado! \n Punto para " + jugadores[0] , "Juego del Vaso",
                            JOptionPane.INFORMATION_MESSAGE, Bien);
                    JOptionPane.showMessageDialog(null, "MUY MAL" + jugadores[1], "Juego del Vaso", JOptionPane.INFORMATION_MESSAGE, Mal);
                }else if(pelotita== seleccionJ2 && (pelotita <seleccionJ1|| pelotita>seleccionJ1)){
                    JOptionPane.showMessageDialog(null, "Felicitaciones!" + jugadores[1] +  "\n Has Acertado! \n Punto para " + jugadores[1] , "Juego del Vaso",
                            JOptionPane.INFORMATION_MESSAGE, Bien);
                    JOptionPane.showMessageDialog(null, "MUY MAL" + jugadores[0], "Juego del Vaso", JOptionPane.INFORMATION_MESSAGE, Mal);
                }else{
                    JOptionPane.showMessageDialog(null, "Muy mal los dos! \n Si siguen así, les sacaré puntos a ambos", "Juego del Vaso",
                            JOptionPane.INFORMATION_MESSAGE, Mal);
                    }            
               }   

            //MOSTRAMOS LOS PUNTOS
            JOptionPane.showMessageDialog(null, "REUSLTADO FINAL \n"
                    + jugadores[0] + ": " + contadorPuntosJ1 + "\n" 
                    + jugadores[1] + ": " + contadorPuntosJ2 + "\n"
                    , "Juego del Vaso", JOptionPane.INFORMATION_MESSAGE, Icono);

            //NOS FIJAMOS QUIÉN GANÓ. CONTAMOS LOS PUNTOS.
            if(contadorPuntosJ1 > contadorPuntosJ2){
                JOptionPane.showMessageDialog(null, "FELICITCIONES, "+ jugadores[0] + "\n Has Ganado!",
                        "Juego del Vaso",
                        JOptionPane.INFORMATION_MESSAGE, Icono);
            }else if(contadorPuntosJ1 < contadorPuntosJ2){
                JOptionPane.showMessageDialog(null, "FELICITCIONES, " + jugadores[1] + "\n Has Ganado!",
                        "Juego del Vaso",
                        JOptionPane.INFORMATION_MESSAGE, Icono);                
            }else{
                JOptionPane.showMessageDialog(null, "Qué triste EMPATE",
                        "Juego del Vaso",
                        JOptionPane.INFORMATION_MESSAGE, Icono);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
    }
}