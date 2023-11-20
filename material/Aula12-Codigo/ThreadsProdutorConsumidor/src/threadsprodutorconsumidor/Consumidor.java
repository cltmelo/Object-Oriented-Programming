/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsprodutorconsumidor;

/**
 *
 * @author Junio
 */
public class Consumidor extends Thread {

    private Deposito deposito;
    private int iMercadoria;
    private String sNome;

    public Consumidor(Deposito c, String sANome) {
        deposito = c;
        sNome = sANome;
    }


    public void run() {
        for (int i = 0; i < 10; i++)
            this.iMercadoria = deposito.get(sNome);
    }
}