/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioStreams.charStream;
 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Hung
 */
public class FileReaderAndFileWriterUsingBuffer {

    public static void main(String[] args) throws FileNotFoundException, IOException {
         BufferedReader br=null;
         BufferedWriter bw=null; 
        try {
            br = new BufferedReader( new FileReader("inputChar.txt"));
            bw = new BufferedWriter(new FileWriter("outputCharBuffered.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                bw.write(s);
                bw.newLine();
            } 
        } finally {
            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.close();
            }
        }

    }

}
