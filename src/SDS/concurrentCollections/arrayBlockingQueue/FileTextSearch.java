/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrentCollections.arrayBlockingQueue;

import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class FileTextSearch {
    public static void main(String[] args) {
        String dirPath = args[0];
        String extension = args[1];
        String keyword = args[2];
       // 100
        BlockingQueue<File> queue = new ArrayBlockingQueue<>(100);
 
        DirectoryLister lister 
                = new DirectoryLister(queue, new File(dirPath), extension);
        lister.start();
 
        for (int i = 0; i < 10; i++) {
            FileParser parser = new FileParser(queue, keyword);
            parser.start();
        }
    }
}