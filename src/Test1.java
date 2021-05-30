
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Nhập vào chuỗi bất kỳ: ");
        String chuoi;
        chuoi = scanner.nextLine();
        chuoi += " ";
        int max, i, doDaiChuoi;
        max = 0;
        i = 0;
        doDaiChuoi = chuoi.length();

        int temp = 0;
        while (i < doDaiChuoi - 1) {
//            System.out.println(chuoi);
            System.out.print(chuoi.substring(i, 2 )+ " ");
            if (!chuoi.substring(i, 1).equals(" ")) {
                temp++;
            } else {
                if (temp > max) {
                    max = temp;
                }
                temp = 0;
            }
            i++;
        }

        i = 0;
        temp = 0;
        while (i < doDaiChuoi) {
            if (chuoi.substring(i, 1).equals(" ")) {
                if (temp == max) {
                    System.out.println(chuoi.substring(i - max + 1, max));
                    temp = 0;
                }
            } else {
                temp++;
            }
            i++;
        }
    }
}


