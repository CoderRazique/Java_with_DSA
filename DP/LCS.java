package DP;

// Longest Common Subsequence(LCS)
// A subsequence of a string is a new string generated from the original
// string with some characters(can be none) deleted without chnageing 
// the relative order of the remaining characters.

// str1 = "abcde", str2 = "ace"
//  ans = 3 "ace"

public class LCS {

    // plain recurtion
    // O(2^n )
    public static int lcs(String str1, String str2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return lcs(str1, str2, n - 1, m - 1) + 1;
        } else {
            int ans1 = lcs(str1, str2, n, m - 1);
            int ans2 = lcs(str1, str2, n - 1, m);
            return Math.max(ans1, ans2);
        }
    }

    // memoization
    // O(n*m)
    public static int lcsMemoization(String str1, String str2, int n, int m, int[][] dp) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return dp[n][m] = lcsMemoization(str1, str2, n - 1, m - 1, dp) + 1;
        } else {
            int ans1 = lcsMemoization(str1, str2, n - 1, m, dp);
            int ans2 = lcsMemoization(str1, str2, n, m - 1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(lcsMemoization(str1, str2, str1.length(), str2.length(), dp));
        // for (int i = 0; i < dp.length; i++) {
        // for (int j = 0; j < dp[0].length; j++) {
        // System.out.print(dp[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}
