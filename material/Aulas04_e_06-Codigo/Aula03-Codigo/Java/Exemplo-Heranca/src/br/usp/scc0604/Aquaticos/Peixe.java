/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.scc0604.Aquaticos;

import br.usp.scc0604.Animal;

/**
 *
 * @author Junio
 */
public class Peixe extends Animal{
    int iMinsDeFolego;

    public Peixe(String saNome, int umMinsDeFolego) {
        super(saNome);
        iMinsDeFolego = umMinsDeFolego;
    }

    public int getMinsDeFolego() {
        return iMinsDeFolego;
    }
    
    public String getsNome() {
        return "Eu sou um animal aquatico chamado " + sNome + " blurp, blurp";
    }     

}
