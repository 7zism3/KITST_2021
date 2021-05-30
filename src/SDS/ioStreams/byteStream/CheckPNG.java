/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioStreams.byteStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Hung
 */
public class CheckPNG {
    private static int[] pngSignature = {137, 80, 78, 71, 13, 10, 26, 10};
 
    public static void main(String[] args) {  
        try (
            InputStream inputStream = new FileInputStream("input.txt");) {
            int[] headerBytes = new int[8]; 
            boolean isPNG = true; 
            for (int i = 0; i < 8; i++) {
                headerBytes[i] = inputStream.read();
                if (headerBytes[i] != pngSignature[i]) {
                    isPNG = false;
                    break;
                }
            }
            System.out.println("Is PNG file? " + isPNG); 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
 
    }
}