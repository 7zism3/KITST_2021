package homeWork7._A_bai4;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        //Nhận 1 mảng Học sinh
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhập vào N là số HS: ");
        int n = scn.nextInt();
        scn.nextLine();
        ArrayList<HocSinh> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập Thông tin HS " + (1 + i) + " : ");
            System.out.print("Tên: ");
            String temp_hoTen = scn.nextLine();
            System.out.print("Ngày sinh: ");
            String temp = scn.nextLine();
            Date temp_ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(temp);
            System.out.print("Địa chỉ: ");
            String temp_diaChi = scn.nextLine();
            HocSinh temp_hs = new HocSinh(temp_hoTen, temp_ngaySinh, temp_diaChi);
            list.add(temp_hs);
        }

        //Ghi Object vào file
        try {   // dat try cacth de tranh ngoai le khi tao va viet File
            FileOutputStream f = new FileOutputStream("student.txt"); // tao file f tro den student.dat
            ObjectOutputStream oStream = new ObjectOutputStream(f); // dung de ghi theo Object vao file f
            oStream.writeObject(list); // ghi Student theo kieu Object vao file
            oStream.close();
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file");
        }

        //Đọc Object từ file
        ArrayList<HocSinh> list2 = new ArrayList<>();
        try {   // dat try cacth de tranh ngoai le khi tao va doc File
            FileInputStream f = new FileInputStream("student.txt"); // tao file f tro den student.dat
            ObjectInputStream inStream = new ObjectInputStream(f);  // dung de doc theo Object vao file f
            // dung inStream doc theo Object, ep kieu tra ve la MyStudent
            list2 = (ArrayList<HocSinh>) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file");
        }


        //Sắp xếp
        HocSinh temp;
        for (int i = 0; i < n - 1; i++) {
            boolean isSort = true;
            for (int j = i ; j < n - i - 1; j++) {
                if (list2.get(j).hoTen.compareTo(list2.get(j+1).hoTen) > 0) {
                    temp = list2.get(j);
                    list2.set(j, list2.get(j+1));
                    list2.set(j+1, temp);
                    isSort = false;
                }
            }
        }
        //Ghi lại
        try {   // dat try cacth de tranh ngoai le khi tao va viet File
            FileOutputStream f = new FileOutputStream("student2.txt"); // tao file f tro den student.dat
            ObjectOutputStream oStream = new ObjectOutputStream(f); // dung de ghi theo Object vao file f
            oStream.writeObject(list2); // ghi MyStudent theo kieu Object vao file
            oStream.close();
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file");
        }


        //In ra
        //Đọc Object từ file
        list2 = new ArrayList<>();
        try {
            // dat try cacth de tranh ngoai le khi tao va doc File
            FileInputStream f = new FileInputStream("student2.txt"); // tao file f tro den student.dat
            ObjectInputStream inStream = new ObjectInputStream(f);  // dung de doc theo Object vao file f
            // dung inStream doc theo Object, ep kieu tra ve la MyStudent
            list2 = (ArrayList<HocSinh>) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file");
        }

        System.out.println("Danh sách sau sắp xếp : ");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println("Tên: " + list2.get(i).hoTen);

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("Ngày sinh: " + formatter.format(list2.get(i).ngaySinh));
            System.out.println("Địa chỉ: " + list2.get(i).diaChi);
        }
    }
}
