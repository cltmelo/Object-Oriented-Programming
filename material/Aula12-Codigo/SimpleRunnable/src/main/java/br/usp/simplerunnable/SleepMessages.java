package br.usp.simplerunnable;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junio
 */
public class SleepMessages extends Thread{
    int iMessages;
    String[] importantInfo;
    SleepMessages(){
        iMessages = 0;
        importantInfo = new String[4];
        importantInfo[0] = "Hoje é segunda-feira";
        importantInfo[1] = "O dia está claro";
        importantInfo[2] = "O jogo de futebol comeca as 21:00";
        importantInfo[3] = "Qual filme vai passar hoje?";
                
    }
    public void run(){

        long lInterval;
        for (int i = 0; i < importantInfo.length; i++) {
            try {
                lInterval = (long) (new Random().nextInt(3000));
                System.out.println("Espera de " + lInterval + " ms");
                Thread.sleep(lInterval);
            } catch (InterruptedException ex) {
                Logger.getLogger(SleepMessages.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Print a message
            System.out.println(importantInfo[i]);
            iMessages++;
        }
    }
}
