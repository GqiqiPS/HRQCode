package CodeCS;
import java.util.*;
public class NumberOfPairsOfIndices {
    // Given an array of unique integers numbers, your task is to find the number of pairs of indices (i, j) such that i ≤ j and the sum numbers[i] + numbers[j] is equal to some power of 2.
    //
    //Note: numbers 20 = 1, 21 = 2, 22 = 4, 23 = 8, etc. are considered to be powers of 2.
    int solution(int[] numbers) {
        int res = 0;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i; j < numbers.length; j++) {
                if(isPowerOfTwo(numbers[i] + numbers[j])) {
                    res++;
                }
            }
        }
        return res;
    }
    boolean isPowerOfTwo(int num) {
        if(num == 1) {
            return true;
        }
        while(num > 1) {
            if(num % 2 != 0) {
                return false;
            }
            num /= 2;
        }
        return true;
    }
}
