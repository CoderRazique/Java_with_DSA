// Get ith bit 0001100010 i = 1; output 1,
// bit 0001100010 i = 2; output 0

public class getIthBit {
    public static int getIthBitValue(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthBitValue(10, 2));
        System.out.println(getIthBitValue(15, 3));
    }
}
