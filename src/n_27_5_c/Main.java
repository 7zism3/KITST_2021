package n_27_5_c;

import java.util.Arrays;

public class Main {

    int[] A;

    public Main(int[] A) {
        this.A = A;
    }

    public Main(int N) {
        A = new int[N];
    }

    @Override
    public String toString() {
        return Arrays.toString(A);
    }

    public static void main(String[] args) {
        Main[] arrObj = new Main[5];
        for (int i = 0; i < arrObj.length; i++) {
            int x = (int) (Math.random() * 10);
            arrObj[i] = new Main(
                    new int[]{x, 10 * x, 20 * x});
        }

        for (int i = 0; i < arrObj.length; i++) {
            System.out.println(arrObj[i]);
        }
        /*
        Hãy lập trình:
        3.1. Tìm và in ra các mảng có tổng lớn nhất cùng vị trí
              xuất hiện của nó trong arrObj
        3.2. Sắp xếp arrObj theo tổng giá trị tăng dần.
              (từ làm--ko dùng đến Collection
        */
        //Câu 3.1
        int i_arr = -1;
        int max = 0;

        int[] kq = new int[arrObj.length];
        int[] sumH = new int[arrObj.length];
        int i_kq = 0;

        for (Main m : arrObj) {
            i_arr++;
            int max_temp = 0;
            for (int x : m.A) {
                max_temp += x;
            }
            sumH[i_arr] = max_temp;  //Lưu vào mảng tổng để tính câu 2

            if (max_temp == max) {
                i_kq += 1;
                kq[i_kq - 1] = i_arr;
            } else if (max_temp > max) {
                max = max_temp;
                i_kq = 1;
                kq[i_kq - 1] = i_arr;
            }
        }
        //
        System.out.println("Mảng có tổng lớn nhất = " + max + " gồm các mảng sau: ");
        for (int j = 0; j < i_kq; j++) {
            System.out.println("Mảng " + kq[j]);

            System.out.println(arrObj[kq[j]]);
        }

        //Câu 3.2

        int maxHang = 0;
        int z = arrObj[0].A.length;
        Main temp = new Main(z);
        int temp_sum;

        boolean isSort = true;
        for (int i = 0; i < arrObj.length - 1; i++) {
            for (int j = 0; j < arrObj.length - i - 1; j++) {
                if (sumH[j] > sumH[j + 1]) {
                    //Đổi chỗ mảng
                    temp = arrObj[j];
                    arrObj[j] = arrObj[j + 1];
                    arrObj[j + 1] = temp;
                    //Đổi chỗ Sum - Nhớ đổi chỗ Sum
                    temp_sum = sumH[j];
                    sumH[j] = sumH[j + 1];
                    sumH[j + 1] = temp_sum;

                    isSort = false;

//                    System.out.println("-" + arrObj[j]);
                }
            }
            if (isSort) break;
        }

        System.out.println();
        System.out.println("Sau khi sắp xếp: ");
        for (Main m : arrObj) {
            System.out.println(m);
        }
    }
}