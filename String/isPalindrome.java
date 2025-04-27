
public class isPalindrome {
    public static boolean isPalindromeStr(String str) {
        int n = str.length() - 1;
        for (int i = 0; i <= n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecare";
        if (isPalindromeStr(str)) {
            System.out.println("Yes '" + str + "' is a palindrom number.");
        } else {
            System.out.println("No '" + str + "' is not a palindrom number.");
        }

    }
}
