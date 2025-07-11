// Find Maximum in ArrayList  O(n)

import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            if (max < temp) {
                max = temp;
            }
        }
        System.out.println("Max ELement : " + max);
    }
}
