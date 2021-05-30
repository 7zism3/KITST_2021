/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author Hung
 */
public class QuickSort {

    public static void main(String[] args) {
        int i;
        int[] arr = {90, 23, 101, 45, 65, 23, 67, 89, 34, 23};
        quickSort(arr, 0, 9);
        System.out.println("\n The sorted array is: \n");
        for (i = 0; i < 10; i++) {
            System.out.print (arr[i]+ ", ");
        }
    }
   static void swap(int [] A, int i, int j){
    int x=A[i];A[i]=A[j];A[j]=x;
  }
    
   static void quickSort(int Data[], int l, int r) {
        // If the first index less or equal than the last index
        if (l <= r) {
            // Create a Key/Pivot Element
            int key = Data[(l + r) / 2]; 
            // Create temp Variables to loop through array
            int i = l;
            int j = r;
            while (i <= j) {
                while (Data[i] < key) {
                    i++;
                }
                while (Data[j] > key) {
                    j--;
                }
                if (i <= j) {
                    swap(Data,i, j);
                    i++;
                    j--;
                }
            } 
	  // Recursion to the smaller partition in the array after sorted above
            if (l < j) {
                quickSort(Data, l, j);
            }
            if (r > i) {
                quickSort(Data, i, r);
            }
        }
    }
}
