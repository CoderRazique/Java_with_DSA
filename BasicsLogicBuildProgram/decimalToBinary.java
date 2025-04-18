// Convert from Decimal to Binary

public class decimalToBinary {
    public static void decToBin(int decNum) {
        int temp = decNum;
        int binNum = 0;
        int pow = 0;
        while (temp > 0) {
            int rem = temp % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            temp /= 2;
        }
        System.out.println("Binary form of " + decNum + " = " + binNum);
    }

    public static void main(String[] args) {
        decToBin(10);
    }
}
