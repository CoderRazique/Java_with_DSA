// Determine if 2 Strings are anagrams of each other.
// What are anagrams?
// If two strings contain the same characters but in a different order, they can be said to be anagrams.
// Consider race and care. In this case, race's characters can be for medin to a study,or care's characters
// can be formed in to race. Below is a java program to check if two strings are anagrams or not

import java.util.Arrays;

public class isAnagram {

    public static boolean isAnagramString(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            if (Arrays.equals(str1CharArray, str2CharArray)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "racex";
        String str2 = "carep";
        System.out.println("Is anagram : " + isAnagramString(str, str2));
    }
}
