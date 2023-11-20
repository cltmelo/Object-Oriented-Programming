/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package checkedexceptionfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeitorDeArquivo {
    public void LeArquivo() throws NomeFeioException{
        FileReader frTemp = null;
        try {
            frTemp = new FileReader("c:\\temp\\teste.txt");
            BufferedReader br = new BufferedReader(frTemp);
            String line = br.readLine();
                     
            while (line != null) {
                if(line.compareTo("Francio") == 0)
                    throw new NomeFeioException(); /*Checked - tratamento obrigatorio*/
                if(line.compareTo("Alessanderson") == 0)
                    throw new NomeEsquisitoException(); /*Unchecked - dispensa tratamento, mas pode ser tratada*/
                if(line.compareTo("Disco pifado") == 0)
                    throw new MeuRunTimeException(); /*Unchecked - dispensa tratamento, mas pode ser tratada - muito embora não seja recomendado tratá-la*/
                System.out.println(line);
                line = br.readLine(); /*Lê próxima linha*/
            }
        } catch (FileNotFoundException e) {
                System.out.println("O arquivo não foi encontrado -" + e.getMessage());
        } catch(IOException e){
                System.out.println("Não foi possível ler do arquivo -" + e.getMessage());
        }/* catch(RuntimeException e){
                System.out.println(e.getMessage());
        } catch(Error e){
                System.out.println(e.getMessage());
        }*/
        finally{
            try {
                frTemp.close();
                System.out.println("Fechando arquivo...");
            } catch (Exception ex) {
                System.out.println("Problema no fechamento do arquivo");
            }
        }
    }

    public void LeArquivoComSensura(){
        /*Esta versão de LeArquivo trata as exceções, ao invés de apenas informar
          que elas ocorreram, garantindo a continuidade da execução*/
        FileReader frTemp = null;
        try {
            frTemp = new FileReader("c:\\temp\\teste.txt");
            BufferedReader br = new BufferedReader(frTemp);
            String line = br.readLine();

            while (line != null) {                
                try{
                    if(line.compareTo("Francio") == 0)
                        throw new NomeFeioException(); /*Checked - tratamento obrigatorio*/
                    if(line.compareTo("Alessanderson") == 0)
                        throw new NomeEsquisitoException(); /*Unchecked - dispensa tratamento, mas pode ser tratada*/
                    System.out.println(line);
                }catch(NomeFeioException e){
                    System.out.println("Belarmina");
                }catch(NomeEsquisitoException e){
                    System.out.println("Astolfo");
                }
                line = br.readLine();
            }            
        } catch (FileNotFoundException e) {
                System.out.println("O arquivo não foi encontrado -" + e.getMessage());
        } catch(IOException e){
                System.out.println("Não foi possível ler do arquivo -" + e.getMessage());
        }
        finally{
            try {
                frTemp.close();
                System.out.println("Fechando arquivo...");
            } catch (Exception ex) {
                System.out.println("Problema no fechamento do arquivo");
            }
        }
    }
}
