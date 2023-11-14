package day5.bms.operation;

import day5.bms.book.Book;
import day5.bms.book.BookList;

import java.util.Scanner;

public class FindOperation implements IOperation {

    public void work(BookList bookList) {

        System.out.println("查找图书！！！");
        System.out.println("请输入你要查找的图书的书名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                System.out.println("这本书的信息如下：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有你要找的这本书，书名为：" + name);
    }
}
