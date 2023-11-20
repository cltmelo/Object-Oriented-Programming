/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

/**
 *
 * @author Junio
 */
public class HelloThread extends Thread {

    private String sNomeDaThread;

    public HelloThread(String sNome) {
        sNomeDaThread = sNome;
    }

    public void run() {
        Random r = new Random();
        int i;
        try {
            i = r.nextInt(3000);
            System.out.println(sNomeDaThread + ": Vou dormir por " + i + " milissegundos");
            Thread.sleep(i);
            System.out.println("- Hello from thread " + sNomeDaThread);

        } catch (InterruptedException ex) {

            System.out.println("Erro " + ex.getMessage());
        }
    }
}
