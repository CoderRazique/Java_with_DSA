//  Write a java program to sort the array using bubble sort Algorithm

public class bubbleSortPractice {

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean isSort = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSort = true;
                }
            }
            if (!isSort && i == 0) {
                System.out.println("Array is already sorted!");
                break;
            }
        }
    }

    public static void printArray(int[] var0) {
        for (int var1 = 0; var1 < var0.length; ++var1) {
            System.out.print(var0[var1] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        bubbleSort(nums);
        printArray(nums);
    }
}
