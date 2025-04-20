// Trapped Rain Water 
// Note: Give n non-negative integers representating an elevation 
// map where the width of each bar is 1 , comput how much water 
// it can trap after raining

public class trapedWater {

    public static int trappedRainWater(int[] height) {
        int n = height.length;

        // calculate left max boundary
        int leftMaxBoundary[] = new int[n];
        leftMaxBoundary[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i - 1]);
        }

        // calculate right max boundart
        int rightMaxBoundary[] = new int[n];
        rightMaxBoundary[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i + 1]);
        }

        int ttw = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);

            // trapped water = waterLevel - height[i]
            ttw += (waterLevel - height[i]);
        }
        return ttw;
    }

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        int ttw = trappedRainWater(height);
        System.out.println("Total trapped rain water : " + ttw);
    }
}
