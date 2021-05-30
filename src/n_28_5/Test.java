package n_28_5;

public class Test {
    public static void main(String[] args) {
        String[] ST = {"Xác định aaaaaaaaaaa xem ma trận X có xuất aaaaaaaaaaa hiện trong ma trận A hay không"
                , "Đếm số lần  aaaaaaaaaaa xuất hiện của X trong A"};

        int n = ST.length;
        int doDai_chuMax = 0;
        int dem = 0;

        char x = ' ';
        char y = '.';
        char z = ',';

        String kq = ""; //Lưu vị trí xuất hiện trên String

        for (int i = 0; i < n; i++) {
            String xau = ST[i];
            int i_xau = 0;
            int doDai_chu = 0;
            while (i_xau < xau.length()) {
                if ((xau.charAt(i_xau) != x) && (xau.charAt(i_xau) != y) && (xau.charAt(i_xau) != z)) {
                    doDai_chu++;
                } else {
                    if (doDai_chu == doDai_chuMax) {
                        dem++;
                        kq = kq + "\n" + String.valueOf(i) + " " + String.valueOf(i_xau - doDai_chuMax + 1);
                    } else if (doDai_chu > doDai_chuMax) {
                        //Đổi doDai_chuMax
                        doDai_chuMax = doDai_chu;
                        //Lưu vị trí
                        dem = 1;
                        kq = String.valueOf(i) + " " + String.valueOf(i_xau - doDai_chuMax + 1);
                    }
                    doDai_chu = 0;
                }
                i_xau++;
            }
        }
        System.out.println("Độ dài chữ lớn nhất của trong Mảng là: " + doDai_chuMax);
        System.out.println("Gồm có: " + dem + " chữ với các vị trí xuất hiện sau: \n" + kq);
    }
}
