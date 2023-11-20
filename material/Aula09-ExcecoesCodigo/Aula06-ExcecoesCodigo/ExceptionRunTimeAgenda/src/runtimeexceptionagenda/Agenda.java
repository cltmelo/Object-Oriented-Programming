/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package runtimeexceptionagenda;

import java.util.ArrayList;

/**
 *
 * @author Junio
 */
public class Agenda extends ArrayList <Contato>{
     public Contato getContato(String nome) {
        for(int i=0;i<this.size();i++){
            Contato t = this.get(i);
            if(t.getNome().compareTo(nome) == 0)
                return t;
        }
        return null;
     }

     public void atualizaTelefone(String nome, String novoTelefone){
         Contato c = this.getContato(nome);
         c.setTelefone(novoTelefone);
     }
  }

