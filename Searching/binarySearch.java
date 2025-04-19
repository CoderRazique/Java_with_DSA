// write a java program to search a key using binary search

public class binarySearch {
    public static int binarySearchA(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == key) {
                return mid;
            }
            if (nums[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 10;
        System.out.println("Index for key is : " + binarySearchA(nums, key));
    }
}
