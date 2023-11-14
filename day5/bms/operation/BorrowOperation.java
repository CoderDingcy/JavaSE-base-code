package day5.bms.operation;

import day5.bms.book.Book;
import day5.bms.book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation {

    public void work(BookList bookList) {

        System.out.println("借阅图书！！！");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要借阅的图书的书名：");
        String name = sc.nextLine();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                book.setBorrowed(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("没有你要借阅的图书："+name);
    }
}
