package CodeCS;
//import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

public class LeftAndRight {
//    You are given an array of integers numbers and two integers left and right. You task is to calculate a boolean array result, where result[i] = true if there exists an integer x, such that numbers[i] = (i + 1) * x and left ≤ x ≤ right. Otherwise, result[i] should be set to false.
    boolean[] solution(int[] numbers, int left, int right) {
        boolean[] result = new boolean[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % (i + 1) == 0) {
                int x = numbers[i] / (i + 1);
                if(x >= left && x <= right) {
                    result[i] = true;
                }
            }
        }
        return result;

    }
}
