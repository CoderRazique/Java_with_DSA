package DP;

// Coin Change 
// coins[] = {2,5,3,6}
// sum = 10
//  output = 5 (2,2,2,2,2),(2,2,3,3),(2,2,6),(2,3,5) and (5,5)

public class CoinChange {

    public static int countWay(int[] coins, int sum) {
        int n = coins.length;
        int[][] dp = new int[n + 1][sum + 1];

        // i = coins; j = sum/change
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int coin = coins[i - 1];
                if (coin <= j) {
                    dp[i][j] = dp[i][j - coin] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int coins[] = { 2, 5, 3, 6 };
        int sum = 10;
        System.out.println(countWay(coins, sum));
    }
}
