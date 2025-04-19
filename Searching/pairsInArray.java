// Pairs in an array

public class pairsInArray {
    public static void pairsIn_Array(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + nums[i] + "," + nums[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10 };
        pairsIn_Array(nums);
    }
}
