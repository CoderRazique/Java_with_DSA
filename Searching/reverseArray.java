// reverse array

public class reverseArray {
    public static void reverse(int[] nums) {
        int start = 0;
        int last = nums.length - 1;
        while (start < last) {
            int temp = nums[last];
            nums[last] = nums[start];
            nums[start] = temp;
            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 4, 6, 5 };
        reverse(nums);
        System.out.print("Reverse array elements : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
