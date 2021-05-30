/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forkJoinFrameWork.usingRecursiveTask;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author Hung
 */
public class Test {
    static final int SIZE = 10_000_000;
    static int[] array = randomArray();
 
    public static void main(String[] args) {
 long startTime = System.currentTimeMillis();
        ArrayCounter mainTask = new ArrayCounter(array, 0, SIZE, 1000);
        ForkJoinPool pool = new ForkJoinPool();
        Integer evenNumberCount = pool.invoke(mainTask);
   long endTime = System.currentTimeMillis();
  long time = (endTime - startTime);
        System.out.println("Execution time: " + time + " ms");
        System.out.println("Number of even numbers: " + evenNumberCount);
    }
 
    static int[] randomArray() {
        int[] array = new int[SIZE];
        Random random = new Random();
 
        for (int i = 0; i < SIZE; i++) {
            array[i] = random.nextInt(100);
        }
 
        return array;
    }
 
}
