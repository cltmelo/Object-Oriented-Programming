/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bytearraytofile;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author lucas
 */
public class ByteArrayToFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String name = "Melo";
        
        // Convert string name to byte array using getBytes
        byte[] byteArray = name.getBytes();
        
        //Creating a ByteArrayInputStream with byte array
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        
        //Name of output file
        String fileName = "out.txt";
        
        
        // Writting byte array in a file using FileOutputStream
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            int byteRead;
            while ((byteRead = byteArrayInputStream.read()) != -1) {
                fileOutputStream.write(byteRead);
            }
            
            System.out.println("Byte array witten succefully!");
        } catch (IOException e){
            System.err.println("Error in writting in file:" + e.getMessage());
        } finally {
            // Be careful in closing ByteArrayInputStream
            try {
                byteArrayInputStream.close();
            } catch (IOException e) {
                System.err.println("Error in closing ByteArrayInputStream:" + e.getMessage());
            }
        }
    }
}
