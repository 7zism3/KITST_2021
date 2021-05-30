/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrentCollections.linkedBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author Hung
 */
public class LinkedBlockingQueueTest {
 
    public static void main(String[] args) {
 
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);
 
        Thread producer = new Thread(new Producer(queue));
 
        Thread consumer = new Thread(new Consumer(queue));
 
        producer.start();
 
        consumer.start();
 
    }
}
