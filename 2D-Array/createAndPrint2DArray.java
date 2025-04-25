import java.util.Scanner;

public class createAndPrint2DArray {

    public static void inputMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter size of column : ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("matrix[" + i + "][" + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        outputMatrix(matrix, n, m);
    }

    public static void outputMatrix(int[][] matrix, int n, int m) {

        for (int i = 0; i < n; i++) {
            System.out.print("|");
            for (int j = 0; j < m; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        // int matrix[][] = {{1,2,3,4,},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        inputMatrix();

    }
}