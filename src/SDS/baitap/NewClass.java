
public class NewClass {

    public static void main(String[] args) {
        int[] A = {1, 5, 9, 4, 1, 3, 5, 1, 4, 5};
        int end = 0;
        int[] ends = new int[A.length]; //
        int dem = 1;
        int max = 1;
        int cnt = 1;//
        ends[cnt - 1] = 0;//kết thúc
        int i;
        for (i = 1; i <= A.length - 1; i++) {
            if (A[i - 1] < A[i]) {
                dem++;
            } else {
                if (max < dem) {
                    max = dem;// độ dài
                    cnt = 1;//
                    ends[cnt - 1] = i - 1;//kết thúc
                } else if (max == dem) {
                    cnt++;
                    ends[cnt - 1] = i - 1;//kết thúc
                }
                dem = 1;
            }
        }
        if (max < dem) {
            max = dem;// độ dài
            cnt = 1;//
            ends[cnt - 1] = A.length - 1;//kết thúc
        } else if (max == dem) {
            cnt++;
            ends[cnt - 1] = A.length - 1;//kết thúc
        }
        System.out.println("Dãy con tăng dần dài nhất là:");
        for (i = 0; i < cnt; i++) {
            for (int j = ends[i] - max + 1; j <= ends[i]; j++) {
                System.out.print(A[j] + " ");
            }
            System.out.println("");
        }
    }
}

// 1, 5, 9; 
// 1, 3, 5; 
// 1, 4, 5.
