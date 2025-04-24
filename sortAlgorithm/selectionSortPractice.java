public class selectionSortPractice {
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
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
        int nums[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        selectionSort(nums);
        printArray(nums);
    }
}