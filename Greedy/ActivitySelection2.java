// Activity Selectiong
// You are given n activities with their start and end times.
// Select the maximum number of activities that can be performed by a single person,
// assuming that a person can only work on a single activity at a  time.
// input : 
//  start = [10,12,20]
// end = [20,25,30]
// ans = 2 (A0 & A2)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection2 {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // sorting
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        // lambda function -> shortform

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(activities[0][0]);
        maxAct = 1;
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (lastEnd <= activities[i][1]) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Max activities : " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
