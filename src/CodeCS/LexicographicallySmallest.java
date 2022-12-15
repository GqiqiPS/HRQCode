package CodeCS;
import java.util.*;
public class LexicographicallySmallest {
    // You are implementing your own programming language and you've decided to add support for merging strings.
    // A typical merge function would take two strings s1 and s2, and return the lexicographically smallest result
    // that can be obtained by placing the symbols of s2 between the symbols of s1 in such a way that maintains the relative order of the characters in each string.
    //For example, if s1 = "super" and s2 = "tower", the result should be merge(s1, s2) = "stouperwer".
    // You'd like to make your language more unique, so for your merge function, instead of comparing the characters in the usual lexicographical order,
    // you'll compare them based on how many times they occur in their respective initial strings (fewer occurrences means the character is considered smaller).
    // If the number of occurrences are equal, then the characters should be compared in the usual lexicographical way. If both number of occurences and characters are equal,
    // you should take the characters from the first string to the result.
    // Note that occurrences in the initial strings are compared - they do not change over the merge process.
    //Given two strings s1 and s2, return the result of the special merge function you are implementing.
    // For s1 = "dce" and s2 = "cccbd", the output should be
    //solution(s1, s2) = "dcecccbd".
    //All symbols from s1 goes first, because all of them have only 1 occurrence in s1 and c has 3 occurrences in s2.
    String solution(String s1, String s2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s2.length(); i++) {
            count2[s2.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while(i < s1.length() && j < s2.length()) {
            if(count1[s1.charAt(i) - 'a'] < count2[s2.charAt(j) - 'a']) {
                sb.append(s1.charAt(i++));
            } else if(count1[s1.charAt(i) - 'a'] > count2[s2.charAt(j) - 'a']) {
                sb.append(s2.charAt(j++));
            } else {
                if(s1.charAt(i) < s2.charAt(j)) {
                    sb.append(s1.charAt(i++));
                } else {
                    sb.append(s2.charAt(j++));
                }
            }
        }
        while(i < s1.length()) {
            sb.append(s1.charAt(i++));
        }
        while(j < s2.length()) {
            sb.append(s2.charAt(j++));
        }
        return sb.toString();

    }
}
