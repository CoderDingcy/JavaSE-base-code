package day5.bms.operation;

import day5.bms.book.Book;
import day5.bms.book.BookList;

public class ShowOperation implements IOperation {
    @Override
    public void work(BookList bookList) {

        System.out.println("显示图书！！！");
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);

        }
    }
}