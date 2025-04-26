// Print the number of 7’s that are inthe 2d array.
// Example :Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2

public class printTotalKeyInMatrix {
    public static int totalKey(int[][] matrix, int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
        int key = 7;
        System.out.println("Total number of 7s that are in the 2d array : " + totalKey(array, key));
    }
}
