/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioStreams.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Hung
 */
public class FileInputStreamAndFileOutputStream_OneByteAt_aTime {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("ouput-byte.txt");
            int c;
            while ((c = in.read()) != -1) { 
                out.write(c); 
               }
         } finally { if (in != null) { in.close(); }
            if (out != null) {  out.close();  
             }
        }

    }
}
