package homeWork_26_5.bai4;

import homeWork_24_5.bai1.Book;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    private static void xuatRaMH(TreeSet<Book> listTreeSetBook) {
        for (Book book : listTreeSetBook
        ) {
            System.out.println(book.getBookNo() + " " + book.getName() + " " + book.getPrice() + " " + book.getCategory());
        }

    }

    public static void main(String[] args) {
        TreeSet<Book> listTreeSetBook = new TreeSet<>();
        //Khởi tạo
        Book b1 = new Book("003", "Tin Hoc", 100000, "SGK");
        listTreeSetBook.add(b1);
        Book b2 = new Book("002", "Van Hoc", 50000, "SGK");
        listTreeSetBook.add(b2);
        Book b3 = new Book("001", "Nha Gia Kim", 120000, "Van Hoc");
        listTreeSetBook.add(b3);
        Book b4 = new Book("004", "Thuy Hu", 12000, "Van Hoc");
        listTreeSetBook.add(b4);
        listTreeSetBook.add(b4); //Thử add 2 lần b4
        //In ra list Set Bock
        xuatRaMH(listTreeSetBook); //Sau khi xuất k thấy b4 xuất hiện 2 lần như ArrayList

        //3.1 Thực hiện tìm kiếm một phần tử sử dụng method contains;
        System.out.print("Tìm kiếm b1 có tồn tại trong list: ");
        System.out.println(listTreeSetBook.contains(b1));

        //3.2 Sử dụng method clone() để nhân bản một HashSet;

        TreeSet<Book> cloneListTreeSetBook = new TreeSet<>();
        cloneListTreeSetBook = (TreeSet<Book>) listTreeSetBook.clone();
        System.out.println("List Set clone: ");
        xuatRaMH(cloneListTreeSetBook);
    }
}
