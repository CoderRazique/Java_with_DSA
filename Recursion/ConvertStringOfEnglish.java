// You are given a number (eg -  2019), convert it into a 
// String of english like two zero one nine.  
// Use a recursive function to solve this problem.
// NOTE-The digits of then umber will only be intherange 
// 0-9 and the lastdigit of a number can’t be 0.
// Sample Input: 1947
// Sample Output: one nine four seven.

public class ConvertStringOfEnglish {
    static String[] digits = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };

    public static void printDigits(int number) {
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printDigits(number / 10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {
        printDigits(541236987);
    }
}
