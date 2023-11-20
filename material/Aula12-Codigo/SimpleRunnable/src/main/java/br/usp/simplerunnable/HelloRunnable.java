package br.usp.simplerunnable;

import java.util.ArrayList;

/**
 *
 * @author Junio
 */
public class HelloRunnable implements Runnable {

    private int iMyId;
    public HelloRunnable(int iId){
       iMyId =  iId;
    }
    public void run() {
        System.out.println("Hello from a runnable thread! My id is " + iMyId);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}