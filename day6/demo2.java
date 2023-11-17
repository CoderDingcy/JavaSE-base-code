package day6;
import java.util.Scanner;
//计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。
public class demo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();

        String[] out=str.split(" ");

        System.out.println(out[out.length-1].length());
    }

}
