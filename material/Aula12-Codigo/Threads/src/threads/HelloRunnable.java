/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

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
    }
}