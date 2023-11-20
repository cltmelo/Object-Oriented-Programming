/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.substituirpalavrav2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lucas
 */
public class SubstituirPalavraV2 {
    public static void main(String[] args) {
        substituirPalavra("arquivo.txt", "arquivo_modificado.txt");
    }

    public static void substituirPalavra(String inputFile, String outputFile) {
        try {
            Path pathInput = Paths.get(inputFile);
            Path pathOutput = Paths.get(outputFile);

            // Lê todo o conteúdo do arquivo de entrada
            String content = new String(Files.readAllBytes(pathInput));

            // Usa uma expressão regular para substituir variações da palavra "muito"
            String contentModified = substituirVariacoesMuito(content);

            // Escreve o conteúdo modificado no arquivo de saída
            Files.write(pathOutput, contentModified.getBytes());

            System.out.println("Substituição concluída com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String substituirVariacoesMuito(String content) {
        // Utiliza uma expressão regular para encontrar variações da palavra "muito"
        Pattern pattern = Pattern.compile("\\b[mM][uU][iI][tT][oO][sS]?\\b");
        Matcher matcher = pattern.matcher(content);

        // Substitui todas as ocorrências encontradas
        return matcher.replaceAll("pouco");
    }
}