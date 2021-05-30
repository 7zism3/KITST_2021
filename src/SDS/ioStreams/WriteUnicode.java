/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioStreams;
/**
 *
 * @author Hung
 */
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class WriteUnicode {
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\test.txt";
        List<String> lines = Arrays.asList("line 1", "line 2"
                , "line 3", "Nguyễn Mạnh Hùng");
        writeUnicodeJava8(fileName, lines);
        //writeUnicodeJava11(fileName, lines);
        //writeUnicodeClassic(fileName, lines);
        System.out.println("Done");
    }
    // in the old days
    public static void writeUnicodeClassic(String fileName, List<String> lines) {
      File file = new File(fileName);
      try (
              FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter osw 
                        = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                BufferedWriter writer = new BufferedWriter(osw)) {

            for (String line : lines) {
                writer.append(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // Java 8 - Files.newBufferedWriter(path) - default UTF-8
    public static void writeUnicodeJava8(String fileName, List<String> lines) throws IOException {
        Path path = Paths.get(fileName);
        BufferedWriter writer = null;
        try {
            writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
            for (String line : lines) {
                writer.append(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ///
        String str;
        //  BufferedReader br = 
        //  new BufferedReader (new InputStreamReader(System.in, StandardCharsets.UTF_8));
       
         BufferedReader br = 
         new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
          
         System.out.println("Nhap ('stop' de ket thuc chuong trinh).");
         do {
         System.out.print(": ");
         str = br.readLine();
         if (str.compareTo("stop") == 0) {
         break;
         }
             System.out.println(str);
                 
         str = str;// + "\r\n";
         writer.append(str);
         writer.newLine();
         writer.append("Nguyễn");
          writer.newLine();
         } while (str.compareTo("stop") != 0);
        
        writer.close();
        //
        
    }

    // Java 11 adds Charset to FileWriter
    public static void writeUnicodeJava11(String fileName, List<String> lines) {

//        try (FileWriter fw = new FileWriter(new File(fileName), StandardCharsets.UTF_8);
//             BufferedWriter writer = new BufferedWriter(fw)) {
//
//            for (String line : lines) {
//                writer.append(line);
//                writer.newLine();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

}
