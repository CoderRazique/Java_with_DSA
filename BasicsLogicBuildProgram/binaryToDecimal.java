// Convert from Binary to Decimal

import java.util.Scanner;

public class binaryToDecimal {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int ld = binNum % 10;
            decNum = decNum + (ld * (int) Math.pow(2, pow));
            pow++;
            binNum /= 10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number(01) : ");
        int binNum = sc.nextInt();
        binToDec(binNum);
        sc.close();
    }
}
