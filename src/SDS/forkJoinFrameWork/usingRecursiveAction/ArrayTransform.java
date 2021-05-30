/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forkJoinFrameWork.usingRecursiveAction;

import java.util.concurrent.RecursiveAction;

/**
 *
 * @author Hung
 */
public class ArrayTransform extends RecursiveAction {
    int[] array;
    int number;
    int threshold = 100_000;
    int start;
    int end;
 
    public ArrayTransform(int[] array, int number, int start, int end) {
        this.array = array;
        this.number = number;
        this.start = start;
        this.end = end;
    }
 
    protected void compute() {
        if (end - start < threshold) {
            computeDirectly();
        } else {
            int middle = (end + start) / 2;
 
            ArrayTransform subTask1 = new ArrayTransform(array, number, start, middle);
            ArrayTransform subTask2 = new ArrayTransform(array, number, middle, end);
 
            invokeAll(subTask1, subTask2);
        }
    }
 
    protected void computeDirectly() {
        for (int i = start; i < end; i++) {
            array[i] = array[i] * number;
        }
    }
}