package day4;
//改变原有数组元素的值
import java.util.Arrays;

public class Demo2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

    }
}
