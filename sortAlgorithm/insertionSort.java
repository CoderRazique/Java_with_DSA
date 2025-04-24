public class insertionSort {
    public static void insertionsSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;
            // found out the currect position to insert
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }

            // insert
            nums[prev + 1] = curr;
        }
    }

    public static void printArray(int[] var0) {
        for (int var1 = 0; var1 < var0.length; ++var1) {
            System.out.print(var0[var1] + " ");
        }
    }

    public static void main(String[] args) {
        int[] var1 = new int[] { 5, 4, 1, 3, 2 };
        insertionsSort(var1);
        printArray(var1);
    }
}
