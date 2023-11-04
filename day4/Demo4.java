package day4;

import java.util.Arrays;

//奇数位于偶数之前
public class Demo4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        arr = oddNextEven(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] oddNextEven(int[] arr) {
        int[] sarr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                sarr[count++] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                sarr[count++] = arr[i];
        }
        return sarr;
    }

}
