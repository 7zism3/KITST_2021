package homeWork7._A_5LuongDuLieu.charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Hung
 */
public class FileReaderAndFileWriter {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try {
            inputStream = new FileReader("inputChar.txt");
            outputStream = new FileWriter("outputChar.txt");
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
            outputStream.write("Nguyễn Mạnh Hùng");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }

    }

}
