package day6;

//统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
//
//请注意，你可以假定字符串里不包括任何不可打印的字符。
public class demo4 {
//    public int countSegments(String s) {
//        if (s.equals(""))
//            return 0;
//        int count = 0;
//        for (int i = 0; i < s.length() - 1; i++) {
//            if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ') {
//                count++;
//            }
//        }
//        if (s.charAt(s.length() - 1) != ' ')
//            return count + 1;
//        return count;
//    }

    public int countSegments(String s) {
        s=s.trim();
        int count=0;
        if (s.isEmpty()||s==null)
            return 0;
        String[] str=s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].isEmpty())
                continue;
            count++;

        }
        return count;
    }
}
