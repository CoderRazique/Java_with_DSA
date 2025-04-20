// Max subarray sum

public class maxSubarraySum {
    public static int maxSubarray_Sum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int temp = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    temp = temp + nums[j2];
                }
                if (max < temp) {
                    max = temp;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, -2, 6, -1, 3 };
        int maxSumOFSubarray = maxSubarray_Sum(nums);
        System.out.println("Sum of max subarray : " + maxSumOFSubarray);
    }
}
