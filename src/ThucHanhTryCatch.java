import java.util.Scanner;

public class ThucHanhTryCatch {
    public static void main(String[] args) throws Exception {
        boolean temp = false;
        int tuoi = 0;

        System.out.println("Hãy nhập vào tuổi: ");
        while (!temp) {
            try {
                Scanner scn = new Scanner(System.in);
                tuoi = scn.nextInt();
                temp = true;
            } catch (Exception ex) {
                throw new Exception();
            }
            finally {
                if (temp) {
                    System.out.print("Tuổi của bạn là: ");
                } else {
                    System.out.println("Hãy nhập đúng định dạng!");
                }

            }
        }
        System.out.print(tuoi);
    }

}
