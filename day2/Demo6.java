package day2;

import java.util.Scanner;

//斐波那契数列的第n项。(迭代实现)
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<=0)
            System.out.println(0);
        int f1=0;
        int f2=1;
        for (int i=1;i<=n;i++){
            f1=f1+f2;
            f2=f1-f2;
        }
        System.out.println(f1);
    }
}
