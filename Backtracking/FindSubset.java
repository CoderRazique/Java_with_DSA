// Find SubString for a String
public class FindSubset {
    public static void find_Subset(String str, int i, String ans) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        find_Subset(str, i + 1, ans + str.charAt(i));
        find_Subset(str, i + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        find_Subset(str, 0, "");
    }
}
