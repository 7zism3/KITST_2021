/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioStreams.byteStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Hung
 */
public class CopyFileIOAPI { 
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "outputAPI.txt"; 
        try {
            long start = System.currentTimeMillis(); 
            byte[] allBytes = Files.readAllBytes(Paths.get(inputFile));
            Files.write(Paths.get(outputFile), allBytes); 
            long end = System.currentTimeMillis();
            System.out.println("Copied in " + (end - start) + " ms");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
