//  sum of diagonal matrix

public class sumOfDiagonalMatrix {
    public static void sumOfDiagonal(int[][] matrix) {
        int sum = 0;

        // tc is not good tc = O(n^2)

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[0].length; j++) {
        // if (j == i) {
        // sum += matrix[i][j];
        // } else if (i + j == matrix.length - 1) {
        // if (i != j) {
        // sum += matrix[i][j];
        // }
        // }
        // }
        // }

        // tc = O(n)<O(n^2)

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - i - 1) {
                // i + j == matrix.length - 1 => j = matrix.length - 1 - i
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println("sum of diagonal : " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        sumOfDiagonal(matrix);
    }
}
