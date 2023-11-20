/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.renomearmp3;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author lucas
 */

//COMMAND FAILED!!!!!!!!!!!!!
public class RenomearMP3 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Use: java RenomearMP3 /NetBeansProjects/'Programação Orientada à Objetos'/working/'Streams && Files'/RenomearMP3");
            System.exit(1);
        }
        
        String dir = args[0];
        renomearMP3(dir);
    }

    public static void renomearMP3(String diretorio) {
        File dir = new File(diretorio);
        
        // List only .mp3 files
        File[] files = dir.listFiles(new FilenameFilter() {
           @Override
           public boolean accept(File dir, String name) {
               return name.toLowerCase().endsWith(".mp3");
           }
        });
        
        if (files == null || files.length == 0) {
            System.out.println("No .mp3 files found in current directory.");
            return;
        }
        
        // Sort them by size
        Arrays.sort(files, Comparator.comparingLong(File::length));
        
        // Rename files
        for (int i=0; i<files.length; i++) {
            File file = files[i];
            String originalName = file.getName();
            String newName = String.format("%04s.%s.mp3", i+1, originalName.replaceAll("[\\d-]", ""));
            File newFile = new File(dir, newName);
            
            if (file.renameTo(newFile)) {
                System.out.println("File renamed succefully: " + newName);
            } else {
                System.out.println("Rename file failure: " + originalName);
            }
        }
    }
    
    
}
