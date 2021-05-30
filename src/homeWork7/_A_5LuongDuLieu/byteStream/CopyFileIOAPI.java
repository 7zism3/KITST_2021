package homeWork7._A_5LuongDuLieu.byteStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CopyFileIOAPI { 
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        //Xem thư mục gốc để tạo file input.txt thủ công
        int i=0;
        String filename="result.csv";
        Path pathToFile = Paths.get(filename);
        System.out.println(pathToFile.toAbsolutePath());

        try {
            long start = System.currentTimeMillis(); 
            byte[] allBytes = Files.readAllBytes(Paths.get(inputFile));
            Files.write(Paths.get(outputFile), allBytes); 
            long end = System.currentTimeMillis();
            System.out.println("Thời gian thực hiện khi đọc tất cả byte " + (end - start) + " ms");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
