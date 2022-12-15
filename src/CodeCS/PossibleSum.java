package CodeCS;
import java.util.*;
public class PossibleSum {
    // You have a collection of coins, and you know the values of the coins and the quantity of each type of coin in it. You want to know how many distinct sums you can make from non-empty groupings of these coins.
    int possibleSum(int[] coins, int[] quantity) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < coins.length; i++) {
            if (map.containsKey(coins[i])) {
                map.put(coins[i], map.get(coins[i]) + quantity[i]);
            } else {
                map.put(coins[i], quantity[i]);
            }
        }
        for (int key : map.keySet()) {
            res += map.get(key);
        }
        return res;


    }

    private void dfs(int[] cions, int[] quantity, int index, int sum, Set<Integer> set) {
        if (index == cions.length) {
            set.add(sum);
            return;
        }
        for (int i = 0; i <= quantity[index]; i++) {
            dfs(cions, quantity, index + 1, sum + i * cions[index], set);
        }
    }

}
