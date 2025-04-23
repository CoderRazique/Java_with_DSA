// Question 4: Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

// Example 1:
// Input: height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
// Example 2:
// Input: height = [4, 2, 0, 3, 2, 5]
// Output: 9
// Constraints:
// • n == height . length
// • 1 <= n <= 2 * 104
// • 0 <= height [ i ] < = 105

public class trappedWater {
    public static int trappedWaters(int[] height) {
        int trappedWater = 0;
        int l = 0;
        int r = height.length - 1;
        int lm = height[l];
        int rm = height[r];
        while (l < r) {
            if (lm < rm) {
                l++;
                lm = Math.max(lm, height[l]);
                trappedWater += lm - height[l];
            } else {
                r--;
                rm = Math.max(rm, height[r]);
                trappedWater += rm - height[r];
            }
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Trapped water : " + trappedWaters(height));
    }
}
