package n_19_5;

public class EndTest_ChenMang {

    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập m và k");
//        int m = scanner.nextInt();
//        int k = scanner.nextInt();
//
//        //Nhập mảng A
//        int a[] = new int[m];
//        for (int i = 0; i < m; i++) {
//                a[i] = scanner.nextInt();
//        }
//
//        //Nhập mảng X
//        System.out.println("Nhập mảng B");
//        int x[] = new int[k];
//        for (int i = 0; i < k; i++) {
//            x[i] = scanner.nextInt();
//        }


        int a[] = new int[10];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 7;
        a[4] = 8;
        a[5] = 10;
        int x[] = {4, 5, 6, 9};
        int m = 10;
        int k = 4;


        int mangTam[] = new int[m];
        //Thực hiện
        int i_x = 0;
        int i_mangTam = 0;
        for (int i = 0; i < m - k; i++) {
            if (i_x < k) {
                while (true) {
                    if (x[i_x] < a[i]) {
                        mangTam[i_mangTam] = x[i_x];
                        i_mangTam++;
                        i_x++;
                    } else {
//                        if () {
//                        } else {
                            mangTam[i_mangTam] = a[i];
                            i_mangTam++;
                            break;
//                        }
                    }
                }
            } else {
                mangTam[i_mangTam] = a[i];
                i_mangTam++;
            }
        }
        for (int i = 0; i < m; i++) {
            a[i] = mangTam[i];
            System.out.println(a[i] + " ");
        }
    }
}
