// Question 2: There is an integer array nums sorted in ascending order (with
// distinct values).
// Prior to being passed to your function, nums is possibly rotated at an
// unknown pivot index k (1 <= k < nums.length) such that the resulting array is
// [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
// (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3
// and become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target,
// return the index of target if it is in nums, or -1 if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity.
// Example 1:
// Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 0
// Output: 4

// Example 2:
// Input: nums = [4, 5, 6, 7, 0, 1, 2], target = 3
// Output: -1

// Example 3:
// Input: nums = [1], target = 0
// Output: -1

// Constraints:
// • 1 <= nums . lengtth <= 5000
// • -104 <= nums [ i ] <= 104
// • All values of nums are unique.
// • nums is an ascending array that is possibly rotated.
// • -104 <= target <= 104

public class returnIndexOfMittingElementInArray {

    public static int findSortedLeftAndRight(int[] nums, int key) {
        // min will have index of minimum element of nums
        int min = findMinKeyInArray(nums, key);

        if (nums[min] <= key && key <= nums[nums.length - 1]) {
            // find in sorted left
            return search(nums, min, nums.length - 1, key);
        } else {
            // find in sorted right
            return search(nums, 0, min, key);
        }
    }

    // binary search to find target in left to right boundary
    public static int search(int[] nums, int left, int right, int key) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == key) {
                return mid;
            } else if (nums[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // small element index
    public static int findMinKeyInArray(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[start] <= nums[mid] && nums[end] < nums[mid]) {
                start = mid + 1;
            } else {
                end = end - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int key = 0;
        int result = findSortedLeftAndRight(nums, key);
        System.out.println("index : " + result);
    }
}