import java.util.ArrayList;
import java.util.Collections;

public class Swap2Num {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println("Before swap : " + list);
        int idx1 = 1, idx2 = 3;
        swap(list, idx1, idx2);
        System.out.println("After swap : " + list);

        // sort list
        Collections.sort(list);
        System.out.println("Sort Assinding Order : " + list);

        // Sort list descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sort descinding : " + list);
    }
}
