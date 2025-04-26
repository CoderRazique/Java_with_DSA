// Print out the sum of the numbers inthe second row of the nums array.
// Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18

public class sumOfSecondRow {
    public static int sumOf2ndRow(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[1][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.println("Sum of second row : " + sumOf2ndRow(nums));
    }
}
