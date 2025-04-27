// For a given string convert each the first letter of each word to uppercase.
// Input : "hi,i am abdul razique" 
// Output : "Hi,i Am Abdul Razique"

public class toUpperCase {
    public static String toUpperCas(String str) {
        StringBuffer sb = new StringBuffer("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi,i am abdul razique";
        toUpperCas(str);
        System.out.println(toUpperCas(str));
    }
}
