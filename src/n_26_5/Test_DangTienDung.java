package n_26_5;

public class Test_DangTienDung {

    public static void main(String[] args) {
        int[][] A = {{10, 1, 4, 6, 10, 10, 7}, {5, 1, 4, 6, 10, 10, 7}, {8, 1, 10, 6, 10, 10, 7}};

        int[] maxA = new int[A.length];
        int maxASz = 0;
        int maxVal = A[0][0];
        int maxCnt = 0;

        for (int i = 0; i < A.length; i++) {
            int maxCntTemp = 0;
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == maxVal) {
                    maxCntTemp += 1;
                }
                if (A[i][j] > maxVal) {
                    maxVal = A[i][j];
                    maxCntTemp = 1;
                    maxCnt = 0;
                }
            }
            if (maxCntTemp == maxCnt) {
                maxASz += 1;
                maxA[maxASz - 1] = i;
            }
            if (maxCntTemp > maxCnt) {
                maxCnt = maxCntTemp;
                maxASz = 1;
                maxA[maxASz - 1] = i;
            }
        }

        System.out.println("Cac dong co so phan tu lon nhat la:");
        for (int i = 0; i < maxASz; i++) {
            System.out.print("Dong " + maxA[i] + ": ");
            for (int j = 0; j < A[maxA[i]].length; j++) {
                System.out.print(A[maxA[i]][j] + " ");
            }
            System.out.println();
        }
    }
}
