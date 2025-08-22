// Indian Coins 
// We are given an infinite supply of denominations[1,2,5,10,20,50,100,500,2000].
// Find min no. coins/notes to make change for a value V.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());
        int amount = 590;
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (amount == 0) {
                break;
            }
            if (amount >= coins[i]) {
                while (amount >= coins[i]) {
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Coins/notes used : " + ans);
        System.out.println("Min no. of coins/notes : " + count);
    }
}
