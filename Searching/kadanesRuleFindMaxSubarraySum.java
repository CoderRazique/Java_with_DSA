// write a java program to find the sum of max subarray using KASANSS ALGORITHM

public class kadanesRuleFindMaxSubarraySum {

    public static int maxSubarray_Sum(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            if (cs < 0) {
                cs = 0;
            }
            if (ms < cs) {
                ms = cs;
            }
        }

        return ms;
    }

    public static void main(String[] args) {
        int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int maxSumOFSubarray = maxSubarray_Sum(nums);
        System.out.println("Sum of max subarray : " + maxSumOFSubarray);
    }
}
