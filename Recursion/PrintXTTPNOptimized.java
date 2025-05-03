//  X^n  with TC = O(log2n) in optimized

public class PrintXTTPNOptimized {

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = pow(x, n / 2);
        int halfPowerSqrt = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSqrt = x * halfPowerSqrt;
        }
        return halfPowerSqrt;
    }

    public static void main(String[] args) {
        int x = 25;
        int n = 2;
        System.out.println(pow(x, n));
    }
}
