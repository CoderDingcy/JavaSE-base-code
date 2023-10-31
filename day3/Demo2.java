package day3;

//递归求和
public class Demo2 {

    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int n) {
        if (n==1)
            return 1;

        return sum(n-1)+n;

    }

}
