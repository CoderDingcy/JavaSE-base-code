package day10;

import java.util.Arrays;

//给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
//输入：nums = [-1,-100,3,99], k = 2
//        输出：[3,99,-1,-100]
//        解释:
//        向右轮转 1 步: [99,-1,-100,3]
//        向右轮转 2 步: [3,99,-1,-100]

//三种方法
public class demo2 {
    //方法一
    public void rotate1(int[] nums, int k) {
        int[] temp = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        for (int i = nums.length; i < 2 * nums.length; i++) {
            temp[i] = nums[i - nums.length];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[nums.length - (k % nums.length) + i];
        }

        System.out.println(Arrays.toString(nums));
    }

    //方法二
    public void reverse(int[] nums, int left, int right) {
        int l = left;
        int r = right;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right--;
            left++;
        }
    }

    public void rotate2(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, k % (nums.length), nums.length - 1);
        reverse(nums, 0, k % nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    //方法三 超时
    public void rotate3(int[] nums, int k) {
        int temp = 0;
        for (int i = 0; i < k % nums.length; i++) {
            temp = nums[nums.length - 1];
            for (int j = nums.length - 2; j >= 0; j--) {
                nums[j + 1] = nums[j];

            }
            nums[0] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
