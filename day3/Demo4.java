package day3;

import java.util.Properties;
//返回各位数字之和

public class Demo4 {

    public static void main(String[] args) {

        System.out.println(sum(991));
    }

    public static int sum(int n) {

        if (n < 10) {

            return n;
        }
        return sum(n/10)+n%10;
    }
}
