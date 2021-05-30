/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hung
 */
public class SX {

    public static void main(String[] args) {
        int[] A = {1, 0, 9, 7, 2, 2, 8, 3, 6, 5, 4, 5, 5, 5, 5,5};
        int x = 5;
        int mid = 0;
        int start, end;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        
        boolean find = false;
        int left = 0, right = A.length - 1;
        while (left <= right) {
            mid = (right + left) / 2;
            if (A[mid] == x) {
                find = true;
                break;
            } else {
                if (A[mid] > x) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        if (find == false) {
            System.out.print("Khong co");
        } else {
            start = mid;
            end = mid;
            while (A[start] == A[mid]) {
                start--;
            }
            while (A[end] == A[mid]) {
                end++;
            }
            if (end - start == 2) {
                System.out.print(x + " chi xuat hien 1 lan o vi tri [" + mid + "]");
            } else {
                System.out.print(x + " xuat hien o cac vi tri [");
                for (int v = start + 1; v < end; v++) {
                    System.out.print(v);
                    if (v != end - 1) {
                        System.out.print(", ");
                    } else {
                        System.out.print(".]");
                    }
                }
            }
        }
    }
}
