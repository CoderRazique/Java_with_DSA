// Count how many times lowercase vowels occurred in a String entered by the user.

import java.util.*;

public class countVowels {

    public static int lowercaseVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Enter sentences : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Count of vowels is : " + lowercaseVowels(str));
        sc.close();
    }
}
