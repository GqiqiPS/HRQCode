package CodeCS;
import java.util.*;
public class PatternAndSource {
     // You are given two strings - pattern and source. The first string pattern contains only the symbols 0 and 1, and the second string source contains only lowercase English letters.
    // Let's say that pattern matches a substring source[l..r] of source if the following three conditions are met
    //they have equal length,
    //for each 0 in pattern the corresponding letter in the substring is a vowel,
    //for each 1 in pattern the corresponding letter is a consonant.
    //Your task is to calculate the number of substrings of source that match pattern.
    //Example
    //For pattern = "010" and source = "amazing", the output should be
    //patternCount(pattern, source) = 2.
//Here are all the matches:
//amazing
//^ ^ ^
//amazing
//^   ^
//For pattern = "101" and source = "codesignal", the output should between  patternCount(pattern, source) = 0.  //There are no matches at all.


    public int patternAndSource(String pattern, String source) {
        if(pattern.length() > source.length()) {
            return 0;
        }
        if(pattern.length() == source.length()) {
            return 1;
        }

        int count = 0;
        for (int i = 0; i < source.length() - pattern.length() + 1; i++) {
            String sub = source.substring(i, i + pattern.length());
            if (isMatch(pattern, sub)) {
                count++;
            }
        }
        return count;
    }
    private boolean isMatch(String pattern, String sub) {
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == '0') {
                if (!isVowel(sub.charAt(i))) {
                    return false;
                }
            } else {
                if (isVowel(sub.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
