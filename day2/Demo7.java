package day2;
//求和的重载
public class Demo7 {

    public static void main(String[] args) {

        System.out.println(add(1,2));
        System.out.println(add(1.2,2.2,3.3));
    }

    public static int add(int n1,int n2){
        return n1+n2;
    }

    public static double add(double n1,double n2,double n3){
        return n1+n2+n3;
    }
}
