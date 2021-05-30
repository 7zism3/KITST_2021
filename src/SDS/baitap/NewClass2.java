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
public class NewClass2 {
 //  // Ban đầu giả thiết A[0] là dãy tăng dần

    public static void main(String[] args) {
        int[] a = {10, 14, 27, 33, 35, 35, 35, 42, 45, 90};
        int x = 35;
        int left=0, r=a.length-1;
        int mid;  
        boolean TimX=false;
        while (left<=r) {
          mid=(left+r)/2;
          if (x==a[mid]) {
              System.out.println("vtri="+mid);
             TimX=true; break;
          }
          else
              if (x<a[mid]) 
                  r=mid-1;
              else // x> a[mid]
                  left=mid+1;
        
        }
        
        if(TimX)  System.out.println("Co"); else System.out.println("Ko co");
        
        
//1) Hãy xác định xem x có xuất hiện trong a?
        

///2) Hãy in ra các vị trí xuất hiện của x trong mảng a.
        for (int i=0; i<a.length;i++) {
            if (a[i]==x) 
                System.out.print(i+" ");
        }
  
        /*
        1. Không có thì phải in "Không có"
        2. Xuất hiện 1 lần: 14 chỉ xuất hiện 1 lần ở vị trí: 0.
        3. Xuất hiện nhiều hơn 1 lần: 27  xuất hiện  ở các vị trí: 2, 6.        
        */
    }
}
