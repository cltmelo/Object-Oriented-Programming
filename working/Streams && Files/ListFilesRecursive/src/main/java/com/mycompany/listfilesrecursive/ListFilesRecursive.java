/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

// KINDA INCOMPLETE, I GUESS!!!!!!!!!!

package com.mycompany.listfilesrecursive;

import java.io.File;

/**
 *
 * @author lucas
 */
public class ListFilesRecursive {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java ListFilesRecursive <caminho_do_diretorio>");
            System.exit(1);
        }

        String pathDir = args[0];
        listFiles(new File(pathDir));
    }

    public static void listFiles(File d) {
        if (d.isDirectory()) {
            System.out.println("Arquivos em " + d.getAbsolutePath() + ":");

            File[] files = d.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        // Se for um diretório, chama o método recursivamente
                        listFiles(file);
                    } else {
                        // Se for um arquivo, imprime o caminho
                        System.out.println(file.getAbsolutePath());
                    }
                }
            } else {
                System.out.println("Error directory access: " + d.getAbsolutePath());
            }
        } else {
            System.out.println("Path is not a valid directory: " + d.getAbsolutePath());
        }
    }
}


//public class ListFilesRecursive {
//
//    public static void main(String[] args) {
//        if (args.length != 1) {
//            System.out.println("Use: Java ListFilesRecursive /NetBeansProjects/'Programação Orientada à Objetos'/working");
//            System.exit(1);
//        }
//        
//        String pathDir = args[0];
//        listFiles(new File(pathDir));
//    }
//    
//    public static void listFiles(File d){
//        if (d.isDirectory()) {
//            System.out.println("FIles in " + d.getAbsolutePath() + ":");
//            
//            File[] files = d.listFiles();
//            
//            if (files != null){
//                for (File file : files) {
//                    if (file.isDirectory()) {
//                        listFiles(file);
//                    } else {
//                        System.out.println(file.getAbsolutePath());
//                    }
//                }
//            } else {
//                System.out.println("Error accesing directory: " + d.getAbsolutePath());
//            }
//        } else {
//            System.out.println("Path is not a valid directory: " + d.getAbsolutePath());
//
//        }
//        
//    }
//}
