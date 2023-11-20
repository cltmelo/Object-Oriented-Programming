/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.scc0604.Terrestres;

import br.usp.scc0604.Animal;

/**
 *
 * @author Junio
 */
/*           Terrestre   é um   Animal*/
public class Mamifero extends Animal{
    int iNrPatas;
    public Mamifero(String saNome, int umNroPatas){
        super(saNome);
        iNrPatas = umNroPatas;
    }

    Mamifero(int umNroPatas){
        super("Terrestre");
        iNrPatas = umNroPatas;
    }    
    
    public int getiNrPatas() {
        return iNrPatas;
    }
    
    /*Sobreescrita = override*/    
    public String getsNome() {
        return "Eu sou um animal terrestre chamado " + sNome;
    }  
    
}
