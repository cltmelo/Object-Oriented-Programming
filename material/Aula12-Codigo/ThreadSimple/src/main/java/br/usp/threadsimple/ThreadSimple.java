package br.usp.threadsimple;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class ThreadSimple {

    public static void main(String[] args) {//////////////////////////////////////////////////////////////////
        /*Exemplo de criação básica de threads*/
        System.out.println("Esta maquina possui " + Runtime.getRuntime().availableProcessors() + " nucleos de processamento.");

        HelloThread h1 = new HelloThread("T1");
        HelloThread h2 = new HelloThread("T2");
        HelloThread h3 = new HelloThread("T3");
        HelloThread h4 = new HelloThread("T4");
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        try {
            h1.join();
            h2.join();
            h3.join();
            h4.join();
        } catch (InterruptedException ex) {
            System.out.println("Erro " + ex.getMessage());
        }
    }
}
