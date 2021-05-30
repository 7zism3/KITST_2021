package n_27_5;

import java.util.Arrays;


public class Test {


    static double gtDinhThuc_DeQuy(double[][] a) {
        //Nếu là MaTran 2*2
        int n = a.length;
        if (n == 2) return a[0][0] * a[1][1] - a[0][1] * a[1][0];
        else {
            //Tạo ra 4 mảng con vs kích thước (n-1)*(n-1);

            double a1[][] = new double[n - 1][n - 1];
            double a2[][] = new double[n - 1][n - 1];
            double a3[][] = new double[n - 1][n - 1];
            double a4[][] = new double[n - 1][n - 1];
            a1 = xoaDongCot(a, n - 1, n - 1);
            a3 = xoaDongCot(a, 0, 0);
            a2 = xoaDongCot(a, n - 1, 0);
            a4 = xoaDongCot(a, 0, n - 1);
            System.out.println();
            for (int i = 0; i < n - 1; i++) {
                System.out.println(Arrays.toString(a1[i]));
            }

            double kq = gtDinhThuc_DeQuy(a1) * gtDinhThuc_DeQuy(a3)
                    - gtDinhThuc_DeQuy(a2) * gtDinhThuc_DeQuy(a4);
            return kq;
        }
    }

    static double[][] xoaDongCot(double[][] a, int dl, int cl) {
        int n = a.length;
        double x2[][] = new double[n - 1][n - 1];
        int i_temp = 0;
        for (int i = 0; i < n; i++) {
            if (i == dl) continue;
            int j_temp = 0;
            for (int j = 0; j < n; j++) {
                if (j == cl) continue;
                x2[i_temp][j_temp] = a[i][j];
                j_temp++;
            }
            i_temp++;
        }
        return x2;
    }

    public static void main(String[] args) {
        double x[][] = {{1, 2, 0, 3},
                {1, -5, 3, 4},
                {0, -5, 3, 4},
                {0, -7, 2, 11}};
//                {5, 10, 7, 3, 4, 4, 5},
//                {5, -1, 7, 13, 4, 4, 5},
//                {5, 1, -67, 33, 4, 4, 5},};

        int n = x.length;

        //Bước 1 xóa dòng dl, cột cl;
        int dl = 0;
        int cl = 1;
        double x2[][] = new double[n - 1][n - 1];
        x2 = xoaDongCot(x, dl, cl);

        //Hiển thị ma trận X2 để kiểm tra bước 1
        System.out.println("Ma trận sau xóa: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.println(Arrays.toString(x2[i]));
        }


        //Bước 2 tính định thức x2
        int n_x2 = n - 1;
        //Cách của em
        System.out.println("Giá trị định thức cách đệ quy là: " + gtDinhThuc_DeQuy(x2));

        //Cách tham khảo bài chữ của thầy từ các bạn
        int dau = 1; //Dấu chiều Ma trận
        for (int col = 0; col <= n_x2 - 2; col++) {
            for (int row = col + 1; row < n_x2; row++) {
                double heSo = (-1) * x2[row][col] / x2[col][col];
                for (int col2 = col; col2 < n_x2; col2++)
                    x2[row][col2] += x2[col][col2] * heSo;
            }
        }

        System.out.println("Ma trận sau khi biến đổi về Ma trận đường chéo: ");
        double gtDinhThuc = 1;
        for (int i = 0; i < n_x2; i++) {
            gtDinhThuc = gtDinhThuc * x2[i][i];
            System.out.println(Arrays.toString(x2[i]));
        }
        System.out.println("Giá trị định thức là: " + gtDinhThuc * dau);
    }
}

