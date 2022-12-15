package CodeCS;
import java.util.*;
public class Sawtooth {
    // A sawtooth sequence is a sequence of numbers that alternate between increasing and decreasing. In other words, each element is either strictly greater than its neighbouring elements or strictly less than its neighbouring elements.
    // Given an array of integers arr, your task is to count the number of contiguous subarrays that represent a sawtooth sequence of at least two elements.
//    For arr = [9, 8, 7, 6, 5], the output should be solution(arr) = 4.
//
//    Since all the elements are arranged in decreasing order, it won't be possible to form any sawtooth subarrays of length 3 or more. There are 4 possible subarrays containing two elements, so the answer is 4.
//
//    For arr = [10, 10, 10], the output should be solution(arr) = 0.
//
//    Since all of the elements are equal, none of subarrays can be sawtooth, so the answer is 0.
//
//    For arr = [1, 2, 1, 2, 1], the output should be solution(arr) = 10.
//
//    All contiguous subarrays containing at least two elements satisfy the condition of problem. There are 10 possible contiguous subarrays containing at least two elements, so the answer is 10.

    long solution(int[] arr) {
        long count = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int j = i;
            while(j < len - 1 && arr[j] != arr[j + 1]) {
                j++;
            }
            int subLen = j - i + 1;
            if(subLen >= 2) {
                count += (long)subLen * (subLen - 1) / 2;
            }
            i = j;
        }
        return count;




    }
}
