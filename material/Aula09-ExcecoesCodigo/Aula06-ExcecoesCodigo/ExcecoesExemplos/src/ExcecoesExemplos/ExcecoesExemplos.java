/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcecoesExemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author junio
 */
public class ExcecoesExemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        RandomAccessFile r = null;
        String s = null;
        UsuarioSecundario testando = new UsuarioSecundario();
        while (true) {
            System.out.println("Digite SAIR para interromper");
            try {
                s = bufferRead.readLine();
            } catch (IOException ex) {
            }
            if (s.compareTo("SAIR") == 0) {
                break;
            }
            try {
                /*1*/testando.executa(new Integer(s).intValue());
                /*2*/testando.executa2(new Integer(s).intValue());
                /*3*/r = new RandomAccessFile(s, "r");
            } catch (ExceptionDivisaoPorZero ez) {
                System.out.println(ez.getMessage()); /*Erro na linha 1*/
            } catch (ExceptionIndiceForaDosLimites el) {
                System.out.println(el.getMessage()); /*Erro na linha 2*/
            } catch (Exception e) {
                System.out.println(e.getMessage()); /*Erro na linha 3*/
                System.out.println("Arquivo nao existente");                
            } finally {
                if (r != null) {
                    try {
                        r.close();
                    } catch (IOException ex) {
                        Logger.getLogger(ExcecoesExemplos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
}
