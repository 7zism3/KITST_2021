package homeWork_24_5.bai1;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    String bookNo;
    String name;
    int price;
    String category;

    public Book() {
    }

    public Book(String bookNo, String name, int prire, String category) {
        this.bookNo = bookNo;
        this.name = name;
        this.price = prire;
        this.category = category;
    }


    public int compareTo(Book b) {
        int comp = 0;
        if (price < b.getPrice()) {
            comp = -1;
        } else if (price > b.getPrice()) {
            comp = 1;
        }
        return comp;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public static class SortByNoASC implements Comparator<Book> {
        public int compare(Book b1, Book b2) {
            return -b1.getBookNo().compareTo(b2.getBookNo());
        }
    }

    public static class SortByCategoryASC implements Comparator<Book> {
        public int compare(Book b1, Book b2) {
            return b1.getCategory().compareTo(b2.getCategory());
        }
    }

    public static class SeachByCategory implements Comparator<Book> {
        public int compare(Book b1, Book b2) {
            return b1.getCategory().compareTo(b2.getCategory());
        }
    }


}