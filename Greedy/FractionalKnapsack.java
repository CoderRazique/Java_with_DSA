// Fractional Knapsack
// Given the weight and values of W items, put these item
// in a Knapsack of capacity W to get the maximum total value in the Knapsack.
// Value = [60,100,120]
// Weight = [10,20,30]
// W = 50
// Ans = 240 kg

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 55;

        double ratio[][] = new double[value.length][2];
        // 0th col => idx, 1th col => ratio
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); // Ascending order

        int capacity = W;
        int finalVal = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) { // include full items
                finalVal += value[idx];
                capacity -= weight[idx];
            } else {
                // include fraction item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("The maximum total value in the Knapsack : " + finalVal);
    }
}
