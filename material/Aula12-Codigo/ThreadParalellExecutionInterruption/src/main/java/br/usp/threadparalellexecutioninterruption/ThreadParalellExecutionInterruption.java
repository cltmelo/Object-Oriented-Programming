package br.usp.threadparalellexecutioninterruption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class ThreadParalellExecutionInterruption {

    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////////
        /*Exemplo de execução em paralelo com interrupção*/
        ThreadImprimeNumero t1 = new ThreadImprimeNumero("Primeira*********");
        ThreadImprimeNumero t2 = new ThreadImprimeNumero("Segunda----------");
        ThreadImprimeNumero t3 = new ThreadImprimeNumero("Teceira++++++++++");

        t1.start();
        t2.start();
        t3.start();
        try {
            BufferedReader LEITOR_ENTRADA_PADRAO = new BufferedReader(new InputStreamReader(System.in));
            String userInput;
            while (true) {
                userInput = LEITOR_ENTRADA_PADRAO.readLine();
                if (userInput.compareTo("BYE") == 0) {
                    break;
                }
                System.out.println("Voce digitou " + userInput);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        t1.interrupt();
        t2.interrupt();
        t3.interrupt();
        System.out.println("Threads interrompidas");
    }
}
