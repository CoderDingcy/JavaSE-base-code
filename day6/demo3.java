package day6;

//如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
//
//        字母和数字都属于字母数字字符。
//
//        给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。


public class demo3 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            //l走到合法字符下
            while (!isCharacterNum(s.charAt(l)) && l < r)
                l++;

            //r走到合法字符下
            while (!isCharacterNum(s.charAt(r)) && l < r)
                r--;

            //l一定指向的是合法字符
            //r一定指向的是合法字符
            //判断这两个下标的字符一样不一样
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {

                return false;
            }

        }
        return true;
    }

    private boolean isCharacterNum(char ch) {
        if (Character.isDigit(ch) || Character.isLetter(ch))
            return true;

        return false;

    }

}
