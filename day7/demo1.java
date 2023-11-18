package day7;

public class demo1 {

    //    将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为 0 或者字符串不是一个合法的数值则返回 0
//
//    注意：
//            ①字符串中可能出现任意符号，出现除 +/- 以外符号时直接输出 0
//            ②字符串中可能出现 +/- 且仅可能出现在字符串首位。
//    public int StrToInt(String str) {
//        if (str.isEmpty()||str==null)
//            return 0;
//
//        int sum = 0;
//        for (int i = str.length() - 1; i >= 1; i--) {
//            if (!Character.isDigit(str.charAt(i)))
//                return 0;
//
//            sum += (str.charAt(i) - '0') * (int) Math.pow(10, str.length() - 1 - i);
//        }
//        if (!isNumAddSub(str.charAt(0)))
//            return 0;
//        if (str.charAt(0) == '-')
//            return sum * (-1);
//        else if (str.charAt(0) == '+') {
//            return sum;
//        }
//        return sum + (str.charAt(0) - '0') * (int) Math.pow(10, str.length() - 1);
//
//
//    }
//
//    private boolean isNumAddSub(char ch) {
//        if (Character.isDigit(ch) || ch == '+' || ch == '-' || ch == '/')
//            return true;
//        return false;
//    }

    public int StrToInt(String str) {
        if (str.isEmpty() || str == null)
            return 0;
        int ret = 0, i = 0, flag = 1;
        char[] s = str.toCharArray();
        if (s[0] == '-') {
            flag = -1;
            i = 1;
        } else if (s[0]=='+'){
            i = 1;
        }

        for (; i < s.length; i++) {
            if (Character.isDigit(s[i]))
            {
                ret=ret*10+(s[i]-'0');
            }
            else {
                break;
            }
        }
        if (i==s.length)
            return ret*flag;
        return 0;


    }


}
