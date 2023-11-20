/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.scc0604.Aquaticos;

import br.usp.scc0604.Aquaticos.Peixe;

/**
 *
 * @author Junio
 */
public class Lambari extends Peixe{
    float fPeso;
    Lambari(String saNome, int umMinsDeFolego){
        super(saNome, umMinsDeFolego);
        fPeso = 1;
    }

    public float getfPeso() {
        return fPeso;
    }
    
}
