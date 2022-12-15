package CodeCS;
import java.util.*;
public class RemoveDigit {
//    Given two strings s and t, both consisting of lowercase English letters and digits, your task is to calculate how many ways exactly one digit could be removed from one of the strings so that s is lexicographically smaller than t after the removal. Note that we are removing only a single instance of a single digit, rather than all instances (eg: removing 1 from the string a11b1c could result in a1b1c or a11bc, but not abc).
//
//    Also note that digits are considered lexicographically smaller than letters.
    int solution(String s, String t) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                String temp = s.substring(0, i) + s.substring(i + 1);
                if(temp.compareTo(t) < 0) {
                    count++;
                }
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if(Character.isDigit(t.charAt(i))) {
                String temp = t.substring(0, i) + t.substring(i + 1);
                if(s.compareTo(temp) < 0) {
                    count++;
                }
            }
        }
        return count;

    }
}
