// Count way to reach the nth stairs. The person can climb either 1 stair or 2 stairs at atime.
// input : n = 5
// output : 8

package DP;

import java.util.Arrays;

public class ClimbingStairs {

    // Plain Recurtion
    // O(2^n)
    public static int countWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;

        }

        return countWays(n - 1) + countWays(n - 2);
    }

    // Recurtion Memoization
    // O(n)
    public static int countWaysMemoization(int n, int[] ways) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;

        }
        if (ways[n] != -1) {
            return ways[n];
        }
        ways[n] = countWaysMemoization(n - 1, ways) + countWaysMemoization(n - 2, ways);
        return ways[n];
    }

    // Tabulation (Iteration)
    // O(n)
    public static int countWaysTabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        // dp[1] = 1;

        for (int i = 1; i < dp.length; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(countWaysMemoization(n, ways));
        System.out.println(countWaysTabulation(n));
    }
}
