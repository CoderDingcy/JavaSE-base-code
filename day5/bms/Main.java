package day5.bms;

import day5.bms.book.BookList;
import day5.bms.user.AdminUser;
import day5.bms.user.NormalUser;
import day5.bms.user.User;

import java.util.Scanner;

public class Main {
    public static User login() {
        System.out.println("请输入你的姓名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("输入你的身份，1：管理员  2：普通用户");
        int choice = sc.nextInt();
        if (choice == 1) {
            return new AdminUser(name);
        } else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        BookList bookList=new BookList();
        User user = login();
        while (true) {
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }
    }
}
