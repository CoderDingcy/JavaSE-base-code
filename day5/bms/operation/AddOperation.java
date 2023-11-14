package day5.bms.operation;

import day5.bms.book.Book;
import day5.bms.book.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation {

    public void work(BookList bookList) {

        System.out.println("新增图书！！！");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要新增的图书的书名：");
        String name = sc.nextLine();
        System.out.println("请输入你要新增的图书的作者：");
        String author = sc.nextLine();
        System.out.println("请输入你要新增的图书的价格：");
        int price = sc.nextInt();
        System.out.println("请输入你要新增的图书的类型：");
        sc.nextLine();
        String type = sc.nextLine();

        Book book = new Book(name, author, price, type);
        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            if (bookList.getBook(i).equals(name)) {
                System.out.println("存在这本书，不能重复添加！");
                return;
            }
        }
        bookList.setBook(book, currentSize);
        bookList.setUsedSize(currentSize + 1);
    }
}
