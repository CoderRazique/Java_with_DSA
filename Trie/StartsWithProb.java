// Starts With Problem
// Create a function boolean startsWith(String prefix) for a trie.
// Return true if there is a previously inserted string word that has the prefix,
// and false otherwisw.
// words[] = {"apple", "app", "mango", "man", "woman"}
// prefix = "app"   output : true 
// prefix = "moon" output : false

public class StartsWithProb {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean startWith(String prefix) { // O(L)
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = { "apple", "app", "mango", "man", "woman" };
        String prefix = "man";
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(startWith(prefix));
    }
}
