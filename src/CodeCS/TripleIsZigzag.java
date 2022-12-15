package CodeCS;
import java.util.*;
public class TripleIsZigzag {
    int[] numbers;
    int[] solution(int[] numbers) {
        // Given an array of integers numbers, your task is to check all the triples of its consecutive elements for being a zigzag. More formally, your task is to construct an array of length numbers.length - 2, where the ith element of the output array equals 1 if the triple (numbers[i], numbers[i + 1], numbers[i + 2]) is a zigzag, and 0 otherwise.
        this.numbers = numbers;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < numbers.length - 2; i++) {
            if (isZigzag(i)) {
                res.add(1);
            } else {
                res.add(0);
            }
        }
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }

    private boolean isZigzag(int i) {
//        return (numbers[i] < numbers[j] && numbers[j] > numbers[k]) || (numbers[i] > numbers[j] && numbers[j] < numbers[k]);
return (numbers[i] < numbers[i + 1] && numbers[i + 1] > numbers[i + 2]) || (numbers[i] > numbers[i + 1] && numbers[i + 1] < numbers[i + 2]);
    }


}
