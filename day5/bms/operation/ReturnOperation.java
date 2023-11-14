package day5.bms.operation;

import day5.bms.book.Book;
import day5.bms.book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList) {

        System.out.println("归还图书！！！");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要归还的图书的书名：");
        String name = sc.nextLine();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                book.setBorrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("没有你要归还的图书：" + name);
    }

}
