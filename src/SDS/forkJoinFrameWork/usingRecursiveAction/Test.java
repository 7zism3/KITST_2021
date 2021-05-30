/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forkJoinFrameWork.usingRecursiveAction;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author Hung
 */
public class Test {
    static final int SIZE = 100000000;
    static int[] array = randomArray();
 
    public static void main(String[] args) {
 
        int number = 9;
 
        System.out.println("First 10 elements of the array before: ");
        print();
 
        ArrayTransform mainTask = new ArrayTransform(array, number, 0, SIZE);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(mainTask);
 
        System.out.println("First 10 elements of the array after: ");
        print();
    }
 
    static int[] randomArray() {
        int[] array = new int[SIZE];
        Random random = new Random();
 
        for (int i = 0; i < SIZE; i++) {
            array[i] = random.nextInt(100);
        }
 
        return array;
    }
 
    static void print() {
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}