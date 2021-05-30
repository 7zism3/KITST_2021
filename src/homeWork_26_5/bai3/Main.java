package homeWork_26_5.bai3;

import homeWork_24_5.bai1.Book;

import java.util.HashSet;
import java.util.List;

public class Main {
    private static void xuatRaMH(HashSet<Book> listSetBook) {
        for (Book book : listSetBook
        ) {
            System.out.println(book.getBookNo() + " " + book.getName() + " " + book.getPrice() + " " + book.getCategory());
        }

    }

    public static void main(String[] args) {
        HashSet<Book> listSetBook = new HashSet<>();
        //Khởi tạo
        homeWork_24_5.bai1.Book b1 = new homeWork_24_5.bai1.Book("003", "Tin Hoc", 100000, "SGK");
        listSetBook.add(b1);
        homeWork_24_5.bai1.Book b2 = new homeWork_24_5.bai1.Book("002", "Van Hoc", 50000, "SGK");
        listSetBook.add(b2);
        homeWork_24_5.bai1.Book b3 = new homeWork_24_5.bai1.Book("001", "Nha Gia Kim", 120000, "Van Hoc");
        listSetBook.add(b3);
        homeWork_24_5.bai1.Book b4 = new Book("004", "Thuy Hu", 12000, "Van Hoc");
        listSetBook.add(b4);
        listSetBook.add(b4); //Thử add 2 lần b4
        //In ra list Set Bock
        xuatRaMH(listSetBook); //Sau khi xuất k thấy b4 xuất hiện 2 lần như ArrayList

        //3.1 Thực hiện tìm kiếm một phần tử sử dụng method contains;
        System.out.print("Tìm kiếm b1 có tồn tại trong list: ");
        boolean temp = listSetBook.contains(
                new Book("004", "Thuy Hu", 12000, "Van Hoc") );
        //3.2 Sử dụng method clone() để nhân bản một HashSet;

        HashSet<Book> cloneListSetBook = new HashSet<>();
        cloneListSetBook = (HashSet<Book>) listSetBook.clone();
        System.out.println("List Set clone: ");
        xuatRaMH(cloneListSetBook);
    }
}
