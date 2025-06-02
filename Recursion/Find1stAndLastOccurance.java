// Find the 1st & last occurance of an element in string

public class Find1stAndLastOccurance {
    public static int start = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("Start index of " + element + " : " + start);
            System.out.println("Last index of " + element + " : " + last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (start == -1) {
                start = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurance(str, 0, 'a');
    }
}
