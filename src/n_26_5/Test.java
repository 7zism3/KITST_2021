package n_26_5;

public class Test {
    public static void main(String[] args) {
        int[][] a = {{2, 3, 4, 5, 6, 7, 10},
                {1, 2, 4, 5, 7, 8, 9},
                {1, 3, 4, 5, 11, 11, 9},
                {10, 0, 1, 3, 4, 11, 11},
                {1, 2, 3, 4, 5, 5, 5}
        };

        int n = a.length;
        int m = a[0].length;

        int kq[] = new int[n];
        int max = a[0][0];
        int soLuongMax_Hang = 1;
        for (int i = 0; i < n; i++) {
            int soLuongMax = 0;
            for (int j = 0; j < m; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    soLuongMax = 1;
                    soLuongMax_Hang = 1;
                } else if (a[i][j] == max) {
                    soLuongMax++;
                }
            }
            if (soLuongMax > soLuongMax_Hang){
                for (int j = 0; j < i; j++) {
                    soLuongMax_Hang =soLuongMax;
                    kq[j] = 0;
                }
                kq[i] = 1;
            } else if (soLuongMax == soLuongMax_Hang) {
                kq[i] = 1;
            }
        }
        //In ra kết quả

        System.out.println("Phần tử lớn nhất là: "+ max+ " _ Số lượng lớn nhất 1 hàng là: "+ soLuongMax_Hang);
        System.out.println("Hàng có nhiều phần tử lớn nhất là: ");

        for (int i = 0; i < n; i++) {
            if (kq[i] == 1){
                System.out.println("Hàng: "+ i);
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j]+ " ");
                }
                System.out.println();
            }
        }

    }
}
