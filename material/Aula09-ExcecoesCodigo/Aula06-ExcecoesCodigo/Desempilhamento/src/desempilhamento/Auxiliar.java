package desempilhamento;

import java.lang.NullPointerException;
import java.io.File;

public class Auxiliar {

    public int metodo1() {
        char a, b;
        System.out.println("m1");
        int x = metodo2();

        File file = null;
        //f.canRead(); /*Force exception*/

        return 7700;
    }

    public int metodo2() {
        System.out.println("m2");
        metodo3();
        File file = null;
        //file.canRead(); /*Force exception*/

        return 7000;
    }

    public int metodo3() {
        System.out.println("m3");
        metodo4();

        float e;

        File file = null;
        file.exists();
        /*Force exception*/

        return 6600;
    }

    public int metodo4() {
        System.out.println("m4");
        metodo5();
        long g, h;

        File file = null;
        //file.exists(); /*Force exception*/

        return 6000;
    }

    public void metodo5() {
        short i, j;
        System.out.println("m5");

        File file = null;

        file.exists();

        //f.canRead(); /*Force exception*/
    }

    public void stackOverFlow() {
        stackOverFlow(0, true);
    }

    public void stackOverFlow(int iEsima, boolean bFirst) {
        double d1, d2, d3, d4, d5, d6;

        if (bFirst) {
            iEsima = 0;
        } else {
            iEsima++;
        }
        /*Digita valor
         i << cin;
        
         */

        if (iEsima == 5) {
            return;
        } else {
            //System.out.println("Chamada: " + iEsima);
            stackOverFlow(iEsima, false);
        }
    }
}




