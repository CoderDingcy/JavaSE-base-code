package day5.bms.book;

public class BookList {
    private Book[] books;
    private int usedSize;

    public BookList() {
        this.books = new Book[10];
        books[0]=new Book("三国演义","罗贯中",123,"小说");
        this.usedSize = 1;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Book getBook(int pos) {
        return books[pos];
    }

    public void setBook(Book book, int pos) {
        books[pos] = book;
    }
}
