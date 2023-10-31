package day3;
//递归求阶乘
public class Demo1 {

    public static void main(String[] args) {

        System.out.println(factorial(3));
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return factorial(n - 1) * n;
    }
}
