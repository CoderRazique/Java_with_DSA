// find the largest number in a given in a given array

import java.util.*;

public class findLargestNo {
    public static int getLargestNumber(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = { 34, 23, 43, 23, 12, 32, 47, 4, 24 };
        int result = getLargestNumber(nums);
        System.out.println("Largest number is = " + result);
    }
}
