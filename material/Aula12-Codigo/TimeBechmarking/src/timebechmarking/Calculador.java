/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timebechmarking;

import java.util.Random;
/**
 *
 * @author Bart
 */
public class Calculador extends Thread{
    private long nCalculations;
    private int iId;
    Random r;
    public Calculador(long iNCalculations, int iAId){
        nCalculations = iNCalculations;
        iId = iAId;
        r = new Random();
    }
    
    public void run(){
        for(long i = 0; i < nCalculations; i++){
            /*Atenção: não usar Math.random() ou qualquer outro método statico e sincronizado
              do contrário, não se terá paralelismo, apenas overhead de threads
              (http://www.particleincell.com/blog/2011/java-multithreading/)*/
            Math.sqrt(r.nextDouble()*1000);
        }
        System.out.println("Thread " + iId + " terminada.");
    }
}
