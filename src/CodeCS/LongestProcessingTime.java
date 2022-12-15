package CodeCS;
import java.util.*;
public class LongestProcessingTime {
    // Your goal is to optimally distribute a list of jobs between servers within the same farm. Since this problem cannot be solved in polynomial time,
    // you want to implement an approximate solution using the Longest Processing Time (LPT) algorithm.
    // This approach sorts the jobs by their associated processing times in descending order and then assigns them to the server that's going to become available next.
    // If two operations have the same processing time the one with the smaller index is listed first. If there are several servers with the same availability time,
    // then the algorithm assigns the job to the server with the smallest index.
    //
    //Given a list of job processing times, determine how the LPT algorithm will distribute the jobs between the servers within the farm.
    int[][] solution(int[] jobs, int servers) {
        List<Integer> lis = new ArrayList<>();
        for(int i = 0; i < servers; i++) {
            lis.add(0);
        }
        int[][] res = new int[jobs.length][2];
        for(int i = 0; i < jobs.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for(int j = 0; j < servers; j++) {
                if(lis.get(j) < min) {
                    min = lis.get(j);
                    index = j;
                }
            }
            res[i][0] = index;
            res[i][1] = min;
            lis.set(index, min + jobs[i]);
        }
        return res;

    }

}
