// Clear Range of Bits
//  n = 100111010011, i= 2,j=7
// output : 100100000011

public class clearRangeOfBits {
    public static int clearBitsinRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = ((1 << i) - 1);
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearBitsinRange(10, 2, 4));
    }
}
