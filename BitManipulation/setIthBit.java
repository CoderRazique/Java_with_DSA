// Set ith bit 
// input n=10, i=2; output = 14 {10 = 1010, i =2, 1110}

public class setIthBit {
    public static int setIthBitValue(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static void main(String[] args) {
        System.out.println(setIthBitValue(10, 2));
        System.out.println(setIthBitValue(15, 3));
    }
}
