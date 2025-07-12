//  String compression using string buffer
//  Input : "aaabbcccdd"
// Output : "a3b2c3d2"
// tc = O(n)

public class strCompression {
    public static String strCompress(String str) {
        // String newStr = "";
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            newStr.append(str.charAt(i));
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {

                newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "aaabcccdd";
        System.out.println("Compress string : " + strCompress(str));
    }
}
