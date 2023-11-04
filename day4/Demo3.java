package day4;
//数组所有元素之和
public class Demo3 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println(sum(arr));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
