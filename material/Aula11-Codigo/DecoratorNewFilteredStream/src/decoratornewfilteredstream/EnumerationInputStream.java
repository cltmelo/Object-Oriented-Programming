/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratornewfilteredstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class EnumerationInputStream {
    int iLineNumber;
    BufferedReader in;
    public EnumerationInputStream(FileInputStream objetoASerDecorado) {
        InputStreamReader isr = new InputStreamReader(objetoASerDecorado);
        BufferedReader bfr = new BufferedReader(isr);
        in = bfr; /*Inicializa a proprieda in de FilterInputStream*/
        iLineNumber = 0;
    }

    public String readln() throws IOException {     
        String sLine = this.in.readLine();  /*a propriedade in é o objeito a ser decorado recebido no construtor*/
        if(sLine != null){
            iLineNumber++;
            return iLineNumber +": "+ sLine;    
        }
        return null;
    }
}
