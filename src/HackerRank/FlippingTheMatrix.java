package HackerRank;
import java.util.*;
public class FlippingTheMatrix {
    // matrix = [[1,2],[3,4]]
    // it is 2 * 2 matrix we want to maximize the top left quadrant, a 1 * 1 matrix. Reverse row 1:
    // [[1,2],[4,3]]
    // And now add reverse column is 0:
    // [[4,2],[1,3]]
    // STDIN  Function
    // -----  --------
    // 1       q = 1
    // 2       n = 2
    // 112 42 83 119  matrix = [[112, 42, 83, 119], [56, 125, 56, 49], [15, 78, 101, 43], [62, 98, 114, 108]]
    // 56 125 56 49
    // 15 78 101 43
    // 62 98 114 108
    // Output = 414

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int n = matrix.size() / 2;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int max = Math.max(matrix.get(i).get(j), matrix.get(i).get(matrix.size() - 1 - j));
                max = Math.max(max, matrix.get(matrix.size() - 1 - i).get(j));
                max = Math.max(max, matrix.get(matrix.size() - 1 - i).get(matrix.size() - 1 - j));
                res += max;
            }
        }
        return res;

    }
}
