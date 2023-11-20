/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listexecutablefiles;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author lucas
 */
public class ListExecutableFiles {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java ListExecutableFiles <caminho_do_diretorio>");
            System.exit(1);
        }

        String pathDir = args[0];
        listExecutableFiles(new File(pathDir));
    }

    public static void listExecutableFiles(File d) {
        if (d.isDirectory()) {
            System.out.println("Arquivos executáveis em " + d.getAbsolutePath() + ":");

            // Usando FilenameFilter para listar apenas arquivos executáveis
            File[] files = d.listFiles(new ExecutableFileFilter());
            
            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getAbsolutePath());
                }
            } else {
                System.out.println("Error directory access: " + d.getAbsolutePath());
            }
        } else {
            System.out.println("Path is not a valid directory: " + d.getAbsolutePath());
        }
    }

    // Classe interna que implementa FilenameFilter para filtrar arquivos executáveis (*.exe)
    static class ExecutableFileFilter implements FilenameFilter {
        @Override
        public boolean accept(File dir, String name) {
            return name.toLowerCase().endsWith(".exe");
        }
    }
}
