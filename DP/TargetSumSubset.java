package DP;

// Target sum subset (Variation of 0-1 Knapsack)
// numbers[] = {4,2,7,1,3}
// Target Sum = 10;

public class TargetSumSubset {

    public static boolean targetSumSubset(int[] numbers, int sum) {
        int n = numbers.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];
        // i = items & j = target sum
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = numbers[i - 1];
                // include
                if (v <= j && dp[i - 1][j - v] == true) {
                    dp[i][j] = true;
                } else if (dp[i - 1][j] == true) { // exclude
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int numbers[] = { 4, 2, 7, 1, 3 };
        int target = 10;
        System.out.println(targetSumSubset(numbers, target));
    }
}
