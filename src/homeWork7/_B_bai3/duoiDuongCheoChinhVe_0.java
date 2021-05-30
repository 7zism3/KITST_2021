package homeWork7._B_bai3;

public class duoiDuongCheoChinhVe_0 {
    public static void main(String[] args) {
        //Tạo 1 ma trận vuông để Test
        int n = 3;
        int a[][] = new int[][]{{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int b[][] = new int[n * 2][n * 2];
        //Tao ma tran lien ket.-----------------------------------------------------
        for (int i = 0; i < n; i++)
            for (int j = n; j < n * 2; j++) {
                if (i == (j - n)) b[i][j] = 1;
                else b[i][j] = 0;
            }


        //Biến đổi ma trận vuông thành ma trận tam giác trên (dưới đưuofng chéo chính về 0.
        for (int j = 0; j < n; j++) {
            for (int i = n - 1; i >= j; j--) {
                if (b[i][j] == 0) continue;
                if (i > j) {
                }
            }
        }
    }
}
