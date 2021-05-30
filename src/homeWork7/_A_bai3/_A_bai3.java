package homeWork7._A_bai3;

import java.io.*;
import java.util.Scanner;

public class _A_bai3 {

    public static void writeFileDataStream(int[] a, String dataFile) throws FileNotFoundException, IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
        out.writeInt(a.length);
        for (int i = 0; i < a.length; i++) {
            try {
                out.writeInt(a[i]);
            } catch (IOException ex) {
            }
        }
        out.close();
    }

    public static int[] readFileDataStream(String dataFile) throws FileNotFoundException, IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream
                (new FileInputStream(dataFile)));

        int[] a_temp = new int[0];
        try {
            int n = in.readInt();
            a_temp = new int[n];
            for (int i = 0; i < n; i++) {
                a_temp[i] = in.readInt();
            }
        } catch (IOException ex) {
            in.close();
        }
        return a_temp;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập vào N: ");
        int n = scn.nextInt();
        System.out.println("Nhập vào các phần tử của mảng: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        //Ghi ra file "output.txt"
        try {
            writeFileDataStream(a, "output.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi ghi dữ liệu");
        }

        //Sắp xếp
        int temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            boolean isSort = true;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isSort = false;
                }
            }
            if (isSort) break;
        }
        //Ghi vào file "output2.txt"
        try {
            writeFileDataStream(a, "output2.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi ghi dữ liệu");
        }

        //Đọc từ file "output2.txt"
        int[] b = new int[0];
        try {
            b = readFileDataStream("output2.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Lỗi đọc dữ liệu");
        }


        System.out.println("Mảng sau khi xắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }


    }
}
