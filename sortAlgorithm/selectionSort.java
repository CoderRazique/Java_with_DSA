public class selectionSort {
    public static void slectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minPos] > nums[j]) {
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }

    public static void printArray(int[] var0) {
        for (int var1 = 0; var1 < var0.length; ++var1) {
            System.out.print(var0[var1] + " ");
        }
    }

    public static void main(String[] args) {
        int[] var1 = new int[] { 5, 4, 1, 3, 2 };
        slectionSort(var1);
        printArray(var1);
    }
}
