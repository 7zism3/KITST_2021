/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forkJoinFrameWork.usingRecursiveTask;

import java.util.concurrent.RecursiveTask;

/**
 *
 * @author Hung
 */
public class ArrayCounter extends RecursiveTask<Integer> {

    int[] array;
    int threshold ;
    int start;
    int end;

    public ArrayCounter(int[] array, int start, int end, int threshold) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.threshold=threshold;
    }

    protected Integer compute() {
        if (end - start < threshold) {
            return computeDirectly();
        } else {
            int middle = (end + start) / 2;

            ArrayCounter subTask1 = new ArrayCounter(array, start, middle, threshold);
            ArrayCounter subTask2 = new ArrayCounter(array, middle, end, threshold);

            invokeAll(subTask1, subTask2);

            return subTask1.join() + subTask2.join();
        }
    }

    protected Integer computeDirectly() {
        Integer count = 0;

        for (int i = start; i < end; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
