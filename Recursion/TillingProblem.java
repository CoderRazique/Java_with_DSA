// Tiling Problem
// Given a "2 * n" board and tiles of size "2 * 1", count the number of
// ways to tile the given board using the 2 * 1 tiles.
// (A tile can either be placed horizontally or vertically.)

public class TillingProblem {
    public static int totalWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int hp = totalWays(n - 1);
        int vp = totalWays(n - 2);
        int tw = hp + vp;

        return tw;
    }

    public static void main(String[] args) {
        System.out.println("Total ways : " + totalWays(4));
    }
}
