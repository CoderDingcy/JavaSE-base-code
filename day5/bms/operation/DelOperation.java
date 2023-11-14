package day5.bms.operation;

import day5.bms.book.Book;
import day5.bms.book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {

    public void work(BookList bookList) {

        System.out.println("删除图书！！！");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的图书的书名：");
        String name = sc.nextLine();
        int index = -1;
        int currentSize = bookList.getUsedSize();
        int i = 0;
        for (; i < currentSize; i++) {
            if (bookList.getBook(i).getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (i >= currentSize) {
            System.out.println("没有你要删除的图书！");
            return;
        }
        for (int i1 = index + 1; i1 < currentSize; i1++) {
            bookList.setBook(bookList.getBook(i1), i1 - 1);
        }
        bookList.setBook(null, currentSize - 1);
        bookList.setUsedSize(currentSize - 1);
    }
}
