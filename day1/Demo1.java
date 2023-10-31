package day1;

//打印1~100的素数
public class Demo1 {
    public static void main(String[] args) {


        System.out.println("1\n2");
        for (int i = 3; i <= 100; i++) {
            boolean flg = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flg = false;
                    break;
                }
            }
            if (flg)
                System.out.println(i);
        }


    }
}
