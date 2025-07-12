// Basics operation of ArrayList

import java.util.ArrayList;

public class BasicsOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add element in Array List O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // Get element operation O(1)
        int element = list.get(2);
        System.out.println(element);

        // remove operation O(n)
        list.remove(2);
        System.out.println(list);

        // set element operation O(n)
        list.set(2, 10);
        System.out.println(list);

        // Contains Element O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        // Add element at the Index O(n)
        list.add(1, 9);
        System.out.println(list);

        // Size of a list
        System.out.println(list.size());

        // Print ArrayList from loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
    }
}
