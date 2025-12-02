// 0-1 Knapsack
// val[] = {15, 14, 10, 45, 30}
// wt[] = {2, 5, 1, 3, 4}
// W (total allowed weight) = 7
// ans = max Profit

package DP;

public class KnapsackDP {

    // Plain Recurtion
    // O(2^n)
    public static int knapsack(int[] val, int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {// valid
            // include
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);

            // exclude
            int ans2 = knapsack(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        } else {
            return knapsack(val, wt, W, n - 1);
        }
    }

    // DP (Memoization)
    // O(n * W)
    public static int knapsackMemoization(int[] val, int[] wt, int W, int n, int[][] DP) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (DP[n][W] != -1) {
            return DP[n][W];
        }

        if (wt[n - 1] <= W) { // Valid
            int ans1 = val[n - 1] + knapsackMemoization(val, wt, W - wt[n - 1], n - 1, DP); // Include
            int ans2 = knapsackMemoization(val, wt, W, n - 1, DP); // Exclude
            DP[n][W] = Math.max(ans1, ans2);
            return DP[n][W];
        } else { // Not Valid
            DP[n][W] = knapsackMemoization(val, wt, W, n - 1, DP);
            return DP[n][W];
        }

    }

    // DP (Tabulation)
    // O(n * W)
    public static int knapsackTab(int[] val, int[] wt, int W) {
        int n = val.length;
        int[][] DP = new int[n + 1][W + 1];
        for (int i = 0; i < DP.length; i++) {
            DP[i][0] = 0;
        }

        for (int j = 0; j < DP[0].length; j++) {
            DP[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1]; // ith item val
                int w = wt[i - 1]; // ith item wt
                if (w <= j) { // Valid
                    int incProfit = v + DP[i - 1][j - w];
                    int excProfit = DP[i - 1][j];
                    DP[i][j] = Math.max(incProfit, excProfit);
                } else { // invalid
                    int excProfit = DP[i - 1][j];
                    DP[i][j] = excProfit;
                }
            }
        }
        return DP[n][W];
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int[][] DP = new int[val.length + 1][W + 1];
        for (int i = 0; i < DP.length; i++) {
            for (int j = 0; j < DP[0].length; j++) {
                DP[i][j] = -1;
            }
        }
        // System.out.println(knapsack(val, wt, W, val.length));
        // System.out.println(knapsackMemoization(val, wt, W, val.length, DP));
        System.out.println(knapsackTab(val, wt, W));
    }
}
