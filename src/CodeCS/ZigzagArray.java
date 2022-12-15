package CodeCS;
import  java.util.*;
public class ZigzagArray {
    // Let's say a triple (a, b, c) is a zigzag if either a < b > c or a > b < c.
    //
    //Given an array of integers numbers, your task is to check all the triples of its consecutive elements for being a zigzag. More formally, your task is to construct an array of length numbers.length - 2, where the ith element of the output array equals 1 if the triple (numbers[i], numbers[i + 1], numbers[i + 2]) is a zigzag, and 0 otherwise.
    int[] solution(int[] numbers) {
        int[] res = new int[numbers.length - 2];
        for(int i = 0; i < numbers.length - 2; i++) {
            if((numbers[i] < numbers[i + 1] && numbers[i + 1] > numbers[i + 2]) || (numbers[i] > numbers[i + 1] && numbers[i + 1] < numbers[i + 2])) {
                res[i] = 1;
            }
        }
        return res;
    }
}
