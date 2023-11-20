package br.usp.simplerunnable;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class SimpleRunnable {

    public static void main(String[] args) {
        (new Thread(new HelloRunnable(10))).start();

        //////////////////////////////////////////////////////////////////        
        /*Exemplo de thread com intervalos de sleep*/
        SleepMessages sMsgs = new SleepMessages();
        sMsgs.start();

    }
}
