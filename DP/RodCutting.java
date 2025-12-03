package DP;

// Rod cutting : Given a rod of length n inches and an array of prices that includes prices
// of all pieces of size smaller than n. Determine the maximum value obtainable
// by cutting up the rod and selling the pieces.

//  length[] = {1,2,3,4,5,6,7,8}
// priece[] = {1,5,8,9,10,17,17,20}
// rodLength = 8

public class RodCutting {
    public static int rodCutting(int[] length, int[] priece, int rodLength) {
        int n = length.length;
        int dp[][] = new int[n + 1][rodLength + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int rs = priece[i - 1];
                int len = length[i - 1];
                if (len <= j) {
                    dp[i][j] = Math.max(rs + dp[i][j - len], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][rodLength];
    }

    public static void main(String[] args) {
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int priece[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int rodLength = 8;
        System.out.println(rodCutting(length, priece, rodLength));
    }
}
