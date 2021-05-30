/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hung
 */
public class AA {

    public static void main(String[] args) {
         int n; 
        int[] a = {12, 5, 3, 4, 5, 67,1,2,1,2,1,2, 5, 10};
        n = a.length;
        int x=5;
        int dem = 0;
        int khoangCach = 0;
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x && dem == 0) {
                dem++;
                temp1 = i;//
            } else if (a[i] == x && dem > 0) {
                khoangCach = i - temp1;
                if (khoangCach > temp2) {
                    temp2 = khoangCach;
                }  
              //  dem = 0;//reset
                temp1 = i;
            }
        }
        if (temp2 != 0) {
            System.out.println(temp2);
        } else {
            System.out.println("Vô cùng");
        }
    }

    public static void main2(String[] args) {
        int[] a = {12, 11, 5, 4, 11, 5, 6, 5, 7, 10, 11, 12};
        int x = 11;
        int max = -1;
        int vt = -1;
        int vttruoc = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                vttruoc = vt;
                vt = i;
                int s = vt - vttruoc;
                if (vttruoc >= 0 && max <= s)// 
                {
                    max = s;
                }
            }
        }
        if (max < 0) {
            System.out.println("Vo cung");
        } else {
            System.out.println(max);
        }
    }

    public static void main1(String[] args) {
        int n;

        int[] a = {12, 5, 3, 4, 5, 67, 5, 10};
        n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int x = 40;
        int vt = -1;// vo cùng bé
        int max = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) { // (1) -- trước đấy đã xuất hiện x chưa?
                if (vt >= 0) { // đã xuất hiện rồi
                    if (max < i - vt) {
                        max = i - vt;
                    }
                }
                vt = i;
            }
        }
        if (max > 0) {
            System.out.println(max);
        } else {
            System.out.println("duong vo cung");
        }
    }
}
