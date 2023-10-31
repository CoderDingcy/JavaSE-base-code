package day3;
//递归求斐波那契数列第n项
public class Demo5 {

    public static void main(String[] args) {
        System.out.println(fibon(7));
    }

    public static int fibon(int n){

        if (n==1||n==2)
            return 1;

        return fibon(n-1)+fibon(n-2);
    }
}
