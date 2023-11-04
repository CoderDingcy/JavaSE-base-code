package day4;

import java.util.Arrays;

//两数之和
//给定一个整数数组 nums 和一个整数目标值 target
//请你在该数组中找出和为目标值 target 的那两个整数
//并返回它们的数组下标。
public class Demo5 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] indexs=findIndexs(nums,9);
        System.out.println(Arrays.toString(indexs));

    }


    public static int[] findIndexs(int[] arr, int target) {
        int[] sarr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    sarr[0] = i;
                    sarr[1] = j;
                    return sarr;
                }
            }

        }

        return null;
    }


}


