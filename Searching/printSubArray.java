// Print subarray (a continuous part of array)

public class printSubArray {

    public static void pairsIn_Array(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("|");
                for (int k = i; k <= j; k++) {
                    System.out.print(" " + nums[k] + " ");
                }
                System.out.println("|");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10 };
        pairsIn_Array(nums);
    }

}
