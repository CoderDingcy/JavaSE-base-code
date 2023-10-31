package day2;

//求最大数
public class Demo5 {

    public static void main(String[] args) {

        System.out.println(max3(5,5,3));

    }


    public static int max2(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public static int max3(int n1, int n2, int n3) {
        n2 = max2(n1, n2);
        n3 = max2(n1, n3);
        n3 = max2(n2, n3);
        return n3;
    }
}
