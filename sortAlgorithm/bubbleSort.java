// Bubble sort

public class bubbleSort {

    public static void bubbleSortFun(int[] nums) {
        for (int term = 0; term < nums.length - 1; term++) {
            boolean isSwaped = false;
            for (int i = 0; i < nums.length - 1 - term; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    isSwaped = true;
                }
            }
            if (!isSwaped && term == 0) {
                System.out.println("Array is already sorted!" + (term + 1));
                break;
            }
        }
    }

    public static void printArray(int[] nums) {
        System.out.println("Sorted array elements are : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, 1, 3, 2, 8, 6, 7, 0, 9 };
        // int nums[] = { 1, 2, 3, 4 };
        bubbleSortFun(nums);
        printArray(nums);
    }
}