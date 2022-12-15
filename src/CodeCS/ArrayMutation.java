package CodeCS;
import java.util.*;
// Given an array a, your task is to apply the following mutation to it:
//
//Array a mutates into a new array b of the same length
//For each i from 0 to a.length - 1 inclusive, b[i] = a[i - 1] + a[i] + a[i + 1]
//If some element in the sum a[i - 1] + a[i] + a[i + 1] does not exist, it is considered to be 0
//For example, b[0] equals 0 + a[0] + a[1]
public class ArrayMutation {
    int[] solution(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int left = 0;
            int right = 0;
            if(i - 1 >= 0) {
                left = a[i - 1];
            }
            if(i + 1 < a.length) {
                right = a[i + 1];
            }
            b[i] = left + a[i] + right;
        }
        return b;

    }
}
