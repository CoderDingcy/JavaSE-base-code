package day2;

import java.util.Scanner;

//打印x型*阵
public class Demo1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();

            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < i; j++)
                    System.out.print(" ");
                System.out.print('*');
                for (int j = 1; j <= n - 2 - 2 * i; j++)
                    System.out.print(" ");
                System.out.println("*");
            }

            if (n % 2 != 0) {
                for (int i = 0; i < n / 2; i++)
                    System.out.print(" ");
                System.out.println("*");
            }

            for (int i = n / 2; i > 0; i--) {
                for (int j = 1; j < i; j++)
                    System.out.print(" ");
                System.out.print('*');
                for (int j = n - 2 * i; j > 0; j--)
                    System.out.print(" ");
                System.out.println("*");
            }
        }
    }
}
