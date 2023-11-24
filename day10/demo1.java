package day10;
//数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？
public class demo1 {

    public int missingNumber(int[] nums) {
        boolean[] flags=new boolean[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            flags[nums[i]]=true;
        }
        for (int i = 0; i < flags.length; i++) {
            if (!flags[i])
                return i;
        }
        return -1;
    }
}
