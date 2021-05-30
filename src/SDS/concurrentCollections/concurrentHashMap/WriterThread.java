/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrentCollections.concurrentHashMap;

import java.util.Random;
import java.util.concurrent.ConcurrentMap;

/**
 *
 * @author Hung
 */
public class WriterThread extends Thread {
    private ConcurrentMap<Integer, String> map;
    private Random random;
    private String name;
 
    public WriterThread(ConcurrentMap<Integer, String> map,
                        String threadName, long randomSeed) {
        this.map = map;
        this.random = new Random(randomSeed);
        this.name = threadName;
    }
 
    public void run() {
        while (true) {
            Integer key = random.nextInt(10);
            String value = name;
 
            if(map.putIfAbsent(key, value) == null) {
                long time = System.currentTimeMillis();
                String output = String.format("%d: %s has put [%d => %s]",
                                                time, name, key, value);
                System.out.println(output);
            }
 
 
            Integer keyToRemove = random.nextInt(10);
 
            if (map.remove(keyToRemove, value)) {
                long time = System.currentTimeMillis();
                String output = String.format("%d: %s has removed [%d => %s]",
                                                time, name, keyToRemove, value);
                System.out.println(output);
            }
 
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
