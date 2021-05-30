
package homeWork7._A_5LuongDuLieu.byteStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class CheckPNG {
    private static int[] maDangKiPNG = {137, 80, 78, 71, 13, 10, 26, 10};
 
    public static void main(String[] args) {  
        try (
            InputStream inputStream = new FileInputStream("input.txt");) {
            int[] headerBytes = new int[8]; 
            boolean temp = true;
            for (int i = 0; i < 8; i++) {
                headerBytes[i] = inputStream.read();
                if (headerBytes[i] != maDangKiPNG[i]) {
                    temp = false;
                    break;
                }
            }
            System.out.println("Đây là file PNG: " + temp);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
 
    }
}