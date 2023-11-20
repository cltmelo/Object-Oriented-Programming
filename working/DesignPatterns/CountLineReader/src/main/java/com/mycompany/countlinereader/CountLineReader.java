/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.countlinereader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author lucas
 */
import java.io.*;

public class CountLineReader extends FilterInputStream {

    private BufferedReader bufferedReader;
    private int charCount;

    public CountLineReader(InputStream in) {
        super(in);
        this.bufferedReader = new BufferedReader(new InputStreamReader(in));
        this.charCount = 0;
    }

    @Override
    public int read() throws IOException {
        int data = super.read();
        if (data != -1) {
            charCount++;
        }
        return data;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int bytesRead = super.read(b, off, len);
        if (bytesRead > 0) {
            charCount += bytesRead;
        }
        return bytesRead;
    }

    public String readLine() throws IOException {
        String line = bufferedReader.readLine();
        if (line != null) {
            charCount += line.length() + System.lineSeparator().length();
            return "Chars read so far: " + charCount + ", Line: " + line;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("example.txt");
             CountLineReader countingLineReader = new CountLineReader(fileInputStream)) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(countingLineReader));

            // Example usage
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
