package homeWork7._A_5LuongDuLieu.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileInputStreamAndFileOutputStream_OneByteAt_aTime {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("ouput_byte.txt");
            int c;
            long start = System.currentTimeMillis();
            while ((c = in.read()) != -1) { 
                out.write(c); 
               }
            long end = System.currentTimeMillis();

            System.out.println("Thời gian thực hiện khi đọc từng byte " + (end - start) + " ms");
         } finally { if (in != null) { in.close(); }
            if (out != null) {  out.close();  
             }
        }

    }
}
