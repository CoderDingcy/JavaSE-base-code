package day1;

//打印1000~2000的闰年
public class Demo2 {

    public static void main(String[] args) {

        for (int i = 1000; i <= 2000; i++) {

            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
                System.out.println(i);
        }

    }

}
