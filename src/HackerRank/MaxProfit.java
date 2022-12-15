package HackerRank;
import java.util.*;
public class MaxProfit {
    public static long stockmax(List<Integer> prices) {
        long maxProfit = 0;
        int max = 0;
        for (int i = prices.size() - 1; i >= 0; i--) {
            if (prices.get(i) > max) {
                max = prices.get(i);
            }
            maxProfit += max - prices.get(i);
        }
        return maxProfit;


    }
}
