// Grid ways
// Find number of ways to reach from (0,0) to (n-1, m-1) in a N*M Grid.
// Allowed moves - right or down

public class GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }

        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("Total number of ways to reach from (0,0) to (n-1, m-1) :  " + gridWays(0, 0, n, m));
    }
}
