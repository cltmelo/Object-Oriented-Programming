/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package runtimeexceptionagenda;

/**
 *
 * @author Junio
 */
public class Contato {

    private String sNome;
    private String sTelefone;

    public Contato(String sNome, String sTelefone) {
        this.sNome = sNome;
        this.sTelefone = sTelefone;
    }

    public String getNome() {
        return sNome;
    }

    public void setTelefone(String sATelefone) {
        sTelefone = sATelefone;
    }
}
