package n_19_5;

public class EndTest_ChenMang_VuHongThai {

        public static void main(String args[]) {
            int[] a = new int[10];
            a[0] = 1;
            a[1] = 2;
            a[2] = 5;
            a[3] = 8;
            a[4] = 20;
            a[5] = 50;

            int[] x = {3, 4, 9, 100};
            int n = a.length - 4;
            int j = 0;
            for (int i = 0; i < n; i++) {
                int start = -1;
                int end = -1;
                int dem = 0;
                while (j < 4 && x[j] <= a[i]) {
                    start = i;
                    dem++;
                    end = start + dem;
                    j++;
                }
                if (start != -1) {
                    for (int k = n - 1; k >= i; k--) {
                        a[k + dem] = a[k];
                    }
                    n = n + dem;
                    for (int h = start; h < end; h++) {
                        a[h] = x[j - dem];
                        dem--;
                    }
                }
                if (j == 4) break;
            }
            if (n < 10) {
                for (int i = n; i < 10; i++) {
                    a[i] = x[j];
                    j++;
                }
            }

            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }


    }
