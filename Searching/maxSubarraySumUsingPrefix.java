// Max subarray sum using prefix Array approach

public class maxSubarraySumUsingPrefix {

    public static int maxSubarray_Sum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int temp = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
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
