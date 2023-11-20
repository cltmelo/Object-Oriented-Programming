/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.substituirpalavra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lucas
 */
public class SubstituirPalavra {

    public static void main(String[] args) {
        String inputFile = "arquivo.txt";
        String outputFile = "arquivo_modificado.txt";
        
        String target = "muito";
        String newWord = "pouco";
        
        try {
            substituirPalavra(inputFile, outputFile, target, newWord);
            System.out.println("Substituição concluida com sucesso!");
        } catch(IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar a substituição.");
        }
    }
    
    private static void substituirPalavra(String inputFile, String outputFile, String target, String newWord) throws IOException{
        try( BufferedReader br = new BufferedReader(new FileReader(inputFile)); BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile)) ){
            String line;
            
            while ( (line = br.readLine()) != null ) {
                // Realiza a substituição na linha
                String lineModified = line.replace(target, newWord);
                //Escreve a linha modificada no arquivo de saída
                bw.write(lineModified);
                // Adiciona quebra de linha
                bw.newLine();
                
            }
        }
    }
}
