/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcecoesExemplos;

/**
 *
 * @author junio
 */
public class UsuarioPrincipal {
    int i[];
    public UsuarioPrincipal(){
        i = new int[10];
    }
    public float Teste(int iNumero) throws ExceptionDivisaoPorZero{
        if(iNumero == 0) throw new ExceptionDivisaoPorZero("Erro de divisao por zero.");
        return 5/iNumero;
    }
    public int Teste2(int iIndex) throws ExceptionIndiceForaDosLimites{
        if(iIndex >=10) throw new ExceptionIndiceForaDosLimites("Thou shall not pass.");
        return i[iIndex];
    }
}
