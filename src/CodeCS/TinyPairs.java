package CodeCS;
import java.util.*;
public class TinyPairs {
    // You are given two arrays of integers a and b of the same length, and an integer k. We will be iterating through array a from left to right, and simultaneously through array b from right to left, and looking at pairs (x, y), where x is from a and y is from b. Such a pair is called tiny if the concatenation xy is strictly less than k.
    //
    //Your task is to return the number of tiny pairs that you'll encounter during the simultaneous iteration through a and b.
    int solution(int[] a, int[] b, int k) {
        int res = 0;
        for(int i = 0; i < a.length; i++) {
            int num = Integer.parseInt(a[i] + "" + b[b.length - 1 - i]);
            if(num < k) {
                res++;
            }
        }
        return res;
    }

}
