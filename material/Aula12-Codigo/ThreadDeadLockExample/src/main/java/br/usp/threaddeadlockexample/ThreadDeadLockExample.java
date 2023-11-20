package br.usp.threaddeadlockexample;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class ThreadDeadLockExample {

    public static void main(String[] args) {
        //////////////////////////////////////////////////////////////////        
        /*Deadlock exemplo*/
        
        Amigo jose = new Amigo("Jose");
        Amigo joao = new Amigo("Joao");
        DeadlockThreading dtTemp1 = new DeadlockThreading(jose, joao);
        DeadlockThreading dtTemp2 = new DeadlockThreading(joao, jose);
        dtTemp1.start();
        dtTemp2.start();
    }
}
