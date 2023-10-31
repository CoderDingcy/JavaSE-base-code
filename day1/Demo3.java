package day1;

//打印1~100的数字9出现的次数
public class Demo3 {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int tmp = i;
            if (tmp % 10 == 9)
                count++;
            tmp /= 10;
            if (tmp == 9)
                count++;

        }
        System.out.print(count);

    }

}
