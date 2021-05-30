/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrentCollections.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Hung
 */
public class Test {
 
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
 
        new WriterThread(map, "Writer-1", 1).start();
        new WriterThread(map, "Writer-2", 2).start();
 
        for (int i = 1; i <= 5; i++) {
            new ReaderThread(map, "Reader-" + i).start();
        }
    }
}
