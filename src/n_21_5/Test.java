package n_21_5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập n ");
//        int n = scanner.nextInt();
//        //Nhập mảng A
//        System.out.println("Nhập mảng B");
//        int a[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = scanner.nextInt();
//        }

        int a[] = new int[6];
        a[0] = 9;
        a[1] = 10;
        a[2] = 1;
        a[3] = 7;
        a[4] = 8;
        a[5] = 5;
        int n = 6;

        //Thuật toán sx nổi bọt
        boolean isSort = false;
        for (int i = 0; i < n - 1; i++) {
            isSort = false;
            for (int j = 0; j < n - i; j++) {
                //Số lẻ đầu tiên là A[j]
                if (a[j] % 2 == 1) {
                    //Số lẻ thứ 2 là A[k]
                    for (int k = j + 1; k < n - i; k++) {
                        if (a[k] % 2 == 1) {
                            if (a[j] > a[k]) {
                                int temp = a[j];
                                a[j] = a[k];
                                a[k] = temp;
                                isSort = true;
                            }
                            //Tìm đc số lẻ thứ 2 sẽ dừng lại luôn
                            break;
                        }
                    }
                }
            }
            if (isSort == false) {
                break;
            }
        }

        //In ra
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+ " ");
        }


    }
}
