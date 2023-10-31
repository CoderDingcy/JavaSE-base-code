package day2;

public class Demo8 {
    public static void main(String[] args) {

        System.out.println(max3(1.1,1.2,0.3));

    }

    public static int max2(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public static double max2(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }
    public static int max3(int n1, int n2, int n3) {
        n2 = max2(n1, n2);
        n3 = max2(n1, n3);
        n3 = max2(n2, n3);
        return n3;
    }

    public static double max3(double n1, double n2, double n3) {
        n2 = max2(n1, n2);
        n3 = max2(n1, n3);
        n3 = max2(n2, n3);
        return n3;
    }
}
