package CodeCS;
import java.util.*;
public class Mutation {
    // For each i from 0 to a.length - 1 inclusive, b[i] = a[i - 1] + a[i] + a[i + 1]
    //If some element in the sum a[i - 1] + a[i] + a[i + 1] does not exist, it is considered to be 0
    //For example, b[0] equals 0 + a[0] + a[1]
//For example, b[1] equals a[0] + a[1] + a[2]
//For example, b[2] equals a[1] + a[2] + a[3]
//    For a = [4, 0, 1, -2, 3], the output should be solution(a) = [4, 5, -1, 2, 1].
//
//    Explanation:
//
//    b[0] = 0 + a[0] + a[1] = 0 + 4 + 0 = 4
//    b[1] = a[0] + a[1] + a[2] = 4 + 0 + 1 = 5
//    b[2] = a[1] + a[2] + a[3] = 0 + 1 + (-2) = -1
//    b[3] = a[2] + a[3] + a[4] = 1 + (-2) + 3 = 2
//    b[4] = a[3] + a[4] + 0 = (-2) + 3 + 0 = 1
    public int[] solution(int[] a) {
        int[] b = new int[a.length];
        int[] atemp = new int[a.length + 2];
        atemp[0] = 0;
        atemp[atemp.length - 1] = 0;
        for(int i = 0; i < a.length; i++) {
            atemp[i + 1] = a[i];
        }
        for(int i = 0; i < a.length; i++) {
            b[i] = atemp[i] + atemp[i + 1] + atemp[i + 2];
        }
        return b;
    }

    public static void main(String[] args) {
        Mutation m = new Mutation();
        int[] a = {9};
        int[] b = m.solution(a);
        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
