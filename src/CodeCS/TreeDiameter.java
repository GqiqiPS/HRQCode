package CodeCS;
import java.util.*;
public class TreeDiameter {
    int solution(int n, int[][] tree) {
        if(n == 1) {
            return 0;
        }
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < tree.length; i++) {
            int a = tree[i][0];
            int b = tree[i][1];
            if(!map.containsKey(a)) {
                map.put(a, new ArrayList<>());
            }
            if(!map.containsKey(b)) {
                map.put(b, new ArrayList<>());
            }
            map.get(a).add(b);
            map.get(b).add(a);
        }
        int[] res = new int[1];
        dfs(1, 0, map, res);
        return res[0];

    }
    int dfs(int cur, int pre, HashMap<Integer, List<Integer>> map, int[] res) {
        int max1 = 0;
        int max2 = 0;
        for(int next : map.get(cur)) {
            if(next == pre) {
                continue;
            }
            int len = dfs(next, cur, map, res) + 1;
            if(len > max1) {
                max2 = max1;
                max1 = len;
            } else if(len > max2) {
                max2 = len;
            }
        }
        res[0] = Math.max(res[0], max1 + max2);
        return max1;
    }
}
