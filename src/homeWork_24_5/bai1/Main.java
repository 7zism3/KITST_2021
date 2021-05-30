package homeWork_24_5.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    private static void xuatRaMH(List<Book> listBook) {
        for (Book book : listBook
        ) {
            System.out.println(book.getBookNo() + " " + book.getName() + " " + book.getPrice() + " " + book.getCategory());
        }

    }

    public static void main(String[] args) {
        List<Book> listBook = new ArrayList<>();
        //Khởi tạo
        Book b1 = new Book("003", "Tin Hoc", 100000, "SGK");
        listBook.add(b1);
        Book b2 = new Book("002", "Van Hoc", 50000, "SGK");
        listBook.add(b2);
        Book b3 = new Book("001", "Nha Gia Kim", 120000, "Van Hoc");
        listBook.add(b3);
        Book b4 = new Book("004", "Thuy Hu", 12000, "Van Hoc");
        listBook.add(b4);

        //1.1 Thực hiện tìm kiếm một phần tử sử dụng method contains;
        System.out.print("Tìm kiếm b1 có tồn tại trong list: ");
        System.out.println(listBook.contains(b1));
        //1.2 Sử dụng Arrays.sort(…) để sắp xếp theo nhiều tiêu chuẩn khác nhau;
        System.out.println("List book sau khi sắp xếp theo giá tăng dần: ");
        listBook.sort(Book::compareTo);
        xuatRaMH(listBook);
        System.out.println("List book sau khi sắp xếp theo mã giảm dần: ");
        Collections.sort(listBook, new Book.SortByNoASC());
        xuatRaMH(listBook);

        //1.3 Sử dụng Collections.copy(…) để copy sang một array list khác;
        List<Book> listBook2 = new ArrayList<>(listBook.size()); //Chỉ cho ra vùng nhớ sẽ dùng
        //Phải thêm bằng đó phần tử để kích thước list tăng
        for (int i = 0; i < listBook.size(); i++) {
            listBook2.add(new Book());
        }
        Collections.copy(listBook2, listBook);
        System.out.println("List book new copy: ");
        xuatRaMH(listBook2);

        //1.5 Sử dụng Arrays.binarySearch(…) để thực hiện tìm kiếm theo nhiều tiêu chuẩn
        //khác nhau
        System.out.print("Tìm iếm sách thể loại Van Hoc mã tăng dần: ");
        //Tìm kiếm nhị phân nên phải xắp xếp trước khi tìm kiếm

        Collections.sort(listBook, new Book.SortByCategoryASC());
        int b_search = Collections.binarySearch(listBook, new Book(null, null, 1, "Van Hoc"), new Book.SeachByCategory() );
        System.out.println(b_search);
    }


}
