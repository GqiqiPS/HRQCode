package CodeCS;
import java.util.*;
public class LengthOfRobbin {
//    You are given an array of integers a, where each element a[i] represents the length of a ribbon.
//
//    Your goal is to obtain k ribbons of the same length, by cutting the ribbons into as many pieces as you want.
//
//    Your task is to calculate the maximum integer length L for which it is possible to obtain at least k ribbons of length L by cutting the given ones.


    public int lengthOfRobbin(int[] a, int k) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        int left = 0;
        int right = max;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (canCut(a, k, mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;

    }

    private boolean canCut(int[] a, int k, int length) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count += a[i] / length;
        }
        return count >= k;
    }
}
