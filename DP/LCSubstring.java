package DP;

// Longest Common Substring : 
// a substring is a contiguous sequence of characters within a string
// S1 = "ABCD", S2 = "ABGCE"
// ans = 2 "AB"

public class LCSubstring {

    // Tabulation
    // O(n*m)
    public static int longCommSubstring(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];

        // initilize
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        int ans = 0;

        // bottom up
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abgce";
        System.out.println(longCommSubstring(s1, s2));
    }
}
