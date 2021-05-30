/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.util.Arrays;

/**
 *
 * @author Hung
 */
public class HashTableArrDemo {

    static int N = 10;

    static int hashFunction(int x, int N) {
        return x % N;
    }

    public static void main(String[] args) {
        int[] A = new int[N];
        int x;//=73;
        int index;//= hashFunction(x, N); 
        for (int i=0;i<5;i++) {
              x=(int) Math.round(100*Math.random());
              index= hashFunction(x, N);
            A[index]=x;
        }
         x=73;
          index= hashFunction(x, N);
          A[index]=x;
        // Tìm kiếm x=73;
        index= hashFunction(x, N);
        if (A[index]==x) {
            System.out.println("Thay");
        } else System.out.println("Ko thay");
          
        System.out.println(Arrays.toString(A));
    }

}
