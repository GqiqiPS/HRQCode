package CodeCS;
import java.util.*;
public class DigitAnagrams {
    // Given an array of integers a, your task is to count the number of pairs i and j (where 0 ≤ i < j < a.length), such that a[i] and a[j] are digit anagrams.
    //
    //Two integers are considered to be digit anagrams if they contain the same digits. In other words, one can be obtained from the other by rearranging the digits
    // (or trivially, if the numbers are equal). For example, 54275 and 45572 are digit anagrams, but 321 and 782 are not
    // (since they don't contain the same digits). 220 and 22 are also not considered as digit anagrams, since they don't even have the same number of digits.
    int solution(int[] a) {
        int res = 0;
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(isAnagram(a[i], a[j])) {
                    res++;
                }
            }
        }
        return res;
    }
    boolean isAnagram(int a, int b) {
        if(a == b) {
            return true;
        }
        int[] count = new int[10];
        while(a > 0) {
            count[a % 10]++;
            a /= 10;
        }
        while(b > 0) {
            count[b % 10]--;
            b /= 10;
        }
        for(int i = 0; i < 10; i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
