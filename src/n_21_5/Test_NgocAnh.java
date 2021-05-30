package n_21_5;

public class Test_NgocAnh {
    public static void main(String args[]) {

        int[] A = {12, 1, 4, 5, 10, 3};

        int tmp;
        int[] sortedOdds = new int[A.length];

        for (int j = 0; j < A.length - 1; j++) {
            for (int x = 0; x < A.length - 1; x++) {

                //Xác định phần tử lẻ đầu tiên
                while (A[x] % 2 == 0 && x < A.length - 1) {
                    x++;
                }

                int y = x + 1;
                if (y < A.length) {
                    //Xác định phần tử lẻ thứ 2
                    while (A[y] % 2 == 0 && y < A.length - 1) {
                        y++;
                    }
                    //So sánh a[x] va a[y]
                    if (A[x] > A[y] && A[y] % 2 == 1 && A[x] % 2 == 1) {
                        tmp = A[x];
                        A[x] = A[y];
                        A[y] = tmp;
                        sortedOdds = A;
                    }
                }
            }
        }

        for (int i : sortedOdds) {
            System.out.println(i);
        }
    }
}

