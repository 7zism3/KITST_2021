/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioStreams.byteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Hung
 */
public class scannerDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        String userDirectory = System.getProperty("user.dir");
        System.out.println(userDirectory);
       Scanner sc = new Scanner(new File("myNumbers.txt"));
      while (sc.hasNextLong()) {
          long aLong = sc.nextLong();
          System.out.println(aLong);
      }
    }
}
