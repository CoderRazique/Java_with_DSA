// Find Permutations 
// Find & print all permutations of a string
// input : "abc"
// output : "abc","acb","bac","bca","cab","cba"
// TC : O(n*n!)

public class PermutationOfaString {
    public static void permutationsOfString(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutationsOfString(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutationsOfString(str, "");
    }
}
