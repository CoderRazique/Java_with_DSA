package DP;

// Unbounded Knapsack
// val[] = {15, 14, 10, 45, 30}
// wt[] = {2, 5, 1, 3, 4}
// W (total allowed weight) = 7
// ans = max Profit

public class UnboundedKnapsack {

    // O(n*W)
    public static int unboundedKnapsack(int[] val, int[] wt, int W) {
        int[][] dp = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (wt[i - 1] <= j) { // valid
                    dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
                } else { // invalid
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[val.length][W];

    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        System.out.println(unboundedKnapsack(val, wt, W));
    }
}
