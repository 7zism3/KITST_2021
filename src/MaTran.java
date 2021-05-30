import java.util.Scanner;

public class MaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int x[][] = new int[p][q];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                x[i][j] = scanner.nextInt();
            }
        }

        //Hiển thị lại để kiểm tra mảng nhập vào
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }

        if (((p > m) || (q > n))) {
            System.out.println("Mảng X không tồn tại trong A");
            return;
        }

        int soLanXuatHien = 0;

        for (int i = 0; i < m - p + 1; i++) {
            for (int j = 0; j < n - q + 1; j++) {
                //So sánh 2 ma trận
                boolean temp = true;
                outerloop:
                for (int k = 0; k < p; k++) {
                    for (int l = 0; l < q; l++) {
                        if (a[k + i][l + j] != x[k][l]) {
                            temp = false;
                            break outerloop;
                        }
                    }
                }
                if (temp) {
                    soLanXuatHien = soLanXuatHien + 1;
                }
            }

        }
        System.out.println("Mảng X xuất hiện " + soLanXuatHien + " lần");
    }
}
