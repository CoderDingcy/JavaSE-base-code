package day2;

import java.util.Scanner;

//模拟三次密码输入的场景
public class Demo4 {

    public static void main(String[] args) {

        String password = "123456";
        Scanner sc = new Scanner(System.in);
        boolean flg = true;
        System.out.println("请输入登录密码：");
        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            if (str.equals(password)) {
                System.out.println("登录成功");
                flg = false;
                break;
            }
            if (i != 2) {
                System.out.println("请重新输入：");
            }
        }
        if (flg) {
            System.out.println("三次均错，退出程序");
        }
    }
}
