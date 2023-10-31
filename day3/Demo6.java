package day3;

//递归求汉诺塔问题
public class Demo6 {

    public static void main(String[] args) {
        hanio(3, 'A', 'B', 'C');
    }

    /**
     * @param n    要移动的圆盘数
     * @param pos1 起始位置
     * @param pos2 中间位置
     * @param pos3 目标位置
     *             javase-5
     */
    public static void hanio(int n, char pos1, char pos2, char pos3) {
        if (n == 1) {
            move(pos1, pos3);
            return;
        }

        hanio(n - 1, pos1, pos3, pos2);
        move(pos1, pos3);
        hanio(n - 1, pos2, pos1, pos3);
    }

    public static void move(char pos1, char pos2) {

        System.out.println(pos1 + "-->" + pos2);

    }

}
