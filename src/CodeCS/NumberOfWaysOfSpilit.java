package CodeCS;
import java.util.*;
public class NumberOfWaysOfSpilit {

    // For s = "xzxzx", the output should be solution(s) = 5.
    //
    //Consider all the ways to split s into three non-empty parts:
    //
    //If a = "x", b = "z" and c = "xzx", then all a + b = "xz", b + c = "zxzx" and c + a = xzxx are different.
    //If a = "x", b = "zx" and c = "zx", then all a + b = "xzx", b + c = "zxzx" and c + a = zxx are different.
    //If a = "x", b = "zxz" and c = "x", then all a + b = "xzxz", b + c = "zxzx" and c + a = xx are different.
    //If a = "xz", b = "x" and c = "zx", then a + b = b + c = "xzx". Hence, this split is not counted.
    //If a = "xz", b = "xz" and c = "x", then all a + b = "xzxz", b + c = "xzx" and c + a = xxz are different.
    //If a = "xzx", b = "z" and c = "x", then all a + b = "xzxz", b + c = "zx" and c + a = xxzx are different.
    //Since there are five valid ways to split s, the answer is 5.
    // You are given a string s. Your task is to count the number of ways of splitting s into three non-empty parts a, b and c (s = a + b + c) in such a way that a + b, b + c and c + a are all different strings.
    int solution(String s) {
        int count = 0;
        int len =s.length();
        for (int i = 1; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                String a = s.substring(0, i);
                String b = s.substring(i, j);
                String c = s.substring(j, len);
                if (!a.equals(b) && !b.equals(c) && !c.equals(a)) {
                    count++;
                }
            }
        }
        return count;


    }

    private boolean isDifferent(String a, String b, String c) {
        return !a.equals(b) && !b.equals(c) && !c.equals(a);
    }


//    private void dfs()
}
