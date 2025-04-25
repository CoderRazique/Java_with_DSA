// write a java program to search index of a key in given matrix

public class searchIn2dArray {
    public static void searchKey(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found " + key + " at index (" + i + "," + j + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int key = 12;
        searchKey(matrix, key);
    }
}
