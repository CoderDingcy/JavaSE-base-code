package day4;

//给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
public class Demo8 {

    public static void main(String[] args) {

        int[] arr1 = {2, 6, 4, 1};
        int[] arr2 = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println(constantThreeOdd(arr1));
        System.out.println(constantThreeOdd(arr2));
    }


    public static boolean constantThreeOdd(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (isOdd(arr[i]) && isOdd(arr[i + 1]) && isOdd(arr[i + 2]))
                return true;
        }
        return false;
    }

    public static boolean isOdd(int num) {

        if (num % 2 != 0)
            return true;
        return false;
    }
}
