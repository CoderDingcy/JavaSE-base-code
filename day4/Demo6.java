package day4;
//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素

import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        int[] arr2 = {2, 1, 4, 1, 2};
        System.out.println(findOne(arr2));
    }

    public static int findOne(int[] arr) {

        Arrays.sort(arr);
        if (arr[0] != arr[1]) {
            return arr[0];
        }
        if (arr[arr.length - 1] != arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] != arr[i] && arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }


        return -1;

    }
}
