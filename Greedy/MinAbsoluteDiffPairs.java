// Min Absolute Difference Pairs

// Given two arrays A and B of equal length n. 
// Pair each element of array A to an element in array B, 
// such that the sum of the absolute 
// differences of all the pairs is minimized.

// A = [4,1,8,7]
// B = [2,3,6,5]
// The minimum sum of absolute differences is 6

import java.util.Arrays;

;

public class MinAbsoluteDiffPairs {
    public static int sumOfMinAbsDiff(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += Math.abs(A[i] - B[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };
        System.out.println("Minimum sum of absolute differences is " + sumOfMinAbsDiff(A, B));
    }
}
