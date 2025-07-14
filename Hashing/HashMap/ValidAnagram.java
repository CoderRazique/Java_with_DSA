// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An anagram is a word or phrase formed by rearranginging the letters of a diffrent word or phrase,
// typically using all the original letters exactly once.
//  S = "race" t = "care"  : True
//  S = "tulip" t = "lipid" : False

import java.util.HashMap;

public class ValidAnagram {

    public static boolean isValidAnagram(String S, String T) {
        if (S.length() != T.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }
        for (int i = 0; i < T.length(); i++) {
            char ch = T.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String S = "race", T = "care";
        String S1 = "tulip", T1 = "lipid";
        System.out.println("Is Anagram : " + isValidAnagram(S1, T1));

    }

}
