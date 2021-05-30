/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Arrays;

/**
 *
 * @author Hung
 */
public class Chen {

    public static void main(String[] args) {
        int[] A = {4, 8, 12, 17, -1};
        int x = 9;// vào dãy trên để được 1 dãy tăng dần: 
        A[A.length-1]=x;//4, 8, 12, 17, 9
                        //4, 8, 9, 12, 17 
        int i=0;
        for (  i = A.length - 2; i >= 0; i--) {
            if (A[i] > x) {
                A[i + 1] = A[i];
            } else { 
                break;
            }
        }
        A[i+1]=x;
        System.out.println(Arrays.toString(A));
    }
}
