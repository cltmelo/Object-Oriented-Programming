package br.usp.threadsimple;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

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
            //Thread.sleep(i); /*Este comando apenas faz o processamento durar um pouco mais*/
            System.out.println("- Hello from thread " + sNomeDaThread);

        } catch (Exception ex) {

            System.out.println("Erro " + ex.getMessage());
        }
    }
}
