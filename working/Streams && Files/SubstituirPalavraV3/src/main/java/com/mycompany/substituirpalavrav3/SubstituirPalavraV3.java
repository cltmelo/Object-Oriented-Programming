/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.substituirpalavrav3;
import java.io.*;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lucas
 */

public class SubstituirPalavraV3 {
    public static void main(String[] args) {
        substituirPalavra("arquivo.txt", "arquivo_modificado.txt");
    }

    public static void substituirPalavra(String inputFile, String outputFile) {
        try {
            Path pathInput = Paths.get(inputFile);
            Path pathOutput = Paths.get(outputFile);

            // Lê todo o conteúdo do arquivo de entrada
            String content = new String(Files.readAllBytes(pathInput));

            // Mapeia as palavras-alvo e suas variações para substituição
            Map<String, String> substituicoes = new HashMap<>();
            substituicoes.put("\\b([mM][uU][iI][tT][oO][sS]?)\\b", "pouco");
            substituicoes.put("\\b([pP][oO][uU][cC][oO][sS]?)\\b", "poucos");
            substituicoes.put("\\b([mM][uU][iI][tT][aA][sS]?)\\b", "poucas");

            // Aplica as substituições
            String contentModified = aplicarSubstituicoes(content, substituicoes);

            // Escreve o conteúdo modificado no arquivo de saída
            Files.write(pathOutput, contentModified.getBytes());

            System.out.println("Substituição concluída com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String aplicarSubstituicoes(String content, Map<String, String> substituicoes) {
        // Utiliza expressões regulares e um mapa de substituições
        for (Map.Entry<String, String> entry : substituicoes.entrySet()) {
            Pattern pattern = Pattern.compile(entry.getKey());
            Matcher matcher = pattern.matcher(content);
            content = matcher.replaceAll(entry.getValue());
        }
        return content;
    }
}
