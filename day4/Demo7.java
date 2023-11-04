package day4;

import java.util.Arrays;

//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
public class Demo7 {

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 3};
        int[] arr2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(findMost(arr1));
        System.out.println(findMost(arr2));
    }

    public static int findMost(int[] arr){

        Arrays.sort(arr);
        int index=arr.length/2;
        return arr[index];
    }
}
