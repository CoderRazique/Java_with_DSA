// Max Length Chain Of Pairs
// You are given n pairs of numbers.
// In every pair, the first number is always smaller than the second number.
// A pair (c, d) can come after pair (a, b) if b < c.
// Find the longest chain which can be formed from a given set of pairs.
// Input: pairs = [[5,24],[39,60],[5,28],[27,40],[50,90]]
// Output: 3
// Explanation: The longest chain is [5,24] -> [27,40] -> [50,90]

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPairs {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // Sort by second element
        int maxChain = 1;
        int chainEnd = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (chainEnd < pairs[i][0]) {
                maxChain++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Max length of chain of pairs: " + maxChain);
    }
}
