/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author Hung
 */
public class NewClass1 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 3};
        int dem = 1;// tự nhiên 
        int max = dem;
        int start = 0;
        int i;
        for (i = a.length - 2; i >= 0; i--) {
            dem++;
            if (a[i+1] < a[i]) { 
                if (dem > max) {
                    max = dem;
                    start = i;
                }
             dem = 1; 
            } 
        }
         if (dem >= max) {
                    max = dem ;
                    start =0;
         } 
        System.out.println(max + " " + start);

        System.out.println("Dãy con tăng dần dài nhất là:");
        for (i = start; i <= start + max - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
