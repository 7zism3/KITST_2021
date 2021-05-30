package n_27_5;

import java.util.Arrays;

public class TinhDinhThuc {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // heso=(-1)*(-2)/(1) //A[col[col]
        double a[][] = {{1, -2, 5}, {1, 2, 3}, // heso=(-1)*(-2)/(1) //A[col[col]
                {3, 1, 2}};
        int N = a.length, dau = 1;
        for (int col = 0; col <= N - 2; col++) {
            for (int row = col + 1; row < N; row++) {
                double heso = (-1) * a[row][col] / a[col][col];
                for (int col2 = col; col2 < N; col2++)
                    a[row][col2] += a[col][col2] * heso;
            }
        }
//		int col =0;
//		int row = col+1;
//		while (col<=N-2) {
//			while (row < N) {
//				double heso = (-1) * a[row][col] / a[col][col];
//				int col2 = col;
//				while(col2<N) {
//					a[row][col2] += a[col][col2] * heso;
//					col2++;
//				}
//				row++;
//			}
//			col++;
//		}


// System.out.println(Arrays.deepToString(a));
        double dt = 1;
        for (int i = 0; i < N; i++) {
            dt *= a[i][i];
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println("Gia tri cua DT=" + dt * dau);
    }

}
