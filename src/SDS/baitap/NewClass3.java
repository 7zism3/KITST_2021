/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Hung
 */
public class NewClass3 {
    public static void main(String[] args) {
         int N=5;
       int [] A = new int[N];
       Scanner sc= new Scanner(System.in);
       for (int i=0;i<N;i++) {
        // System.out.print("A[" +i+"]=");
         A[i]= sc.nextInt();
         }
      
        
         
      int [] A1={8, 12, 13, 29, 50};
      int i=0;
      
        for ( i=0;i<N-1;i++) { 
           System.out.print(A1[i] +", ");
        
         }  
	  System.out.print(A1[i] +";");	   
    }
}
