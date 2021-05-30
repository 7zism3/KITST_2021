package n_24_5;

public class Test {
    public static void main(String args[]) {
        int[] a = new int[10];
        a[0] = 100;
        a[1] = 80;
        a[2] = 60;
        a[3] = 50;
        a[4] = 20;
        a[5] = 10;

        int[] x = {102, 45, 44, 5};
        int n = a.length;
        int m = x.length;
        int temp = n - m;

        int j = 0;
        for (int i = 0; i < temp; i++) {
            int i_a = -1;
            int dem = 0;
            while (j < m && x[j] > a[i]) {
                i_a = i;
                dem++;
                j++;
            }
            if (dem != 0) {
                //Đẩy về cuối
                for (int k = temp - 1; k >= i; k--) {
                    a[k + dem] = a[k];
                }
                //Tăng độ dài mảng a sau thêm
                temp = temp + dem;
                //Chèn vào giữa
                for (int k = i_a; k < k + dem; k++) {
                    a[k] = x[j - dem];
                    dem--;
                }
            }
            if (j == temp) break;
        }

        //Nếu còn phần tử nhỏ hơn tất cả phần tử dãy X, chèn vào cuối
        if (temp < n) {
            for (int i = temp; i < n; i++) {
                a[i] = x[j];
                j++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }


}
