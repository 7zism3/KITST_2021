/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioStreams.byteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Hung
 */
public class FileInputStreamAndFileOutputStreamUsingBuffer {

    public static void main(String[] args) {
        try (
                InputStream inputStream
                = new BufferedInputStream(new FileInputStream("input.txt"));
                OutputStream outputStream
                = new BufferedOutputStream(new FileOutputStream("ouputBuffer.txt"));) {
             byte[] buffer = new byte[8192];
             while (inputStream.read(buffer) != -1) {
                outputStream.write(buffer);
            } 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
