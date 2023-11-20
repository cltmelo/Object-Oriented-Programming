/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package runtimeexceptionagenda;

/**
 *
 * @author Junio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();
        minhaAgenda.add(new Contato("Joao","3333-2244"));
        minhaAgenda.add(new Contato("Jose","4422-0909"));
        minhaAgenda.add(new Contato("Jeronimo","2121-0756"));
        minhaAgenda.atualizaTelefone("Joao", "4352-7878");
        minhaAgenda.atualizaTelefone("Maria", "4343-6767");
    }

}
