package homeWork7._A_5LuongDuLieu.byteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamAndFileOutputStreamUsingBuffer {

    public static void main(String[] args) {
        try (
                InputStream inputStream
                        = new BufferedInputStream(new FileInputStream("input.txt"));
                OutputStream outputStream
                        = new BufferedOutputStream(new FileOutputStream("ouputBuffer.txt"));) {
            long start = System.currentTimeMillis();
            byte[] buffer = new byte[2456];
            while (inputStream.read(buffer) != -1) {
                outputStream.write(buffer);
            }
            long end = System.currentTimeMillis();
            System.out.println("Thời gian thực hiện khi đọc Buffer " + (end - start) + " ms");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
