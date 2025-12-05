package DP;

// Wildcard Matching
// Given a text and a wildcard pattern, implement wildcard pattern matching algorithm that finds
// if wildcard pattern is matched with text. The matching should cover the entire text (not partial text).
// The wildcard pattern can include the character '?' and '*'
//   . '?' - matches any single character
//   . '*' - Matchs any sequence of characters (including the empty sequence)

// text = "baaabab"
// pattern = "*****ba*****ab"
//  output = true

// text = "baaabab"
// pattern = a*ab"
//  output = false

public class WildcardMatching {

    // tabulation
    // O(n*m)
    public static boolean wildcardMatching(String txt, String ptrn) {
        int n = txt.length();
        int m = ptrn.length();
        boolean[][] dp = new boolean[n + 1][m + 1];

        // initilize
        dp[0][0] = true;
        for (int i = 1; i < n + 1; i++) {
            dp[i][0] = false;
        }
        for (int j = 1; j < m + 1; j++) {
            if (ptrn.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        // bottom up
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                // case -> ith char == jth char || jth char == '?'
                if (txt.charAt(i - 1) == ptrn.charAt(j - 1) || ptrn.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (ptrn.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        String text = "baaabab";
        String pattern = "*****ba*****ab";
        System.out.println(wildcardMatching(text, pattern));
    }
}
