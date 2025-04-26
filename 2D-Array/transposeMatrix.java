// Write a program to Find Transpose of a Matrix.
// What is Transpose? 
// Transpose of a matrix is the process of swapping therows to columns. 
// For a 2x3 matrix,
// Matrix
// a11    a12    a13
// a21    a22    a23
// Transposed Matrix
// a11    a21
// a12    a22   
// a13    a23

public class transposeMatrix {
    public static int[][] transposeOfMatrix(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 4, 7, 8 }, { 8, 8, 7 } };
        printMatrix(matrix);

        printMatrix(transposeOfMatrix(matrix));
    }
}
