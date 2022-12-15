package CodeCS;
import java.util.*;
public class SwapNum {
//    You are given an array of non-negative integers numbers. You are allowed to choose any number from this array and swap any two digits in it. If after the swap operation the number contains leading zeros, they can be omitted and not considered (eg: 010 will be considered just 10).
//
//    Your task is to check whether it is possible to apply the swap operation at most once, so that the elements of the resulting array are strictly increasing.
    boolean solution(int[] numbers) {
        int len = numbers.length;
        for (int i = 0; i < len - 1; i++) {
            if(numbers[i] >= numbers[i + 1]) {
                int[] copy = Arrays.copyOf(numbers, len);
                int[] digits = getDigits(numbers[i]);
                int[] digits2 = getDigits(numbers[i + 1]);
                if(digits.length == 1 || digits2.length == 1) {
                    return false;
                }
                int temp = digits[0];
                digits[0] = digits[1];
                digits[1] = temp;
                int temp2 = digits2[0];
                digits2[0] = digits2[1];
                digits2[1] = temp2;
                int num1 = getNum(digits);
                int num2 = getNum(digits2);
                copy[i] = num1;
                copy[i + 1] = num2;
                if(isIncreasing(copy)) {
                    return true;
                }
            }
        }
        return false;

    }
    int[] getDigits(int num) {
        int[] digits = new int[2];
        int i = 0;
        while(num > 0) {
            digits[i] = num % 10;
            num /= 10;
            i++;
        }
        return digits;
    }
    int getNum(int[] digits) {
        int num = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            num = num * 10 + digits[i];
        }
        return num;
    }
    boolean isIncreasing(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] >= numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
