package CodeCS;
import java.util.*;
public class ExistIntegerX {
    // You are given an array of integers numbers and two integers left and right. You task is to calculate a boolean array result, where result[i] = true if there exists an integer x, such that numbers[i] = (i + 1) * x and left ≤ x ≤ right. Otherwise, result[i] should be set to false.
    boolean[] solution(int[] numbers, int left, int right) {
        boolean[] res = new boolean[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            for(int j = left; j <= right; j++) {
                if((i + 1) * j == num) {
                    res[i] = true;
                    break;
                }
            }
        }
        return res;



    }
}
