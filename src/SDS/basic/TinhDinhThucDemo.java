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
public class TinhDinhThucDemo {
    public static void main(String[] args) {
//        double a[][] = {{1, -3, 0, 2},
//                         {-2, 5, 3, -1}, //heso=(-1)*(-2)/(1)   //A[col[col]
//                         {2, -4, -1, 5},
//                         {3, -7, 4, 2}};
        double a[][] = {{0, -2, 5},
                        {0,  2, 3}, //heso=(-1)*(-2)/(1)   //A[col[col]
                        {0, 1, 2}};
         int N=a.length, dau=1;
         for (int col=0; col<=N-2; col++){  
            for (int row=col+1;row<N;row++){
                double heso=(-1)*a[row][col]/a[col][col];//
                for (int col2=col;col2<N;col2++)
                    a[row][col2]+=a[col][col2]*heso;
            }          
         }
        // System.out.println(Arrays.deepToString(a));
         double dt=1;
           for (int i=0;i<N;i++) {
               dt*=a[i][i];
               System.out.println(Arrays.toString(a[i])); 
           }
           System.out.println("Gia tri cua DT="+dt*dau );
    }
}
