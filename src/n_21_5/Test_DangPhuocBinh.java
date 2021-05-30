package n_21_5;

public class Test_DangPhuocBinh {

    public static void main(String[] args) {
        int[] A = {13, 6, 15, 9, 3, 11, 0, 2};
        int dem = 0;
        int start = 0, end = A.length - 1;
        while (A[start] % 2 == 0) start++;    //A[start] la so le dau tien
        while (A[end] % 2 == 0) end--;        //A[end] la so le cuoi cung
        if (end <= start) return;
        for (int i = start; i <= end; i++) {
            int curr = start;
            System.out.println(dem);
            for (int j = start + 1; j <= end - dem; j++) {
                if ((A[j] % 2 == 1) && (A[curr] > A[j])) {
                    int tmp = A[j];
                    A[j] = A[curr];
                    A[curr] = tmp;
                    curr = j;
                } else if (A[j] % 2 == 1) curr = j;
            }
            dem++;
        }
        for (int i = 0; i < A.length; i++) System.out.print(A[i] + " ");
    }
}