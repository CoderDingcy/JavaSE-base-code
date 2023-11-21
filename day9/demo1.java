package day9;
import java.util.Scanner;
//描述
//        输入一个字符串，求出该字符串包含的字符集合，按照字母输入的顺序输出。
//
//        本题有多组输入
//        输入描述：
//        每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写。
//        输出描述：
//        每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出。
//示例1
//        输入：
//        abcqweracb
//
//        输出：
//        abcqwer
public class demo1 {
    public static String func(String str) {
        boolean[] arr = new boolean[127];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!arr[str.charAt(i)]) {
                sb.append(str.charAt(i));
                arr[str.charAt(i)] = true;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            String ret = func(str);

            System.out.println(ret);

        }
    }
}
