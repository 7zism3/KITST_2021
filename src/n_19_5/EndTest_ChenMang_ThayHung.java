package n_19_5;

public class EndTest_ChenMang_ThayHung {
        public static void main(String args[]) {
            int[] a = new int[10];
            a[0] = 1;
            a[1] = 2;
            a[2] = 5;
            a[3] = 8;
            a[4] = 20;
            a[5] = 50;
            //a ={ 1, 2, 5, 8, 20, 50 ,0 ,0, 0,  0}
            int[] x = { 3, 4, 15, 60 };
            // lấy từng phần tử của x
            int i=0;  int j=0; int n=6;int m=4;
            int cuoi=0;
            while (i<x.length) {
                while (j<=n-1 ) {
                    if (a[j]<=x[i]) j++;
                    else break;
                }// j=0;
                while ((cuoi<=m-1) && (x[cuoi]<a[j])) cuoi++;
                // đoạn cần chèn: i, cuoi-1; doan can dich: size=cuoi-i;
                int size=cuoi-i;
                // n-1 đến j == sang phải size vị trí;
                int t=n-1;
                while ((size>0) && (t>=j)) {a[t+size]=a[t];t--;}
                // chèn đoạn x[ i, cuoi-1];
                for (t=j;t<j+size;t++) {a[t]=x[i];i++;}
                j=j+size+1;
                n=n+size;
                i=cuoi;
                if (j>n-1) break;
            }
            /// chèn nốt vào bên phải;  ....
            for (  i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }


}
