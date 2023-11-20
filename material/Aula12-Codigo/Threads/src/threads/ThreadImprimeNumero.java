/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.Random;

/**
 *
 * @author Junio
 */
public class ThreadImprimeNumero extends Thread {

    String sNome;

    ThreadImprimeNumero(String sANome) {
        sNome = sANome;
    }

    public void run() {
        try {
            while (true) {
                int lInterval = new Random().nextInt(1000);
                int iNumeroMax = new Random().nextInt(1000);
                int iSomatorio = 0;
                for(int i =1; i <= iNumeroMax; i++)
                  iSomatorio += i;
                System.out.println(sNome + ": - O somatório de 1 a " + iNumeroMax + " é igual a " + iSomatorio);                
                Thread.sleep(lInterval);
                //System.out.println(sNome + "- DORMIU POR " + lInterval/1000f + "s");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + sNome + " interrompida.");
        }
    }
}