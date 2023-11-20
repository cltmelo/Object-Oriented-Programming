/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcecoesExemplos;

/**
 *
 * @author junio
 */
public class UsuarioSecundario {
    UsuarioPrincipal c;
    public UsuarioSecundario(){
        c = new UsuarioPrincipal();
    }
    public void executa(int i) throws ExceptionDivisaoPorZero{
        c.Teste(i);
    }
    public void executa2(int i) throws ExceptionIndiceForaDosLimites{
        c.Teste2(i);
    }
}
