package day2;

//打印一个整数的每一位
public class Demo3 {

    public static void main(String[] args) {
        print(109);

    }

    public static void print(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        }

        print(n / 10);
        System.out.print(n % 10);

    }

}


