/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrentCollections.arrayBlockingQueue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.BlockingQueue;

 
public class FileParser extends Thread {
    private BlockingQueue<File> queue;
    private String keyword;
 
    public FileParser(BlockingQueue<File> queue, String keyword) {
        this.queue = queue;
        this.keyword = keyword;
    }
 
    public void run() {
        while (true) {
            try {
                File file = queue.peek();
 
                if (file != null && !file.getName().equals("END")) {
                    file = queue.take();
                    parseFile(file);
                } else {
                    break;
                }
            } catch (InterruptedException | IOException ex) {
                ex.printStackTrace();
            }
        }
    }
 
    private void parseFile(File file) throws IOException {
        List<String> lines = Files.readAllLines(file.toPath());
        int lineCount = 0;
 
        for (String aLine : lines) {
            lineCount++;
            if (aLine.contains(keyword)) {
                String result = "Found in %s at line %d\n";
                System.out.printf(result, file.getAbsolutePath(), lineCount);
                break;
            }
        }
 
    }
}