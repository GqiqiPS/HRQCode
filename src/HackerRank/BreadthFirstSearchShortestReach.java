package HackerRank;
import java.util.*;
public class BreadthFirstSearchShortestReach {
    // Wrong answer
    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (List<Integer> edge : edges) {
            map.get(edge.get(0)).add(edge.get(1));
            map.get(edge.get(1)).add(edge.get(0));
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);
        dist[s] = 0;
        queue.offer(s);
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            for (int next : map.get(cur)) {
                if (dist[next] == -1) {
                    dist[next] = dist[cur] + 1;
                    queue.offer(next);
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (i != s) {
                res.add(dist[i] * 6);
            }
        }
        return res;


    }

    public static void main(String[] args) {
        List<List<Integer>> edges = new ArrayList<>();
        List<Integer> edge1 = new ArrayList<>();
        edge1.add(1);
        edge1.add(2);
        edges.add(edge1);
        List<Integer> edge2 = new ArrayList<>();
        edge2.add(1);
        edge2.add(3);
        edges.add(edge2);
        List<Integer> edge3 = new ArrayList<>();
        edge3.add(3);
        edge3.add(4);
        edges.add(edge3);
        List<Integer> edge4 = new ArrayList<>();
        edge4.add(2);
        edge4.add(4);
        edges.add(edge4);
        System.out.println(bfs(4, 4, edges, 1));
    }

}
