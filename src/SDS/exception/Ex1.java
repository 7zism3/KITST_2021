package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex1 {

    public static void main(String[] args) {
        
        try {
            A();
        } catch (Exception ex) {
            System.out.println("Main:..."+ex.getMessage());
        }
        
    }

    public static float A() throws Exception {
        float x = 0; 
        try {
            System.out.println("1.1. try ...");
            x = 1 / 1;
            System.out.println("1.2. try .... ");
            
        } catch (Exception e) {
             System.out.println("2 catch ");
             throw new Exception();// ném ngoại lệ đi
        }  finally {
            System.out.println("3. Trong finally ");
        } 
        System.out.println("4. Sau Try catch ");
        
        
        return x;
    }
}
