/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timebechmarking;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bart
 */
public class TimeBechmarking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long startTime = 0;
        try {
            /*Carga: computar a raiz quadrada de 1.000.000.000 números aleatórios*/
            long iTotalDeCalculos = 1000000000;
            
            
            int nCores = 4;//Runtime.getRuntime().availableProcessors();
            System.out.println("Você tem " + nCores + " núcleos: ");
            //nCores = 1;
            Calculador[] cs = new Calculador[nCores];
            startTime = System.currentTimeMillis();
            for (int i = 0; i < nCores; i++) {
                /*Cada core recebe uma fatia igual da carga*/
                cs[i] = new Calculador(iTotalDeCalculos / nCores, i);
                cs[i].start();
            }

            for (int i = 0; i < nCores; i++) {
                cs[i].join();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(TimeBechmarking.class.getName()).log(Level.SEVERE, null, ex);
        }

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println(estimatedTime / 1000 + " segundo");
    }

}
