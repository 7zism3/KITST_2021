package n_21_5;

import java.util.Arrays;

public class Test_LeTuanAnh_selectSort {
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

        int[] A = {12, 1, 4, 5, 10, 3, 11, 8, 7};
        int n = A.length;

        //Thuật toán sx chọn
        for (int i = 0; i < n - 1; i++) {

            if (A[i] % 2 != 0) {
                int min = i;
                for (int j = i + 1; j < n; j++) {
                    if (A[j] % 2 != 0) {
                        if (A[j] < A[min]) {
                            min = j;
                        }
                    }
                }
                int temp = A[min];
                A[min] = A[i];
                A[i] = temp;
            }

        }
        System.out.println(Arrays.toString(A));
    }
}
