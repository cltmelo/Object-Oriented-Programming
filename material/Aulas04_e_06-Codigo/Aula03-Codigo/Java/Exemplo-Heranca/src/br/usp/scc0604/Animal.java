/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.scc0604;

/**
 *
 * @author Junio
 */
public class Animal{
    protected String sNome;
    public Animal(String umNome){
        sNome = umNome + "!";
    }

    public String getsNome() {
        return sNome;
    }
}
