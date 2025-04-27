//  String compression
//  Input : "aaabbcccdd"
// Output : "a3b2c3d2"
// tc = O(n)

public class stringCompression {
    public static String strCompress(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.charAt(i);
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println("Compress string : " + strCompress(str));
    }
}
