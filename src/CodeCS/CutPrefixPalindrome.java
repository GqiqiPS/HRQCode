package CodeCS;
import java.util.*;
public class CutPrefixPalindrome {
    // You are given a string s. Consider the following algorithm applied to this string:
    //
    //Take all the prefixes of the string, and choose the longest palindrome between them.
    //If this chosen prefix contains at least two characters, cut this prefix from s and go back to the first step with the updated string. Otherwise, end the algorithm with the current string s as a result.
    //Your task is to implement the above algorithm and return its result when applied to string s.
    // For s = "aaacodedoc", the output should be solution(s) = "".
    //
    //The initial string s = "aaacodedoc" contains only three prefixes which are also palindromes - "a", "aa", "aaa". The longest one between them is "aaa", so we cut it from s.
    //Now we have string "codedoc". It contains two prefixes which are also palindromes - "c" and "codedoc". The longest one between them is "codedoc", so we cut it from the current string and obtain the empty string.
    //Finally the algorithm ends on the empty string, so the answer is "".
    //For s = "codesignal", the output should be solution(s) = "codesignal".
    //The initial string s = "codesignal" contains the only prefix, which is also palindrome - "c". This prefix is the longest, but doesn't contain two characters, so the algorithm ends with string "codesignal" as a result.
    //
    //For s = "", the output should be solution(s) = "".
    String solution(String s) {
        StringBuilder sb = new StringBuilder();
        while(s.length() > 0) {
            String prefix = getLongestPalindrome(s);
            if(prefix.length() < 2) {
                sb.append(s);
                break;
            }
            s = s.substring(prefix.length());
        }
        return sb.toString();

    }

    private String getLongestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int maxLen = 0;
        String res = "";
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                if(s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                    if(i - j + 1 > maxLen) {
                        maxLen = i - j + 1;
                        res = s.substring(j, i + 1);
                    }
                }
            }
        }
        return res;
    }
}
