/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.scc0604.Terrestres;

/**
 *
 * @author Junio
 */
public class Cachorro extends Mamifero{
    public String sRaca;
    Cachorro(String saNome, int umNroPatas, String sARaca){
        super(saNome,umNroPatas);
        sRaca = sARaca;
    }

    public String getsRaca() {
        return sRaca;
    }
    
}