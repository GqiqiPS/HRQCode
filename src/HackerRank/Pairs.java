package HackerRank;
import java.util.*;
public class Pairs {
    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
//        HashSet<int[]> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            map.put(arr.get(i), i);
        }
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (map.containsKey(arr.get(i) + k)) {
                count++;
            }
            else if (map.containsKey(arr.get(i) - k)) {
                count++;
            }

        }
        return count;

    }

}

